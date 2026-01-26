// accessing static method from another class using object name in instance method and static method.
public class Scenario4 {

     public static void staticMethod4() {
        System.out.println("This is a static method in Scenario4.");
    }

    public static void main(String[] args) {
        System.out.println("This is Scenario4 main method.");
        Scenario4 obj4 = new Scenario4();
        Scenario2 obj2 = new Scenario2();
        obj4.instanceMethod4();
        obj4.staticMethod4();  // calling static method from same class using object name
        obj2.staticMethod2(); // calling static method from another class using object name
    }

    public void instanceMethod4() {
        System.out.println("This is an instance method in Scenario4.");
        Scenario4 obj5 = new Scenario4();
        obj5.staticMethod4();  // calling static method from same class using object name
        Scenario2 obj6 = new Scenario2();
        obj6.staticMethod2(); // calling static method from another class using object name
    }
}