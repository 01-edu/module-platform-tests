
public class RotateArray {
    public static Integer[] rotate(Integer[] arr, int rotationCount) {
        if (arr == null || arr.length == 0 || rotationCount == 0) {
            return arr;
        }
        
        int n = arr.length;
        rotationCount = rotationCount % n; // Adjust rotationCount to avoid unnecessary rotations
        
        if (rotationCount < 0) {
            rotationCount = n + rotationCount; // Convert negative rotationCount to positive
        }
        
        Integer[] rotatedArray = new Integer[n];
        
        for (int i = 0; i < n; i++) {
            int newPosition = (i + rotationCount) % n;
            rotatedArray[newPosition] = arr[i];
        }
        
        return rotatedArray;
    }
}
