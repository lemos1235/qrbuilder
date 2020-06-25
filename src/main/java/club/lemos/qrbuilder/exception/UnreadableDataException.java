package club.lemos.qrbuilder.exception;

public class UnreadableDataException extends RuntimeException {

  public UnreadableDataException(String msg, Throwable cause){
    super(msg, cause);
  }

  public UnreadableDataException(String msg) {
    super(msg);
  }
}
