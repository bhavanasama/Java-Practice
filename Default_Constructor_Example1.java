public class Default_Constructor_Example1 {
    int id;
    String name;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Default_Constructor_Example1 obj = new Default_Constructor_Example1();
        obj.display();
    }
}