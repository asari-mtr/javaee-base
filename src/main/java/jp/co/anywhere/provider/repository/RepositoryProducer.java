package jp.co.anywhere.provider.repository;

import jp.co.anywhere.consumer.user.UserParameter;
import jp.co.anywhere.provider.entity.*;
import org.apache.commons.lang3.StringUtils;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
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
      public CriteriaQuery<User> query(Root<User> root, CriteriaQuery<User> query, CriteriaBuilder builder, UserParameter parameter) {
        if(StringUtils.isNotEmpty(parameter.getKeyword())){
          String pattern = "%" + parameter.getKeyword() + "%";
          return query.where(builder.like(root.get(User_.name), pattern));
        }
        return query;
      }
    });
  }

  @Produces
  public SimpleRepository<FileData> createFileDataRepository() {
    return new SimpleRepository<FileData>(FileData.class, entityManager, new SimpleListener<>()){
    };
  }

  @Produces
  public SimpleRepository<Project> createProjectRepository() {
    return new SimpleRepository<Project>(Project.class, entityManager, new SimpleListener<>()){
    };
  }
}
