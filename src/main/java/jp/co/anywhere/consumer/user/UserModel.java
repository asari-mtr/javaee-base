package jp.co.anywhere.consumer.user;

import jp.co.anywhere.iface.AbstractModel;
import jp.co.anywhere.consumer.shared.stereotype.Model;
import jp.co.anywhere.consumer.shared.validator.Email;

/**
 * Created by asari on 2015/11/15.
 */
@Model
public class UserModel extends AbstractModel {
  private String name;
  @Email
  private String email;
  private String password;
  private String hashedPassword;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getHashedPassword() {
    return hashedPassword;
  }

  public void setHashedPassword(String hashedPassword) {
    this.hashedPassword = hashedPassword;
  }
}
