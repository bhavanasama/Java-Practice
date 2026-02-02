public class Final_Local_Variable {
    public String name = "Alice"; // Non-final local variable
    public int age = 28; // Non-final local variable
    public static void main(String[] args) {
        final int b = 25; // Final local variable
        System.out.println("Initial value of final local variable b: " + b);
        // b = 30; // Reassignment this would cause a compilation error

        final Final_Local_Variable flv = new Final_Local_Variable();
       // flv = new Final_Local_Variable(); // Reassignment this would cause a compilation error
        System.out.println("Name: " + flv.name + ", Age: " + flv.age);
        flv.name = "Bob"; // Modifying internal state is allowed
        flv.age = 35; // Modifying internal state is allowed
        System.out.println("Modified Name: " + flv.name + ", Modified Age: " + flv.age);


    }
}
