package jp.co.anywhere.provider.domain.user;

import jp.co.anywhere.iface.UserServiceObject;
import jp.co.anywhere.provider.shared.AbstractDomain;
import jp.co.anywhere.provider.entity.User;

/**
 * Created by asari on 2015/11/11.
 */
public class UserDomain extends AbstractDomain<UserServiceObject, User> {

  @Override
  public UserServiceObject toModel(User entity) {
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
  public User toEntity(User entity, UserServiceObject model) {
    entity.setId(model.getId());
    entity.setName(model.getName());
    entity.setEmail(model.getEmail());
    entity.setPassword(model.getHashedPassword());
    entity.setCreateDate(model.getCreateDate());
    entity.setUpdateDate(model.getUpdateDate());
    return entity;
  }
}
