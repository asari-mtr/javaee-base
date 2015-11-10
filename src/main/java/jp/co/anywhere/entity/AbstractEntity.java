package jp.co.anywhere.entity;


import javax.persistence.*;

/**
 * Created by asari on 2015/11/07.
 */
@MappedSuperclass
public abstract class AbstractEntity implements Entity {
  @Id
  @Column
  @GeneratedValue
  private Long id;

  @Version
  private long version;

  @Override
  public Long getId() {
    return id;
  }

  @Override
  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public long getVersion() {
    return version;
  }

  @Override
  public void setVersion(long version) {
    this.version = version;
  }
}
