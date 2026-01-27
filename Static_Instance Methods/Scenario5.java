
// accessing instance method from static method using object reference from within same class and another class.
public class Scenario5 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        staticMethod5();
    }

    public static void staticMethod5() {

        System.out.println("This is a static method in Scenario5.");
        Scenario5 obj501 = new Scenario5();
        obj501.instanceMethod5(); // calling instance method from static method using object reference within the same class.
        Scenario2 obj502 = new Scenario2();
        obj502.instanceMethod2(); // calling instance method from static method using object reference from another class.
        //instanceMethod5();  // This line will cause a compile-time error
        //Error : 
        //Scenario5.java:6: error: non-static method instanceMethod5() cannot be referenced from a static context
    }
    public void instanceMethod5() {
        System.out.println("This is an instance method in Scenario5.");
    }
}
