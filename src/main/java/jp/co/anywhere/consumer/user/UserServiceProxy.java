package jp.co.anywhere.consumer.user;

import jp.co.anywhere.consumer.shared.AbstractServiceProxy;
import jp.co.anywhere.iface.UserServiceObject;
import jp.co.anywhere.provider.service.user.UserService;

import javax.inject.Inject;
import java.util.Collection;

/**
 * Created by asari on 2015/11/23.
 */
public class UserServiceProxy extends AbstractServiceProxy<User, UserServiceObject> {
  @Inject
  private UserService service;

  public User get(User user) {
    return invoke(service::get, user);
  }

  public User save(User user) {
    return invoke(service::save, user);
  }

  public void delete(User user) {
    invoke(service::delete, user);
  }

  public Collection<User> findAll() {
    return invoke(service::findAll);
  }

  public Collection<User> findMany(UserParameter parameter) {
    return invoke(service::findMany, parameter, this::toParameter);
  }
}
