public class Local_Variables {
    public void  method_a(){
        int a = 15; // Local variable
        System.out.println("Value of a inside method_a: " + a);
    }

    public void method_b(){
       // System.out.println("value of a inside method_b: " + a); 
        // This will cause a compilation error
    }
    public static void main(String[] args) {
        int a = 5; // Local variable
        System.out.println("Initial value of a: " + a);
        a = 10; // Reassignment is allowed
        System.out.println("Reassigned value of a: " + a);

        Local_Variables lv = new Local_Variables();
        lv.method_a();
    }
}
