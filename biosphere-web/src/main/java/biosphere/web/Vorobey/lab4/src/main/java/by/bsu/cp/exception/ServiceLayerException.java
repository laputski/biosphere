package biosphere.web.Vorobey.lab4.src.main.java.by.bsu.cp.exception;

/**
 * Created by Vlad on 5/27/2016.
 */
public class ServiceLayerException extends Exception {
    public ServiceLayerException(Throwable cause) {
        super(cause);
    }

    public ServiceLayerException(String message, Throwable cause) {
        super(message, cause);
    }
}
