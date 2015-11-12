package jp.co.anywhere.consumer.todo;

import jp.co.anywhere.consumer.shared.model.AbstractModel;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * Created by asari on 2015/11/07.
 */
@RequestScoped
@Named
public class TodoModel extends AbstractModel {
  /** タスク */
  private String task;
  /** 完了か */
  private boolean done;

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
