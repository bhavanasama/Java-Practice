
public class DecisionMaking {

    public static void main(String[] args) {

        // 1. if statement
        int age = 18;
        if (age >= 18) {
            System.out.println("1) Eligible to vote");
        }

        // 2. if-else statement
        int number = 7;
        if (number % 2 == 0) {
            System.out.println("2) Even number");
        } else {
            System.out.println("2) Odd number");
        }

        // 3. else-if ladder
        int marks = 82;
        if (marks >= 90) {
            System.out.println("3) Grade A");
        } else if (marks >= 75) {
            System.out.println("3) Grade B");
        } else if (marks >= 50) {
            System.out.println("3) Grade C");
        } else {
            System.out.println("3) Fail");
        }

        // 4. Nested if
        boolean hasID = true;
        int userAge = 20;
        if (userAge >= 18) {
            if (hasID) {
                System.out.println("4) Entry allowed");
            } else {
                System.out.println("4) ID required");
            }
        } else {
            System.out.println("4) Underage");
        }

        // 5. switch statement
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("5) Monday");
                break;
            case 2:
                System.out.println("5) Tuesday");
                break;
            case 3:
                System.out.println("5) Wednesday");
                break;
            default:
                System.out.println("5) Invalid day");
        }

        // 6. Ternary operator
        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("6) Maximum value is: " + max);
    }
}

