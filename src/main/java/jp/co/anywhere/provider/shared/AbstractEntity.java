package jp.co.anywhere.provider.shared;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by asari on 2015/11/07.
 */
@MappedSuperclass
public abstract class AbstractEntity implements Entity {
  @Transient
  private boolean persist;
  @Id
  @Column
  @GeneratedValue
  private Long id;
  @Version
  private long version;
  @Column
  private Date createDate;
  @Column
  private Date updateDate;

  @PostPersist
  @PostUpdate
  @PostLoad
  private void postPersist() {
    persist = true;
  }
  @PrePersist
  private void prePersist() {
    createDate = new Date();
    updateDate = new Date();
  }
  @PreUpdate
  private void preUpdate() {
    if(createDate == null) {
      createDate = new Date();
    }
    updateDate = new Date();
  }

  @Override
  public boolean isPersist() {
    return persist;
  }

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

  @Override
  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  @Override
  public Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }
}
