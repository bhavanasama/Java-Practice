// accessing static variable and method from instance method using method name directly.
//import static Scenario2.staticMethod2;
public class Scenario1 {
    static int a = 10;
    public static void staticMethod(){
        System.out.println("This is a static method.");
    }

    public void instanceMethod(){
        System.out.println("This is an instance method.");
        System.out.println("Value of static variable a: " + a);
        // calling static method from instance method

        staticMethod();  // internally resolves it as Scenario1.staticMethod()
        
        //staticMethod2(); // calling static method from another class gives error because it's not in the same class.
        /*
        Error : 
        Scenario1.java:13: error: cannot find symbol
                staticMethod2(); // calling static method from another class gives error because it's not in the same class.
                ^
        symbol:   method staticMethod2()
        location: class Scenario1
        */

      //  staticMethod2(); // calling static method from another class using import static
        // to run this code, 
        //javac Scenario2.java   -- need to compile Scenario2 first as it is being used here.
        //javac Scenario1.java -- then compile Scenario1
        //java Scenario1 -- then run Scenario1

    }

    public static void main(String[] args) {
        Scenario1 obj = new Scenario1();
        obj.instanceMethod();
    }
}
