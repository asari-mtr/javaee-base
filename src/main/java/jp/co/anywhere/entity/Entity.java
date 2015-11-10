package jp.co.anywhere.entity;

import java.io.Serializable;

/**
 * Created by asari on 2015/11/07.
 */
public interface Entity extends Serializable {

  Long getId();

  void setId(Long id);

  long getVersion();

  void setVersion(long version);
}
