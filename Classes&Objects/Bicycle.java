//package Classes&Objects;

public class Bicycle {
   int wheels = 2;
   String color = "Red";
   
   public Bicycle(){ //non parameterized constructor
    System.out.println("A new bicycle object has been created!");
   }



   public void displayInfo() {
       System.out.println("Bicycle color: " + color);
       System.out.println("Number of wheels: " + wheels);
}

    public static void main(String[] args) {
        // creating an object within the same class
        Bicycle myBike2 = new Bicycle();
        System.out.println("Wheels : " + myBike2.wheels); // accessing attribute
        myBike2.displayInfo(); // accessing method

        Bicycle myBike3 = new Bicycle();
        myBike3.color = "Blue";  // modifying attribute
        myBike3.displayInfo();
    }
}
