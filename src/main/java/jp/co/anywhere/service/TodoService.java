package jp.co.anywhere.service;

import jp.co.anywhere.entity.TaskItem;
import jp.co.anywhere.model.TodoModel;
import jp.co.anywhere.repository.SimpleRepository;
import jp.co.anywhere.service.Service;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by asari on 2015/11/11.
 */
public class TodoService extends AbstractService<TodoModel> {

  @Inject
  private SimpleRepository repository;

  @Transactional
  public void save(TodoModel todo) {
    TaskItem taskItem = new TaskItem();
    taskItem.setTask(todo.getTask());

    repository.save(taskItem);
  }

  @Transactional
  public void delete(TodoModel todo) {
    repository.delete(TaskItem.class, todo.getId());
  }

  public Collection<TodoModel> findAll() {
    Collection<TodoModel> result = repository.findAll(TaskItem.class).stream().map(i -> {
      TodoModel todoModel = new TodoModel();
      todoModel.setId(i.getId());
      todoModel.setDone(i.isDone());
      todoModel.setTask(i.getTask());
      todoModel.setCreateDate(i.getCreateDate());
      todoModel.setUpdateDate(i.getUpdateDate());
      return todoModel;
    }).collect(Collectors.toList());
    return result;
  }

  @Transactional
  public void update(TodoModel todo) {
    TaskItem taskItem = repository.get(TaskItem.class, todo.getId());
    taskItem.setTask(todo.getTask());
    taskItem.setDone(todo.isDone());
    repository.update(taskItem);
  }

}
