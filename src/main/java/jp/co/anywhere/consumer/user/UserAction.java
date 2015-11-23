package jp.co.anywhere.consumer.user;

import jp.co.anywhere.common.util.DigestHelper;
import jp.co.anywhere.common.util.ObjectHelper;
import jp.co.anywhere.consumer.shared.Action;
import jp.co.anywhere.consumer.shared.interceptor.Cacheable;
import jp.co.anywhere.consumer.shared.interceptor.ClearCache;
import jp.co.anywhere.iface.UserServiceObject;
import jp.co.anywhere.provider.service.user.UserService;
import org.omnifaces.util.Faces;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collection;

/**
 * Created by asari on 2015/11/07.
 */
@RequestScoped
@Named
public class UserAction implements Action {

  @Inject
  private UserService service;

  /**
   * ユーザ情報の呼び出し
   */
  public void load(UserServiceObject user) {
    // TODO 不正なIDの場合の例外処理追加
    if (user.getId() == null) {
      return;
    }
    UserServiceObject userModel = service.get(user);
    ObjectHelper.copyProperties(userModel, user);
  }

  /**
   * ユーザの作成
   */
  @ClearCache
  public String create(UserServiceObject user) {
    user.setHashedPassword(hashed(user.getPassword()));
    UserServiceObject saved = service.save(user);

    Faces.getFlash().put("id", saved.getId());

    return "view";
  }

  private static String hashed(String password) {
    return DigestHelper.encodeHexString(DigestHelper.sha256(password.getBytes()));
  }

  /**
   * ユーザの削除
   * @param user
   */
  @ClearCache
  public void delete(UserServiceObject user) {
    service.delete(user);
  }

  /**
   * ユーザ一覧の取得
   * @return
   */
  @Cacheable
  public Collection<UserServiceObject> getResult(UserParameter parameter) {
    return service.findMany(parameter);
  }
}
