// creating an anonymous object
public class Anonymous {
   String name;
    int age;
    
    public Anonymous(String name , int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }


    public static void main(String[] args) {
        // Creating and using an anonymous object
        new Anonymous("Alice", 30).display();
        new Anonymous("Bob", 25).display();
    }
}
