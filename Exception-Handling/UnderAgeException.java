import javax.management.remote.JMXServerErrorException;

public class UnderAgeException extends Exception{
    public UnderAgeException(String message) {
        super(message);
    }
}
