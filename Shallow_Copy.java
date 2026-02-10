//performs a shallow copy of an object, which means that it creates a new reference to the same object in memory.
// Any changes made to the object through one reference will affect the other reference since they both point to the same object.
class Address{
    String city;
}

public class Shallow_Copy {
    public static void main(String[] args) {
        Address a1 = new Address();
        a1.city = "New York";
        System.out.println("Address 1 city: " + a1.city); //Output: New York

        Address a2 = a1; //creates a new object reference a2 that points to the same object as a1(shallow copy)
        a2.city = "Los Angeles"; //modifying the city through a2 will also modify the city of a1 since both a1 and a2 point to the same object
        System.out.println("Address 1 city: " + a1.city); //Output: Los Angeles
        System.out.println("Address 2 city: " + a2.city); //Output: Los Angeles
    }
    
}
