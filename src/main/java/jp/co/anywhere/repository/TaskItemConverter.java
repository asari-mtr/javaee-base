package jp.co.anywhere.repository;

import jp.co.anywhere.converter.Converter;
import jp.co.anywhere.entity.TaskItem;
import jp.co.anywhere.model.TodoModel;

/**
 * Created by asari on 2015/11/11.
 */
public class TaskItemConverter implements Converter<TodoModel, TaskItem> {
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
  public TaskItem toEntity(TodoModel model) {
    TaskItem taskItem = new TaskItem();
    taskItem.setId(model.getId());
    taskItem.setTask(model.getTask());
    taskItem.setDone(model.isDone());
    taskItem.setCreateDate(model.getCreateDate());
    taskItem.setUpdateDate(model.getUpdateDate());
    return taskItem;
  }
}
