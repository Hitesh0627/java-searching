class FirstLastOccurrence {
    // Method to find the first occurrence of target in a sorted array
    public static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1, first = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                first = mid; // Potential first occurrence found
                right = mid - 1; // Search in the left half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    // Method to find the last occurrence of target in a sorted array
    public static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1, last = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                last = mid; // Potential last occurrence found
                left = mid + 1; // Search in the right half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }

    // Method to find the first and last occurrence of target in an array
    public static int[] findFirstAndLast(int[] arr, int target) {
        int first = findFirst(arr, target);
        int last = findLast(arr, target);
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 6, 8, 10};
        int target = 4;
        int[] result = findFirstAndLast(arr, target);
        System.out.println("First occurrence: " + result[0] + ", Last occurrence: " + result[1]);
    }
}
/*
First occurrence: 1, Last occurrence: 3
 */