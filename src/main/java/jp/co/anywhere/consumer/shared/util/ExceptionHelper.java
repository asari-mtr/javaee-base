package jp.co.anywhere.consumer.shared.util;

import jp.co.anywhere.consumer.shared.exception.SomethingException;

/**
 * Created by asari on 2015/11/21.
 */
public class ExceptionHelper {
  public static void handle(Exception e) throws SomethingException {
    throw new SomethingException(e);
  }
}
