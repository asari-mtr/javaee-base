package jp.co.anywhere.common.util;

import jp.co.anywhere.common.exception.SomethingRuntimeException;

/**
 * Created by asari on 2015/11/21.
 */
public class ExceptionHelper {
  public static void handle(Exception e) {
    throw new SomethingRuntimeException(e);
  }
}
