package day61_exceptions;

public class BreakTimeException extends RuntimeException {
    public BreakTimeException() {
    }

    public BreakTimeException(String message) {
        super(message); //call to parent class constructor
    }
}
