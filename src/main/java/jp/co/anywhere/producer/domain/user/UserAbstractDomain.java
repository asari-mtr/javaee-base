package jp.co.anywhere.producer.domain.user;

import jp.co.anywhere.consumer.user.UserModel;
import jp.co.anywhere.producer.shared.AbstractDomain;
import jp.co.anywhere.producer.entity.User;

/**
 * Created by asari on 2015/11/11.
 */
public class UserAbstractDomain extends AbstractDomain<UserModel, User> {

  @Override
  public UserModel toModel(User entity) {
    UserModel userModel = new UserModel();
    userModel.setId(entity.getId());
    userModel.setName(entity.getName());
    userModel.setEmail(entity.getEmail());
    userModel.setPassword(entity.getPassword());
    userModel.setCreateDate(entity.getCreateDate());
    userModel.setUpdateDate(entity.getUpdateDate());
    return userModel;
  }

  @Override
  public User toEntity(User entity, UserModel model) {
    entity.setId(model.getId());
    entity.setName(model.getName());
    entity.setEmail(model.getEmail());
    entity.setPassword(model.getHashedPassword());
    entity.setCreateDate(model.getCreateDate());
    entity.setUpdateDate(model.getUpdateDate());
    return entity;
  }
}
