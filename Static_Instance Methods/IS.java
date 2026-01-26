
// Program to demonstrate static and instance methods.
public class IS {

    public static void staticMethod(){
        System.out.println("This is a static method.");
    }

    public void instanceMethod(){
        System.out.println("This is an instance method.");
    }   

    //This is main method which is also static.
    // we can call static method directly inside main method.
    // but to call instance method we need to create object of class.

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        staticMethod();
        IS obj = new IS();
        obj.instanceMethod();
    }
}
