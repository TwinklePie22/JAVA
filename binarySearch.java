package JAVA_INTERNAL;

public class binarySearchp7 {
        public static void main(String[] args) {
            int[] sortedArray = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
            int target = 12;

            int index = binarySearch(sortedArray, target);

            if (index != -1) {
                System.out.println("Target element " + target + " found at index " + index);
            } else {
                System.out.println("Target element " + target + " not found in the array.");
            }
        }

        private static int binarySearch(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return -1; // Target not found
        }
    }


