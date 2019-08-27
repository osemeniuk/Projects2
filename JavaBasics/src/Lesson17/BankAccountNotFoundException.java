package Lesson17;

public class BankAccountNotFoundException extends RuntimeException {
    public BankAccountNotFoundException(String message){
        super(message);
    }
}
