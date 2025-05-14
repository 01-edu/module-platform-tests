import java.util.List;
import java.util.ArrayList;

public class ListSearchIndex {

    public static Integer findLastIndex(List<Integer> list, Integer element) {
        if (list == null)
            return null;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals(element)) {
                return i;
            }
        }
        return null;
    }

    public static Integer findFirstIndex(List<Integer> list, Integer element) {
        if (list == null)
            return null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(element)) {
                return i;
            }
        }
        return null;
    }

    public static List<Integer> findAllIndexes(List<Integer> list, Integer element) {

        List<Integer> indexes = new ArrayList<>();
        if (list == null)
            return indexes;
            
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(element)) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    
    // public static void main(String[] args) {
    //     List<Integer> numbers = List.of(5, 2, 4, 2, 7, 4, 8, 9, 2);

    //     // Find last index
    //     Integer lastIndex = findLastIndex(numbers, 2);
    //     System.out.println("Last Index of 2: " + lastIndex);

    //     // Find first index
    //     Integer firstIndex = findFirstIndex(numbers, 4);
    //     System.out.println("First Index of 4: " + firstIndex);

    //     // Find all indexes
    //     List<Integer> allIndexes = findAllIndexes(numbers, 2);
    //     System.out.println("All Indexes of 2: " + allIndexes);
    // }
}
