package pe.joedayz.ws.emailnotificationservice.error;

/**
 * @author josediaz
 **/
public class RetryableException extends RuntimeException{

  public RetryableException(String message) {
    super(message);
  }

  public RetryableException(Throwable cause) {
    super(cause);
  }
}
