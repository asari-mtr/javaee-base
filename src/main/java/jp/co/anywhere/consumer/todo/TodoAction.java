package jp.co.anywhere.consumer.todo;

import jp.co.anywhere.consumer.shared.Action;
import jp.co.anywhere.consumer.shared.interceptor.ClearCache;
import jp.co.anywhere.consumer.shared.interceptor.Cacheable;
import jp.co.anywhere.iface.TodoServiceObject;
import jp.co.anywhere.provider.service.todo.TodoService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collection;

/**
 * Created by asari on 2015/11/07.
 */
@RequestScoped
@Named
public class TodoAction implements Action {

  @Inject
  private TodoService service;

  /**
   * タスクの作成
   */
  public void create(TodoServiceObject todo) {
    service.save(todo);

    // TODO ajax更新の場合taskの値が残ってしまうので削除処理を入れておく、なんとかならないのか
    todo.setTask("");
  }

  /**
   * タスクの削除
   */
  @ClearCache
  public void delete(TodoServiceObject todo) {
    service.delete(todo);
  }

  public void check(TodoServiceObject todo) {
    service.save(todo);
  }

  /**
   * タスクの取得
   * @return
   */
  @Cacheable
  public Collection<TodoServiceObject> getResult() {
    return service.findAll();
  }
}
