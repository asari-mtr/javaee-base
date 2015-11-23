package jp.co.anywhere.provider.domain.user;

import jp.co.anywhere.iface.UserServiceObject;
import jp.co.anywhere.provider.shared.AbstractDomain;
import jp.co.anywhere.provider.entity.User;

/**
 * Created by asari on 2015/11/11.
 */
public class UserDomain extends AbstractDomain<UserServiceObject, User> {

  @Override
  public UserServiceObject toServiceObject(User entity) {
    UserServiceObject userModel = new UserServiceObject();
    userModel.setId(entity.getId());
    userModel.setName(entity.getName());
    userModel.setEmail(entity.getEmail());
    userModel.setPassword(entity.getPassword());
    userModel.setCreateDate(entity.getCreateDate());
    userModel.setUpdateDate(entity.getUpdateDate());
    return userModel;
  }

  @Override
  public User toEntity(User entity, UserServiceObject serviceObject) {
    entity.setId(serviceObject.getId());
    entity.setName(serviceObject.getName());
    entity.setEmail(serviceObject.getEmail());
    entity.setPassword(serviceObject.getHashedPassword());
    entity.setCreateDate(serviceObject.getCreateDate());
    entity.setUpdateDate(serviceObject.getUpdateDate());
    return entity;
  }
}
