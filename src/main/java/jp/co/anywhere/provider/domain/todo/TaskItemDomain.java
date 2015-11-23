package jp.co.anywhere.provider.domain.todo;

import jp.co.anywhere.iface.TodoModel;
import jp.co.anywhere.provider.shared.AbstractDomain;
import jp.co.anywhere.provider.entity.TaskItem;

/**
 * Created by asari on 2015/11/11.
 */
public class TaskItemDomain extends AbstractDomain<TodoModel, TaskItem> {

  @Override
  public TodoModel toModel(TaskItem entity) {
    TodoModel taskModel = new TodoModel();
    taskModel.setId(entity.getId());
    taskModel.setTask(entity.getTask());
    taskModel.setDone(entity.isDone());
    taskModel.setCreateDate(entity.getCreateDate());
    taskModel.setUpdateDate(entity.getUpdateDate());
    return taskModel;
  }

  @Override
  public TaskItem toEntity(TaskItem taskItem, TodoModel model) {
    taskItem.setId(model.getId());
    taskItem.setTask(model.getTask());
    taskItem.setDone(model.isDone());
    taskItem.setCreateDate(model.getCreateDate());
    taskItem.setUpdateDate(model.getUpdateDate());
    return taskItem;
  }
}
