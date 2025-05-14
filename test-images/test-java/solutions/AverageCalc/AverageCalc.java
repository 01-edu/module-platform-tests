public class AverageCalc {
    public static int average(int start, int end, int step) {
        
        int sum = 0;
        int count = 0;

        if(step == 0)
            return 0;
        for (int i = start; (step > 0 && i <= end) || (step < 0 && i >= end); i += step) {
            sum += i;
            count++;
        }
        
        return sum / count;
    }
}
