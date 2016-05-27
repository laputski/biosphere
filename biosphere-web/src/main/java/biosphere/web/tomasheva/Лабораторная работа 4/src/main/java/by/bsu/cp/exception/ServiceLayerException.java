package by.bsu.cp.exception;

/**
 * Created by Elisaveta on 5/27/2016.
 */
public class ServiceLayerException extends Exception {
    public ServiceLayerException(Throwable cause) {
        super(cause);
    }

    public ServiceLayerException(String message, Throwable cause) {
        super(message, cause);
    }
}
