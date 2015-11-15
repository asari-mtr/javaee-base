package jp.co.anywhere.consumer.user;

import jp.co.anywhere.common.Service;
import jp.co.anywhere.consumer.shared.Action;
import jp.co.anywhere.consumer.shared.cache.CacheClear;
import jp.co.anywhere.consumer.shared.interceptor.Cacheable;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Event;
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
  private Service<UserModel> service;

  @Inject
  private Event<CacheClear> clearEvent;

  @Inject
  private CacheClear cacheClear;

  /**
   * ユーザの作成
   */
  public String create(UserModel user) {
    user.setHashedPassword(hashed(user.getPassword()));
    service.save(user);

    return "index.xhtml";
  }

  private static String hashed(String password) {
    return Hex.encodeHexString(DigestUtils.sha256(password.getBytes()));
  }

  /**
   * ユーザの削除
   * @param user
   */
  public void delete(UserModel user) {
    service.delete(user);

    clearEvent.fire(cacheClear);
  }

  /**
   * ユーザ一覧の取得
   * @return
   */
  @Cacheable
  public Collection<UserModel> getResult() {
    return service.findAll();
  }
}
