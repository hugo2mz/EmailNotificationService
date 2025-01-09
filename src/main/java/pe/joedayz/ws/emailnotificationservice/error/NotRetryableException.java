package pe.joedayz.ws.emailnotificationservice.error;

/**
 * @author josediaz
 **/
public class NotRetryableException extends RuntimeException {

  public NotRetryableException(String message) {
  }

  public NotRetryableException(Throwable cause) {
    super(cause);
  }
}
