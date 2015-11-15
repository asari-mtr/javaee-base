package jp.co.anywhere.producer.repository;

import jp.co.anywhere.producer.entity.TaskItem;
import jp.co.anywhere.producer.entity.User;

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

  /**
   * TODO 場所が微妙だな
   * @return
   */
  @Produces
  public SimpleRepository<User> createUserRepository() {
    return new SimpleRepository<>(User.class, entityManager);
  }
}
