package jp.co.anywhere.provider.entity;

import jp.co.anywhere.provider.shared.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by asari on 2015/11/22.
 */
@Entity
public class FileData extends AbstractEntity {
  @Column
  private String title;

  @Column
  private String name;

  @Column
  private byte[] data;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public byte[] getData() {
    return data;
  }

  public void setData(byte[] data) {
    this.data = data;
  }
}
