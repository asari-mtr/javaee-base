package jp.co.anywhere.common.exception;

/**
 * Created by asari on 2015/11/21.
 */
public class SomethingRuntimeException extends RuntimeException {
  public SomethingRuntimeException(Exception e) {
    super(e);
  }
}
