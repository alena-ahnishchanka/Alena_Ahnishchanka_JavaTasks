package Gift.Exceptions;

// An exception thrown if the candy name is null.

public class NullCandyNameException extends Exception {

    public NullCandyNameException (String message){
        super(message);
    }

    public NullCandyNameException (String message, Throwable cause){
        super(message, cause);
    }
}
