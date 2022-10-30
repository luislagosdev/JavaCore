package abstractclasses;

abstract class BankAccount {

    public abstract String getName();   //abstract method, no body implementation

    public void printName(){            // non-abstract method in an abstract class is allowed.
        System.out.println("Your name is: " +  getName());
    }
} // class BankAccount

public class AccountInfo extends BankAccount {
    @Override
    public String getName() {       // abstract method is overriden
        return "Jesus";
    }

    public static void main(String[] args) {
        new AccountInfo().printName();      // Your name is: Jesus
    } // main
} // class
