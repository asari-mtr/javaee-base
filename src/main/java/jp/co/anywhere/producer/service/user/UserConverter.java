package jp.co.anywhere.producer.service.user;

import jp.co.anywhere.common.Converter;
import jp.co.anywhere.consumer.user.UserModel;
import jp.co.anywhere.producer.entity.User;

/**
 * Created by asari on 2015/11/11.
 */
public class UserConverter implements Converter<UserModel, User> {
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
    User user = new User();
    user.setId(model.getId());
    user.setName(model.getName());
    user.setEmail(model.getEmail());
    user.setPassword(model.getHashedPassword());
    user.setCreateDate(model.getCreateDate());
    user.setUpdateDate(model.getUpdateDate());
    return user;
  }
}
