import java.util.*;

class TopFrequents {

    private static class ElementFrequency {
        int element;
        int frequency;
        int firstIndex;

        public ElementFrequency(int element, int frequency, int firstIndex) {
            this.element = element;
            this.frequency = frequency;
            this.firstIndex = firstIndex;
        }
    }
    
    public List<Integer> findTopKFrequent(int[] nums, int k) {
        Map<Integer, ElementFrequency> freqMap = new HashMap<>();
        
        // Populate the frequency map with frequency and first index occurrences
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int index = i;
            freqMap.computeIfAbsent(num, key -> new ElementFrequency(num, 0, index));
            freqMap.get(num).frequency++;
        }

        // Priority Queue to sort by frequency, and in case of tie, by earliest occurrence
        PriorityQueue<ElementFrequency> maxHeap = new PriorityQueue<>(
            (a, b) -> a.frequency == b.frequency ? Integer.compare(a.firstIndex, b.firstIndex) : Integer.compare(b.frequency, a.frequency)
        );
        maxHeap.addAll(freqMap.values());

        // Extract the top k frequent elements based on the criteria
        List<Integer> topKFrequent = new ArrayList<>();
        for (int i = 0; i < k && !maxHeap.isEmpty(); i++) {
            topKFrequent.add(maxHeap.poll().element);
        }

        return topKFrequent;
    }
}
