package CustomException;

public class InvalidPersonNameException extends Exception {
    public InvalidPersonNameException(String message) {
        super(message);
    }
}
