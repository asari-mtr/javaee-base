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
@Transactional
public class TodoService extends AbstractService<TodoModel> {

  @Inject
  private SimpleRepository<TaskItem> repository;

  @Inject
  private Converter<TodoModel, TaskItem> converter;

  public void save(TodoModel todo) {
    repository.save(converter.toEntity(new TaskItem(), todo));
  }

  public void delete(TodoModel todo) {
    repository.delete(todo.getId());
  }

  public Collection<TodoModel> findAll() {
    Collection<TodoModel> result = repository.findAll(TaskItem.class).stream().map(converter::toModel).collect(Collectors.toList());
    return result;
  }

  public void update(TodoModel todo) {
    TaskItem taskItem = repository.get(todo.getId());
    repository.save(converter.toEntity(taskItem, todo));
  }

}
