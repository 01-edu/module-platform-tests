
public class ComputeArray {
    
    public static int[] computeArray(int[] arr) {

        if (arr == null)
            return null;
            
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                result[i] = arr[i] * 5;
            } else if (arr[i] % 3 == 1) {
                result[i] = arr[i] + 7;
            } else {
                result[i] = arr[i];
            }
        }

        return result;
    }

}
