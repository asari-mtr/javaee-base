package jp.co.anywhere.producer.service.user;

import jp.co.anywhere.common.Converter;
import jp.co.anywhere.common.shared.ObjectHelper;
import jp.co.anywhere.consumer.user.UserModel;
import jp.co.anywhere.producer.entity.User;
import jp.co.anywhere.producer.repository.SimpleRepository;
import jp.co.anywhere.producer.shared.AbstractService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by asari on 2015/11/15.
 */
@Transactional
public class UserService extends AbstractService<UserModel> {
  @Inject
  private SimpleRepository<User> repository;

  @Inject
  private Converter<UserModel, User> converter;

  @Override
  public UserModel get(UserModel userModel) {
    UserModel result = converter.toModel(repository.get(userModel.getId()));
    ObjectHelper.copyProperties(result, userModel);
    return userModel;
  }

  public UserModel save(UserModel user) {
    Long id = user.getId();
    User e;
    if(id == null){
      e = new User();
    } else {
      e = repository.get(id);
    }
    User saved = repository.save(converter.toEntity(e, user));

    return converter.toModel(saved);
  }

  public void delete(UserModel user) {
    repository.delete(user.getId());
  }

  public Collection<UserModel> findAll() {
    return repository.findAll(User.class).stream().map(converter::toModel).collect(Collectors.toList());
  }
}
