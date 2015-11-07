package jp.co.anywhere.repository;

import jp.co.anywhere.entity.Entity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import java.util.Collection;

/**
 * Created by asari on 2015/11/07.
 */
public class SimpleRepository {

  @PersistenceContext(name = "primary")
  private EntityManager entityManager;

  /**
   * 指定されたEntityを保存する
   * @param entity 保存対象のEntity
   * @param <E> Entityのサブクラス
   */
  public <E extends Entity> void save(E entity) {
    entityManager.persist(entity);
  }

  /**
   * 指定されたEntityを削除する
   * @param entity
   */
  public <E extends Entity> void delete(E entity) {
    entityManager.remove(entity);
  }

  /**
   * 指定されたIDのEntityを取得する
   * @param clazz 取得するテーブル
   * @param id ID
   * @param <E> Entityのサブクラス
   * @return 指定されたIDのEntity
   */
  public <E extends Entity> E get(Class<E> clazz, Long id) {
    return entityManager.find(clazz, id);
  }
  /**
   * 全件取得
   * @param clazz 対象のテーブル
   * @param <E> Entityのサブクラス
   * @return 対象のテーブル全件
   */
  public <E extends Entity> Collection<E> findAll(Class<E> clazz) {
    CriteriaQuery<E> query = entityManager.getCriteriaBuilder().createQuery(clazz);
    CriteriaQuery<E> all = query.select(query.from(clazz));
    return entityManager.createQuery(all).getResultList();
  }
}
