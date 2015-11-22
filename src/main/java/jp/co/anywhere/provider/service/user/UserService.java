package jp.co.anywhere.provider.service.user;

import jp.co.anywhere.consumer.user.UserModel;
import jp.co.anywhere.consumer.user.UserParameter;
import jp.co.anywhere.provider.shared.AbstractDomain;
import jp.co.anywhere.provider.entity.User;
import jp.co.anywhere.provider.shared.AbstractService;

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

  public Collection<UserModel> findMany(UserParameter parameter) {
    return domain.findMany(parameter);
  }
}
