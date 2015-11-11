package jp.co.anywhere.service;

import jp.co.anywhere.converter.Converter;
import jp.co.anywhere.entity.TaskItem;
import jp.co.anywhere.model.TodoModel;
import jp.co.anywhere.repository.SimpleRepository;

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

  @Inject
  private Converter<TodoModel, TaskItem> converter;

  @Transactional
  public void save(TodoModel todo) {
    repository.save(converter.toEntity(todo));
  }

  @Transactional
  public void delete(TodoModel todo) {
    repository.delete(TaskItem.class, todo.getId());
  }

  public Collection<TodoModel> findAll() {
    Collection<TodoModel> result = repository.findAll(TaskItem.class).stream().map(converter::toModel).collect(Collectors.toList());
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
