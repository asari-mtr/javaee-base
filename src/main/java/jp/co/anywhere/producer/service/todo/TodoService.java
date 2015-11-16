package jp.co.anywhere.producer.service.todo;

import jp.co.anywhere.producer.shared.AbstractService;
import jp.co.anywhere.common.Converter;
import jp.co.anywhere.producer.entity.TaskItem;
import jp.co.anywhere.consumer.todo.TodoModel;
import jp.co.anywhere.producer.repository.SimpleRepository;

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

  @Override
  public TodoModel get(TodoModel todoModel) {
    // TODO 独自例外に置き換え？不要なメソッドをオーバーライドするのはちょっと変かも
    throw new UnsupportedOperationException();
  }

  public TodoModel save(TodoModel todo) {
    Long id = todo.getId();
    TaskItem e;
    if(id == null){
      e = new TaskItem();
    } else {
      e = repository.get(id);
    }
    TaskItem saved = repository.save(converter.toEntity(e, todo));

    return converter.toModel(saved);
  }

  public void delete(TodoModel todo) {
    repository.delete(todo.getId());
  }

  public Collection<TodoModel> findAll() {
    return repository.findAll(TaskItem.class).stream().map(converter::toModel).collect(Collectors.toList());
  }

}
