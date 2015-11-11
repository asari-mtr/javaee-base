package jp.co.anywhere.repository;

import jp.co.anywhere.entity.Entity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Collection;

/**
 * Created by asari on 2015/11/07.
 */
public class SimpleRepository<E extends Entity> {

  private EntityManager entityManager;

  private Class<E> clazz;

  public SimpleRepository(Class<E> clazz, EntityManager entityManager) {
    this.clazz = clazz;
    this.entityManager = entityManager;
  }
  
  /**
   * 指定されたEntityを保存する
   * @param entity 保存対象のEntity
   */
  public void save(E entity) {
    if(entity.isPersist()) {
      entityManager.merge(entity);
    } else {
      entityManager.persist(entity);
    }
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
    return entityManager.find(clazz, id);
  }
  /**
   * 全件取得
   * @param clazz 対象のテーブル
   * @param <E> Entityのサブクラス
   * @return 対象のテーブル全件
   */
  public Collection<E> findAll(Class<E> clazz) {
    CriteriaBuilder builder = entityManager.getCriteriaBuilder();
    CriteriaQuery<E> query = builder.createQuery(clazz);
    Root<E> root = query.from(clazz);
    // TODO MetaModelでsortしたい。とりあえず、idのdescで
    query.select(root).orderBy(builder.desc(root.get("id")));
    return entityManager.createQuery(query).getResultList();
  }
}
