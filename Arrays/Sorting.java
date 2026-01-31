public class Sorting {
    public static void main(String[] args) {
        // Primitive array
        int[] numbers = {5, 2, 8, 1, 4};
        int n = numbers.length;

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // swap numbers[j] and numbers[j+1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Primitive Array -> ");
        for (int i = 0; i < n; i++)
            System.out.print(numbers[i] + " ");

        System.out.println();

        // Non-primitive array (String objects)
        String[] fruits = {"Banana", "Apple", "Orange", "Mango"};

        // Simple selection sort for strings
        for (int i = 0; i < fruits.length - 1; i++) {
            for (int j = i + 1; j < fruits.length; j++) {
                if (fruits[i].compareTo(fruits[j]) > 0) {
                    // swap fruits[i] and fruits[j]
                    String temp = fruits[i];
                    fruits[i] = fruits[j];
                    fruits[j] = temp;
                }
            }
        }

        System.out.print("Sorted Non-Primitive Array -> ");
        for (int i = 0; i < fruits.length; i++)
            System.out.print(fruits[i] + " ");
    }
}
