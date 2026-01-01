public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));          // +
        System.out.println("Subtraction: " + (a - b));       // -
        System.out.println("Multiplication: " + (a * b));    // *
        System.out.println("Division: " + (a / b));          // /
        System.out.println("Modulus: " + (a % b));           // %

        // Assignment Operators
        int c = a;                                         // =
        c += b;                                            // +=
        System.out.println("c after += : " + c);
        c -= b;                                            // -=
        System.out.println("c after -= : " + c);
        c *= b;                                            // *=
        System.out.println("c after *= : " + c);
        c /= b;                                            // /=
        System.out.println("c after /= : " + c);
        c %= b;                                            // %=
        System.out.println("c after %= : " + c);

        // Comparison Operators
        System.out.println("a == b: " + (a == b));       // ==
        System.out.println("a != b: " + (a != b));       // !=
        System.out.println("a > b: " + (a > b));         // >
        System.out.println("a < b: " + (a < b));         // <
        System.out.println("a >= b: " + (a >= b));       // >=
        System.out.println("a <= b: " + (a <= b));       // <=

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));       // &&
        System.out.println("x || y: " + (x || y));       // ||
        System.out.println("!x: " + (!x));                 // !

        // Increment and Decrement Operators
        int d = 5;
        System.out.println("d: " + d);
        System.out.println("Post-increment d++: " + (d++)); // Post
        System.out.println("After Post-increment d: " + d);
        d = 5; // reset 
        System.out.println("Pre-increment ++d: " + (++d));  // Pre
        d = 5; // reset
        System.out.println("Post-decrement d--: " + (d--)); // Post
        System.out.println("After Post-decrement d: " + d);     
        d = 5; // reset
        System.out.println("Pre-decrement --d: " + (--d));  // Pre

        // Bitwise Operators

        int e = 6;  // 110 in binary
        int f = 3;  // 011 in binary
        System.out.println("e & f: " + (e & f));         // AND
        System.out.println("e | f: " + (e | f));         // OR
        System.out.println("e ^ f: " + (e ^ f));         // XOR 
        System.out.println("~e: " + (~e));               // NOT
        System.out.println("e << 1: " + (e << 1));       // Left shift
        System.out.println("e >> 1: " + (e >> 1));       // Right shift

        // Ternary Operator
        int g = (a > b) ? a : b;
        System.out.println("Ternary Operator (max of a and b): " + g);

        //Relational Operators
        System.out.println("a is greater than b: " + (a > b)); // >
        System.out.println("a is less than b: " + (a < b)); // <
        System.out.println("a is greater than or equal to b: " + (a >= b)); // >=
        System.out.println("a is less than or equal to b: " + (a <= b)); // <=
        System.out.println("a is not equal to b: " + (a != b)); // !=

    }
}
