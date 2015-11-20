package jp.co.anywhere.producer.repository;

import jp.co.anywhere.consumer.shared.Parameter;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Created by asari on 2015/11/20.
 */
public class SimpleListener<P extends Parameter, E> implements Listener<P, E> {
  @Override
  public Predicate[] query(Root<E> root, CriteriaBuilder builder, P parameter) {
    return null;
  }
}
