package jp.co.anywhere.producer.repository;

import jp.co.anywhere.consumer.user.UserParameter;
import jp.co.anywhere.producer.entity.TaskItem;
import jp.co.anywhere.producer.entity.User;
import jp.co.anywhere.producer.entity.User_;
import org.apache.commons.lang3.StringUtils;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

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
    return new SimpleRepository<>(User.class, entityManager, new SimpleListener<UserParameter, User>(){
      @Override
      public Predicate[] query(Root<User> root, CriteriaBuilder builder, UserParameter parameter) {
        if(StringUtils.isNotEmpty(parameter.getKeyword())){
          String pattern = "%" + parameter.getKeyword() + "%";
          return new Predicate[]{builder.like(root.get(User_.name), pattern)};
        } else {
          return new Predicate[0];
        }
      }
    });
  }
}
