package jp.co.anywhere.provider.entity;

import jp.co.anywhere.provider.shared.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by asari on 2015/11/07.
 */
@Entity
public class TaskItem extends AbstractEntity {

  @Column
  private String task;
  @Column
  private boolean done = false;

  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }
}
