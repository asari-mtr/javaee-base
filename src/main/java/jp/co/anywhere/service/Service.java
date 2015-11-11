package jp.co.anywhere.service;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by asari on 2015/11/11.
 */
public interface Service<E> extends Serializable {
  void save(E e);
  void delete(E e);
  Collection<E> findAll();
}
