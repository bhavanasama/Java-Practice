//accessing instance method from instance method using object reference and method name directly within same class.

public class Scenario6 {
    
    public static void main(String[] args) {
        System.out.println("This is Scenario6 main method.");
        Scenario6 obj6 = new Scenario6();
        staticMethod6(); // calling static method from same class using method name directly
        obj6.instanceMethod6(); // calling instance method from same class using object reference
    }

    public static void staticMethod6() {
        System.out.println("This is a static method in Scenario6.");
    }

    public void instanceMethod6() {
        System.out.println("This is an instance method in Scenario6.");
        Scenario6 obj602 = new Scenario6();
        obj602.instanceMethod602(); // calling another instance method from instance method using object reference
        instanceMethod602(); // calling another instance method from instance method using method name directly
        Scenario5 obj502 = new Scenario5();
        obj502.instanceMethod5(); // calling instance method from another class using object reference
        //instanceMethod5(); // calling instance method from another class using method name directly - will give error
        // Error : 
        // Scenario6.java: twenty-eight: error: cannot find symbol
    }
    public void instanceMethod602() {
        System.out.println("This is another instance method in Scenario6.");
    }
}
