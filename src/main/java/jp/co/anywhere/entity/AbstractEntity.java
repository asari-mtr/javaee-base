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

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public long getVersion() {
    return version;
  }

  public void setVersion(long version) {
    this.version = version;
  }
}
