package jp.co.anywhere.provider.service.todo;

import jp.co.anywhere.iface.TodoServiceObject;
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
public class TodoService extends AbstractService<TodoServiceObject> {

  @Inject
  private AbstractDomain<TodoServiceObject, TaskItem> domain;

  public TodoServiceObject save(TodoServiceObject todo) {
    return domain.save(todo);
  }

  public void delete(TodoServiceObject todo) {
    domain.delete(todo.getId());
  }

  public Collection<TodoServiceObject> findAll() {
    return domain.findAll();
  }

}
