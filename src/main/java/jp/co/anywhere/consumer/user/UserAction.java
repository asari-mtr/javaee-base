package jp.co.anywhere.consumer.user;

import jp.co.anywhere.common.util.DigestHelper;
import jp.co.anywhere.common.util.ObjectHelper;
import jp.co.anywhere.consumer.shared.Action;
import jp.co.anywhere.consumer.shared.interceptor.Cacheable;
import jp.co.anywhere.consumer.shared.interceptor.ClearCache;
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
  private UserServiceProxy proxy;

  /**
   * ユーザ情報の呼び出し
   */
  public void load(User user) {
    // TODO 不正なIDの場合の例外処理追加
    if (user.getId() == null) {
      return;
    }
    User userModel = proxy.get(user);
    ObjectHelper.copyProperties(userModel, user);
  }

  /**
   * ユーザの作成
   */
  @ClearCache
  public String create(User user) {
    user.setHashedPassword(hashed(user.getPassword()));
    User saved = proxy.save(user);

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
  public void delete(User user) {
    proxy.delete(user);
  }

  /**
   * ユーザ一覧の取得
   * @return
   */
  @Cacheable
  public Collection<User> getResult(UserParameter parameter) {
    return proxy.findMany(parameter);
  }
}
