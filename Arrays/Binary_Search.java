public class Binary_Search {
    public static void main(String[] args) {
        // Primitive array (must be sorted for binary search)
        int[] numbers = {1, 3, 4, 6, 8};
        int target = 8;
        boolean found = binarySearch(numbers, target);

        if (found) {
            System.out.println("Primitive Array: Element " + target + " found.");
        } else {
            System.out.println("Primitive Array: Element " + target + " not found.");
        }

        // Non-primitive array (String objects must also be sorted)
        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};
        String searchFruit = "Orange";
        found = binarySearch(fruits, searchFruit);

        if (found) {
            System.out.println("Non-Primitive Array: Element \"" + searchFruit + "\" found.");
        } else {
            System.out.println("Non-Primitive Array: Element \"" + searchFruit + "\" not found.");
        }
    }

    // Binary search for primitive array
    public static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    // Binary search for non-primitive array (String)
    public static boolean binarySearch(String[] arr, String target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = arr[mid].compareTo(target);

            if (comparison == 0) {
                return true;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
