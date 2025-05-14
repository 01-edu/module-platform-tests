
public class ReverseArray {
    public static Integer[] reverse(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
        return arr;
    }
}
