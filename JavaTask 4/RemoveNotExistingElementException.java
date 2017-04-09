package Gift.Exceptions;

// An exception thrown if non-existing element should be removed from the array list (by non-existing array index).

public class RemoveNotExistingElementException extends IndexOutOfBoundsException {

    public RemoveNotExistingElementException (String message){
        super(message);
    }
}
