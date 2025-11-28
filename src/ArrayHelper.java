/**
 * Helper class for array operations.
 * Contains 2 bugs for you to find and fix!
 */
public class ArrayHelper {
    
    /**
     * Find the maximum value in an array
     */
    public int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        // BUG #5: Starting with 0 fails for arrays with all negative numbers
        int max = 0;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
    /**
     * Find the minimum value in an array
     */
    public int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    
    /**
     * Calculate the sum of all elements
     */
    public int sum(int[] arr) {
        if (arr == null) return 0;
        
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }
    
    /**
     * Calculate the average of all elements
     */
    public double average(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        
        // BUG #6: Integer division - should cast to double before dividing
        return sum(arr) / arr.length;
    }
    
    /**
     * Check if array contains a specific value
     */
    public boolean contains(int[] arr, int value) {
        if (arr == null) return false;
        
        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}
