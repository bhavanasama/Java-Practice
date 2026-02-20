//Explicit Default Constructor is said as Non-Parameterized Constructor. 
// It is a constructor which does not have any parameters. It is used to initialize the instance variables with default values. 
// If we do not provide any constructor in the class, then the Java compiler automatically provides a default constructor. 
// However, if we provide any constructor (parameterized or non-parameterized), then the Java compiler does not provide a default constructor.

public class Explicit_DC_Example2 {
    int x;
    String y;
    Explicit_DC_Example2() {
        System.out.println("This is an explicit default constructor.");
    }
    void display() {
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
    }
    public static void main(String[] args) {
        Explicit_DC_Example2 obj = new Explicit_DC_Example2();
        obj.display();
    }
}

