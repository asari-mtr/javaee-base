package jp.co.anywhere.common;

import jp.co.anywhere.consumer.shared.Model;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by asari on 2015/11/11.
 */
public interface Service<E extends Model> extends Serializable {
  E get(E e);
  E save(E e);
  void delete(E e);
  Collection<E> findAll();
}
