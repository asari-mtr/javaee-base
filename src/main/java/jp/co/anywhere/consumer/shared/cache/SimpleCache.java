package jp.co.anywhere.consumer.shared.cache;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by asari on 2015/11/12.
 */
@Dependent
@Named
public class SimpleCache implements Serializable {

  private String key;
  private Object value;

  public boolean isCached(String newKey) {
    return value != null && newKey.equals(key);
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public void clear() {
    value = null;
  }

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }
}
