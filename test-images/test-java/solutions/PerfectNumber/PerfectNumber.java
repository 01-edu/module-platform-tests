public class PerfectNumber {
    public boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }
        
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                if (i == number / i) {
                    sum += i;
                } else {
                    sum += i + number / i;
                }
            }
        }
        
        return sum == number;
    }
}
