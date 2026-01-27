public class Setter_Method {
    private int balance = 100;

    // Mutator method (setter)
    public void setBalance(int amount)
    {
        balance += amount;
    }
    
    public int getBalance() { return balance; }


    public static void main(String[] args) {
        Setter_Method obj = new Setter_Method();
        obj.setBalance(50); // Accessing private method within the same class using setter method(the method which modifies private members is called setter method)    
        System.out.println("Balance: " + obj.getBalance()); // Calling getter

    }
}


