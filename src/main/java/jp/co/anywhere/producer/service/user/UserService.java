package jp.co.anywhere.producer.service.user;

import jp.co.anywhere.consumer.user.UserModel;
import jp.co.anywhere.producer.shared.AbstractDomain;
import jp.co.anywhere.producer.entity.User;
import jp.co.anywhere.producer.shared.AbstractService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.Collection;

/**
 * Created by asari on 2015/11/15.
 */
@Transactional
public class UserService extends AbstractService<UserModel> {
  @Inject
  private AbstractDomain<UserModel, User> domain;

  public UserModel get(UserModel userModel) {
    return domain.get(userModel.getId());
  }

  public UserModel save(UserModel user) {
    return domain.save(user);
  }

  public void delete(UserModel user) {
    domain.delete(user.getId());
  }

  public Collection<UserModel> findAll() {
    return domain.findAll();
  }
}
