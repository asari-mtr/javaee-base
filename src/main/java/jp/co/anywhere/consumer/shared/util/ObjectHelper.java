package jp.co.anywhere.consumer.shared.util;

import jp.co.anywhere.consumer.shared.exception.SomethingException;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.text.StrBuilder;

import java.io.IOException;
import java.util.Comparator;
import java.util.Map;

/**
 * Created by asari on 2015/11/21.
 */
public class ObjectHelper {

  private ObjectUtils utils;

  public static <T extends Comparable<? super T>> T max(T... values) {
    return ObjectUtils.max(values);
  }

  public static <T> T defaultIfNull(T object, T defaultValue) {
    return ObjectUtils.defaultIfNull(object, defaultValue);
  }

  public static <T> T firstNonNull(T... values) {
    return ObjectUtils.firstNonNull(values);
  }

  public static boolean notEqual(Object object1, Object object2) {
    return ObjectUtils.notEqual(object1, object2);
  }

  public static String identityToString(Object object) {
    return ObjectUtils.identityToString(object);
  }

  public static void identityToString(StrBuilder builder, Object object) {
    ObjectUtils.identityToString(builder, object);
  }

  public static void identityToString(Appendable appendable, Object object) throws SomethingException {
    try {
      ObjectUtils.identityToString(appendable, object);
    } catch (Exception e) {
      ExceptionHelper.handle(e);
    }
  }

  public static void identityToString(StringBuffer buffer, Object object) {
    ObjectUtils.identityToString(buffer, object);
  }

  public static void identityToString(StringBuilder builder, Object object) {
    ObjectUtils.identityToString(builder, object);
  }

  public static <T extends Comparable<? super T>> T min(T... values) {
    return ObjectUtils.min(values);
  }

  public static <T extends Comparable<? super T>> int compare(T c1, T c2) {
    return ObjectUtils.compare(c1, c2);
  }

  public static <T extends Comparable<? super T>> int compare(T c1, T c2, boolean nullGreater) {
    return ObjectUtils.compare(c1, c2, nullGreater);
  }

  public static <T extends Comparable<? super T>> T median(T... items) {
    return ObjectUtils.median(items);
  }

  public static <T> T median(Comparator<T> comparator, T... items) {
    return ObjectUtils.median(comparator, items);
  }

  public static <T> T mode(T... items) {
    return ObjectUtils.mode(items);
  }

  public static <T> T clone(T obj) {
    return ObjectUtils.clone(obj);
  }

  public static <T> T cloneIfPossible(T obj) {
    return ObjectUtils.cloneIfPossible(obj);
  }

  public static void setProperty(Object bean, String name, Object value) throws SomethingException {
    try {
      BeanUtils.setProperty(bean, name, value);
    } catch (Exception e) {
      ExceptionHelper.handle(e);
    }
  }

  public static String[] getArrayProperty(Object bean, String name) throws SomethingException {
    try {
      return BeanUtils.getArrayProperty(bean, name);
    } catch (Exception e) {
      ExceptionHelper.handle(e);
    }
    // ExceptionHelper.handl内部から例外が出るためここは通らない
    return null;
  }

  public static void copyProperty(Object bean, String name, Object value) throws SomethingException {
    try {
      BeanUtils.copyProperty(bean, name, value);
    } catch (Exception e) {
      ExceptionHelper.handle(e);
    }
  }

  public static void populate(Object bean, Map<String, ? extends Object> properties) throws SomethingException {
    try {
      BeanUtils.populate(bean, properties);
    } catch (Exception e) {
      ExceptionHelper.handle(e);
    }
  }

  public static String getSimpleProperty(Object bean, String name) throws SomethingException {
    try {
      return BeanUtils.getSimpleProperty(bean, name);
    } catch (Exception e) {
      ExceptionHelper.handle(e);
    }
    // ExceptionHelper.handl内部から例外が出るためここは通らない
    return null;
  }

  public static String getNestedProperty(Object bean, String name) throws SomethingException {
    try {
      return BeanUtils.getNestedProperty(bean, name);
    } catch (Exception e) {
      ExceptionHelper.handle(e);
    }
    // ExceptionHelper.handl内部から例外が出るためここは通らない
    return null;
  }

  public static void setCacheFast(Map<?, ?> map, boolean fast) throws SomethingException {
    BeanUtils.setCacheFast(map, fast);
  }

  public static <K, V> Map<K, V> createCache() throws SomethingException {
    return BeanUtils.createCache();
  }

  public static String getMappedProperty(Object bean, String name) throws SomethingException {
    try {
      return BeanUtils.getMappedProperty(bean, name);
    } catch (Exception e) {
      ExceptionHelper.handle(e);
    }
    // ExceptionHelper.handl内部から例外が出るためここは通らない
    return null;
  }

  public static Map<String, String> describe(Object bean) throws SomethingException {
    try {
      return BeanUtils.describe(bean);
    } catch (Exception e) {
      ExceptionHelper.handle(e);
    }
    // ExceptionHelper.handle内部から例外が出るためここは通らない
    return null;
  }

  public static String getProperty(Object bean, String name) throws SomethingException {
    try {
      return BeanUtils.getProperty(bean, name);
    } catch (Exception e) {
      ExceptionHelper.handle(e);
    }
    // ExceptionHelper.handl内部から例外が出るためここは通らない
    return null;
  }

  public static boolean getCacheFast(Map<?, ?> map) throws SomethingException {
    return BeanUtils.getCacheFast(map);
  }

  public static void copyProperties(Object dest, Object orig) throws SomethingException {
    try {
      BeanUtils.copyProperties(dest, orig);
    } catch (Exception e) {
      ExceptionHelper.handle(e);
    }
  }

  public static boolean initCause(Throwable throwable, Throwable cause) throws SomethingException {
    return BeanUtils.initCause(throwable, cause);
  }

  public static String getIndexedProperty(Object bean, String name, int index) throws SomethingException {
    try {
      return BeanUtils.getIndexedProperty(bean, name, index);
    } catch (Exception e) {
      ExceptionHelper.handle(e);
    }
    // ExceptionHelper.handl内部から例外が出るためここは通らない
    return null;
  }

  public static Object cloneBean(Object bean) throws SomethingException {
    try {
      return BeanUtils.cloneBean(bean);
    } catch (Exception e) {
      ExceptionHelper.handle(e);
    }
    // ExceptionHelper.handl内部から例外が出るためここは通らない
    return null;
  }

  public static String getIndexedProperty(Object bean, String name) throws SomethingException {
    try {
      return BeanUtils.getIndexedProperty(bean, name);
    } catch (Exception e) {
      ExceptionHelper.handle(e);
    }
    // ExceptionHelper.handl内部から例外が出るためここは通らない
    return null;
  }

  public static String getMappedProperty(Object bean, String name, String key) throws SomethingException {
    try {
      return BeanUtils.getMappedProperty(bean, name, key);
    } catch (Exception e) {
      ExceptionHelper.handle(e);
    }
    // ExceptionHelper.handl内部から例外が出るためここは通らない
    return null;
  }

}
