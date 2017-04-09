package Gift.Exceptions;
import java.io.IOException;

// An exception thrown if the file for reading is unavailable or doesn't exist.

public class FileDoesNotExistException extends IOException {

    public FileDoesNotExistException() {
    }

    public FileDoesNotExistException(String message) {
        super(message);
    }

    public FileDoesNotExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
