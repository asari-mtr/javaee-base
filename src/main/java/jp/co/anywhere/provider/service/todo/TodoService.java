package jp.co.anywhere.provider.service.todo;

import jp.co.anywhere.iface.TodoModel;
import jp.co.anywhere.provider.shared.AbstractDomain;
import jp.co.anywhere.provider.entity.TaskItem;
import jp.co.anywhere.provider.shared.AbstractService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.Collection;

/**
 * Created by asari on 2015/11/11.
 */
@Transactional
public class TodoService extends AbstractService<TodoModel> {

  @Inject
  private AbstractDomain<TodoModel, TaskItem> domain;

  public TodoModel save(TodoModel todo) {
    return domain.save(todo);
  }

  public void delete(TodoModel todo) {
    domain.delete(todo.getId());
  }

  public Collection<TodoModel> findAll() {
    return domain.findAll();
  }

}
