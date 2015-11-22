package jp.co.anywhere.provider.repository;

import jp.co.anywhere.consumer.shared.Parameter;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * Created by asari on 2015/11/20.
 */
public class SimpleListener<P extends Parameter, E> implements Listener<P, E> {
  @Override
  public CriteriaQuery<E> query(Root<E> root, CriteriaQuery<E> query, CriteriaBuilder builder, P parameter) {
    return query.select(root).orderBy(builder.desc(root.get("id")));
  }
}
