//accessing instance and static variables inside static and non-static methods
public class Scenario7 {
    static int a = 19; // static variable

    int b = 20; // instance variable

    public void nonstaticMethod(){
        System.out.println("Non-static method called");
        System.out.println("a: " + a); // Accessing static variable
        System.out.println("b: " + b); // Accessing instance variable
    } 

    public static void staticMethod(){
        System.out.println("Static method called");
        System.out.println("a: " + a); // Accessing static variable
     //   System.out.println("b: " + b); // This would cause an error because static methods cannot access instance variables directly

        //Error : 
      //  Scenario7.java:15: error: non-static variable b cannot be referenced from a static context
    }

    public static void main(String[] args) {
        Scenario7 obj = new Scenario7();
        obj.nonstaticMethod(); // Calling non-static method using object
        staticMethod(); // Calling static method directly
    }
}
