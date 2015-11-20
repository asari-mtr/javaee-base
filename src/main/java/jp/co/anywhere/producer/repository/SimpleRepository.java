package jp.co.anywhere.producer.repository;

import jp.co.anywhere.consumer.shared.Parameter;
import jp.co.anywhere.producer.shared.AbstractEntity;
import jp.co.anywhere.producer.shared.AbstractEntity_;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Collection;

/**
 * Created by asari on 2015/11/07.
 */
public class SimpleRepository<E extends AbstractEntity> {

  private Listener listener;

  private EntityManager entityManager;

  private Class<E> clazz;

  public SimpleRepository(Class<E> clazz, EntityManager entityManager) {
    this.clazz = clazz;
    this.entityManager = entityManager;
  }

  public SimpleRepository(Class<E> clazz, EntityManager entityManager, Listener listener) {
    this.clazz = clazz;
    this.entityManager = entityManager;
    this.listener = listener;
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
   */
  public Collection<E> findAll(Class<E> clazz) {
    CriteriaBuilder builder = entityManager.getCriteriaBuilder();
    CriteriaQuery<E> query = builder.createQuery(clazz);
    Root<E> root = query.from(clazz);
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
    CriteriaBuilder builder = entityManager.getCriteriaBuilder();
    CriteriaQuery<E> query = builder.createQuery(clazz);
    Root<E> root = query.from(clazz);
    query.select(root).where(listener.query(root, builder, parameter)).orderBy(builder.desc(root.get(AbstractEntity_.id)));
    return entityManager.createQuery(query).getResultList();
  }
}