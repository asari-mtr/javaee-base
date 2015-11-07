package jp.co.anywhere.model;

/**
 * Created by asari on 2015/11/07.
 */
public class AbstractModel implements Model {
  /** ID */
  private Long id;

  @Override
  public Long getId() {
    return id;
  }

  @Override
  public void setId(Long id) {
    this.id = id;
  }
}
