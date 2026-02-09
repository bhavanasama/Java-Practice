//performs a deep copy of an object, which means that it creates a new object in memory and copies the values of the original object's fields to the new object.
// Any changes made to the new object will not affect the original object since they are two separate objects in memory.
class College{
    String collegeName;
}

public class Deep_Copy {
    public static void main(String[] args) {
        College c1 = new College();
        c1.collegeName = "ABC College";
        System.out.println("College 1 name: " + c1.collegeName); //Output: ABC College

        College c2 = new College(); //creates a new object reference c2 that points to a different object in memory (deep copy)
        c2.collegeName = c1.collegeName; //copying the value of collegeName from c1 to c2
        c2.collegeName = "XYZ University"; //modifying the collegeName through c2 will not affect the collegeName of c1 since c1 and c2 point to different objects in memory
        System.out.println("College 1 name: " + c1.collegeName); //Output: ABC College
        System.out.println("College 2 name: " + c2.collegeName); //Output: XYZ University
    }
    
}
