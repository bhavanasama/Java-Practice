// accessing static method from instance method using class name.


public class Scenario3 {
    public static void main(String[] args) {
        System.out.println("This is Scenario3 main method.");
        Scenario3 obj3 = new Scenario3();
        obj3.instanceMethod3();
        
    }

    public void instanceMethod3() {
        System.out.println("This is an instance method in Scenario3.");
        Scenario3.staticMethod3();  // calling static method from same class using class name
        Scenario2.staticMethod2(); // calling static method from another class using class name
    }

    public static void staticMethod3() {
        System.out.println("This is a static method in Scenario3.");
    }

}
