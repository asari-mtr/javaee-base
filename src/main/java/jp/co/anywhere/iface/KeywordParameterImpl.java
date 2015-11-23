package jp.co.anywhere.iface;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Created by asari on 2015/11/20.
 */
public class KeywordParameterImpl implements KeywordParameter {
  private String keyword;

  @Override
  public String getKeyword() {
    return keyword;
  }

  @Override
  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
