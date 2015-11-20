package jp.co.anywhere.consumer.shared;

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
}
