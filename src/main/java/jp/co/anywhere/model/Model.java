package jp.co.anywhere.model;

import java.util.Date;

/**
 * Created by asari on 2015/11/07.
 */
public interface Model {
  /** IDを取得する */
  Long getId();
  /** IDを設定する */
  void setId(Long id);

  Date getCreateDate();

  void setCreateDate(Date createDate);

  Date getUpdateDate();

  void setUpdateDate(Date updateDate);
}
