package jp.co.anywhere.repository;

import jp.co.anywhere.entity.TaskItem;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by asari on 2015/11/12.
 */
@Dependent
public class RepositoryProducer {

  @PersistenceContext(name = "primary")
  private EntityManager entityManager;

  @Produces
  public SimpleRepository<TaskItem> createTaskItemRepository() {
    return new SimpleRepository<>(TaskItem.class, entityManager);
  }
}
