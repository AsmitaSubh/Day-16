public class BinarySearch {
        public static int binarySearch(int[] arr, int target) {
            int low = 0;
            int high = arr.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (arr[mid] == target) {
                    return mid;  // Return the index where the target element is found
                } else if (arr[mid] < target) {
                    low = mid + 1;  // Discard the left half of the array
                } else {
                    high = mid - 1;  // Discard the right half of the array
                }
            }

            return -1;  // Return -1 if the target element is not found
        }

        public static void main(String[] args) {
            int[] arr = {1, 3, 5, 7, 10, 15, 20};
            int target = 10;

            int index = binarySearch(arr, target);
            if (index != -1) {
                System.out.println("Element " + target + " found at index " + index);
            } else {
                System.out.println("Element " + target + " not found in the array");
            }
        }
    }


