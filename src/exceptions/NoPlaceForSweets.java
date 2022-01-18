package exceptions;

public class NoPlaceForSweets extends RuntimeException {
    public NoPlaceForSweets(String message) {
        super(message);
    }
}