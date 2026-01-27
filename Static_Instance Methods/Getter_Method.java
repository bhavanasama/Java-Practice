public class Getter_Method {
    private String CollageName = "ABC Institute";
    private int CollageId = 12345;

    private String branch = "Computer Science";

    
    public String getCollageDetails() {
        return "Collage Name: " + CollageName + ", Collage ID: " + CollageId;
    }

    public static void main(String[] args) {
        Getter_Method obj = new Getter_Method();
        System.out.println("Branch: " + obj.branch); // Direct access to private variable within the same class
        System.out.println(obj.getCollageDetails());    // Accessing private method within the same class using getter method(the method which accesses private members is called getter method)
    }
}
