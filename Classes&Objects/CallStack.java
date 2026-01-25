//Method Call Stack : showing how methods are called and executed in a stack manner.
//follows a LIFO (Last In First Out) structure.

public class CallStack {
    public static void main(String[] args) {
        firstMethod();
        fourthMethod();
    }

    public static void firstMethod() {
        System.out.println("Inside firstMethod");
        secondMethod();
       
    }

    public static void secondMethod() {
        System.out.println("Inside secondMethod");
        thirdMethod();
    }

    public static void thirdMethod() {
        System.out.println("Inside thirdMethod");
    }

    public static void fourthMethod() {
        System.out.println("Inside fourthMethod");
    }
}
