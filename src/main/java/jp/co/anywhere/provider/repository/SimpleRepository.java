package jp.co.anywhere.provider.repository;

import jp.co.anywhere.iface.Parameter;
import jp.co.anywhere.provider.shared.AbstractEntity;
import jp.co.anywhere.provider.shared.AbstractEntity_;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by asari on 2015/11/07.
 */
public class SimpleRepository<E extends AbstractEntity> implements Serializable {

  private Listener listener;

  private EntityManager entityManager;

  private Class<E> clazz;
  private CriteriaBuilder builder;
  private CriteriaQuery<E> query;
  private Root<E> root;

  public SimpleRepository(Class<E> clazz, EntityManager entityManager) {
    this.clazz = clazz;
    this.entityManager = entityManager;
    reset();
  }

  public SimpleRepository(Class<E> clazz, EntityManager entityManager, Listener listener) {
    this.clazz = clazz;
    this.entityManager = entityManager;
    this.listener = listener;
    reset();
  }

  private void reset() {
    builder = entityManager.getCriteriaBuilder();
    query = builder.createQuery(clazz);
    root = query.from(clazz);
  }

  /**
   * 指定されたEntityを保存する
   * @param entity 保存対象のEntity
   */
  public E save(E entity) {
    if(entity.isPersist()) {
      entityManager.merge(entity);
    } else {
      entityManager.persist(entity);
    }
    return entity;
  }

  /**
   * 指定されたEntityを削除する
   * @param id 削除対象のID
   */
  public void delete(Long id) {
    entityManager.remove(get(id));
  }

  /**
   * 指定されたIDのEntityを取得する
   * @param id ID
   * @return 指定されたIDのEntity
   */
  public E get(Long id) {
    E result = entityManager.find(clazz, id);
    if (result == null) {
      throw new IllegalArgumentException();
    }
    return result;
  }
  /**
   * 全件取得
   * @param clazz 対象のテーブル
   * @return 対象のテーブル全件
   * @deprecated findManyに統合するので後で消す
   */
  @Deprecated
  public Collection<E> findAll(Class<E> clazz) {
    query.select(root).orderBy(builder.desc(root.get(AbstractEntity_.id)));
    return entityManager.createQuery(query).getResultList();
  }

  /**
   * 全件取得
   *
   * @param clazz 対象のテーブル
   * @return 対象のテーブル全件
   */
  public Collection<E> findMany(Class<E> clazz, Parameter parameter) {
    return entityManager.createQuery(listener.query(root, query, builder, parameter)).getResultList();
  }
}