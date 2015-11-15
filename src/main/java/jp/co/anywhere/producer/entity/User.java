package jp.co.anywhere.producer.entity;

import jp.co.anywhere.producer.shared.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by asari on 2015/11/15.
 */
@Entity
@Table(name = "login_user")
public class User extends AbstractEntity {
  @Column
  private String name;
  @Column
  private String email;
  /**
   * ハッシュ化されたパスワード
   */
  @Column
  private String password;

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
}
