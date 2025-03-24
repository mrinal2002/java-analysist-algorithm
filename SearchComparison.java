public class SearchComparison {
    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i; // Return index if found
        }
        return -1; // Not found
    }

    // Binary Search (Assumes array is sorted)
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid; // Found
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;

        System.out.println("Linear Search: " + linearSearch(arr, target)); // O(N)
        System.out.println("Binary Search: " + binarySearch(arr, target)); // O(log N)
    }
}