import java.util.Arrays;

class SearchAlgorithms {
    // Method to find the first missing positive integer using Linear Search
    public static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;

        // Marking visited elements using index mapping
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }

        // Finding the first missing positive
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    // Method to perform Binary Search for a target index
    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr); // Sorting the array first
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; // Return index if target is found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int missing = findFirstMissingPositive(arr);
        System.out.println("First missing positive integer: " + missing);

        int[] sortedArr = {2, 3, 4, 10, 40};
        int target = 10;
        int index = binarySearch(sortedArr, target);
        System.out.println("Target " + target + " found at index: " + index);
    }
}
/*
First missing positive integer: 2
Target 10 found at index: 3
 */