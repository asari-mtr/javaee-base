package jp.co.anywhere.producer.service.todo;

import jp.co.anywhere.common.Converter;
import jp.co.anywhere.consumer.todo.TodoModel;
import jp.co.anywhere.producer.entity.TaskItem;

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
  public TaskItem toEntity(TaskItem taskItem, TodoModel model) {
    taskItem.setId(model.getId());
    taskItem.setTask(model.getTask());
    taskItem.setDone(model.isDone());
    taskItem.setCreateDate(model.getCreateDate());
    taskItem.setUpdateDate(model.getUpdateDate());
    return taskItem;
  }
}
