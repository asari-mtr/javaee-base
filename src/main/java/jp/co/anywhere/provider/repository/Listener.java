package jp.co.anywhere.provider.repository;

import jp.co.anywhere.iface.Parameter;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * Created by asari on 2015/11/20.
 */
public interface Listener<P extends Parameter, E> {
  CriteriaQuery<E> query(Root<E> root, CriteriaQuery<E> query, CriteriaBuilder builder, P parameter);
}
