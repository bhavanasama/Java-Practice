public class Searching {
    public static void main(String[] args) {
        // Primitive array
        int[] numbers = {3, 6, 1, 8, 4};
        int target = 8;
        boolean found = false;

        // Linear Search
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Primitive Array: Element " + target + " found.");
        } else {
            System.out.println("Primitive Array: Element " + target + " not found.");
        }

        // Non-primitive array (String objects)
        String[] fruits = {"Banana", "Apple", "Orange", "Mango"};
        String searchFruit = "Orange";
        found = false;

        // Linear Search for strings
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(searchFruit)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Non-Primitive Array: Element \"" + searchFruit + "\" found.");
        } else {
            System.out.println("Non-Primitive Array: Element \"" + searchFruit + "\" not found.");
        }
    }
}
