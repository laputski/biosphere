package biosphere.web.filippovich.lb4.src.main.java.by.bsu.cp.exception;

/**
 * Created by Dmitry on 5/27/2016.
 */
public class ServiceLayerException extends Exception {
    public ServiceLayerException(Throwable cause) {
        super(cause);
    }

    public ServiceLayerException(String message, Throwable cause) {
        super(message, cause);
    }
}
