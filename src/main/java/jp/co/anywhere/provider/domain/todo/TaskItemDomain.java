package jp.co.anywhere.provider.domain.todo;

import jp.co.anywhere.iface.TodoServiceObject;
import jp.co.anywhere.provider.shared.AbstractDomain;
import jp.co.anywhere.provider.entity.TaskItem;

/**
 * Created by asari on 2015/11/11.
 */
public class TaskItemDomain extends AbstractDomain<TodoServiceObject, TaskItem> {

  @Override
  public TodoServiceObject toServiceObject(TaskItem entity) {
    TodoServiceObject taskModel = new TodoServiceObject();
    taskModel.setId(entity.getId());
    taskModel.setTask(entity.getTask());
    taskModel.setDone(entity.isDone());
    taskModel.setCreateDate(entity.getCreateDate());
    taskModel.setUpdateDate(entity.getUpdateDate());
    return taskModel;
  }

  @Override
  public TaskItem toEntity(TaskItem taskItem, TodoServiceObject serviceObject) {
    taskItem.setId(serviceObject.getId());
    taskItem.setTask(serviceObject.getTask());
    taskItem.setDone(serviceObject.isDone());
    taskItem.setCreateDate(serviceObject.getCreateDate());
    taskItem.setUpdateDate(serviceObject.getUpdateDate());
    return taskItem;
  }
}
