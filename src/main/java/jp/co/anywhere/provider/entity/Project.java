package jp.co.anywhere.provider.entity;

import jp.co.anywhere.provider.shared.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * Created by asari on 2015/11/22.
 */
@Entity
public class Project extends AbstractEntity {
  @Column
  private String title;

  @Column
  private String note;

  @OneToOne
  private FileData file;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }
}
