package jp.co.anywhere.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by asari on 2015/11/07.
 */
public interface Entity extends Serializable {

  boolean isPersist();

  Long getId();

  void setId(Long id);

  long getVersion();

  void setVersion(long version);

  Date getCreateDate();

  Date getUpdateDate();
}
