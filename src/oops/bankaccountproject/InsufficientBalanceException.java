package oops.bankaccountproject;

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException() {
        super("Insufficient Balance");
    }
public InsufficientBalanceException(int amount) { 
        super("Insufficient Balance. Cannot withdraw " + amount);
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }
    
    

}
