package jp.co.anywhere.consumer.todo;

import jp.co.anywhere.consumer.shared.AbstractServiceProxy;
import jp.co.anywhere.iface.TodoServiceObject;
import jp.co.anywhere.provider.service.todo.TodoService;

import javax.inject.Inject;
import java.util.Collection;

/**
 * Created by asari on 2015/11/23.
 */
public class TodoServiceProxy extends AbstractServiceProxy<Todo, TodoServiceObject> {
  @Inject
  private TodoService service;

  public Todo save(Todo todo) {
    return invoke(service::save, todo);
  }

  public Collection<Todo> findAll() {
    return invoke(service::findAll);
  }

  public void delete(Todo todo) {
    invoke(service::delete, todo);
  }
}
