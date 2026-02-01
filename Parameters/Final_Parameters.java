public class Final_Parameters {


    int y = 30;


    public void reassign(final int x){
        System.out.println("x : " + x);
        // x = 20; // Reassignment this would cause a compilation error

    }

    public void increment(final int x){
        System.out.println("x : " + x);
        // x = x + 1; // Incrementing/Modifying this would cause a compilation error
    }

    public void final_object(final Final_Parameters obj){
        System.out.println("obj.y : " + obj.y);
        obj.y = 325; // Modifying the object's internal state is allowed
        System.out.println("Modified obj.y : " + obj.y);
        // obj = new Final_Parameters(); // Reassignment this would cause a compilation error
    }

    public static void main(String[] args) {
        Final_Parameters obj = new Final_Parameters();
        int x = 10;
        obj.reassign(x);
        obj.increment(x);
        obj.final_object(obj);

    }
}