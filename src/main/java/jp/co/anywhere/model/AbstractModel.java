package jp.co.anywhere.model;

import java.util.Date;

/**
 * Created by asari on 2015/11/07.
 */
public class AbstractModel implements Model {
  /** ID */
  private Long id;

  private Date createDate;

  private Date updateDate;

  @Override
  public Long getId() {
    return id;
  }

  @Override
  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public Date getCreateDate() {
    return createDate;
  }

  @Override
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  @Override
  public Date getUpdateDate() {
    return updateDate;
  }

  @Override
  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }
}
