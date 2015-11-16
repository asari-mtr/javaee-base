package jp.co.anywhere.common.shared;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by asari on 2015/11/17.
 */
public class ObjectHelper {
  /**
   * プロパティをコピーする
   * @param orig コピー元
   * @param dest コピー先
   */
  public static void copyProperties(Object orig, Object dest) {
    try {
      BeanUtils.copyProperties(dest, orig);
    } catch (IllegalAccessException e) {
      // TODO
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      // TODO
      e.printStackTrace();
    }
  }
}
