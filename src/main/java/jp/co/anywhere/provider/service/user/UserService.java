package jp.co.anywhere.provider.service.user;

import jp.co.anywhere.iface.UserServiceObject;
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
public class UserService extends AbstractService<UserServiceObject> {
  @Inject
  private AbstractDomain<UserServiceObject, User> domain;

  public UserServiceObject get(UserServiceObject userModel) {
    return domain.get(userModel.getId());
  }

  public UserServiceObject save(UserServiceObject user) {
    return domain.save(user);
  }

  public void delete(UserServiceObject user) {
    domain.delete(user.getId());
  }

  public Collection<UserServiceObject> findAll() {
    return domain.findAll();
  }

  public Collection<UserServiceObject> findMany(UserParameter parameter) {
    return domain.findMany(parameter);
  }
}
