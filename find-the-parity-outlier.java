public class FindOutlier {
    public static int find(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;
        int lastEven = 0;
        int lastOdd = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
                lastEven = num;
            } else {
                oddCount++;
                lastOdd = num;
            }
        }

        if (evenCount == 1) {
            return lastEven;
        } else {
            return lastOdd;
        }
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {2, 4, 0, 100, 8, 10, 6, 7}; // The outlier is 7
        int[] arr2 = {17, 34, 6, 8, 10, 12, 4};   // The outlier is 17

        System.out.println(find(arr1)); // Output: 7
        System.out.println(find(arr2)); // Output: 17
    }
}
