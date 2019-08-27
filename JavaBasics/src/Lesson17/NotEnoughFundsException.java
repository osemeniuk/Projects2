package Lesson17;

public class NotEnoughFundsException extends RuntimeException {

    public NotEnoughFundsException(String message) {
        super(message);
    }
}