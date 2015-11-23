package jp.co.anywhere.consumer.todo;

import jp.co.anywhere.consumer.shared.Action;
import jp.co.anywhere.consumer.shared.interceptor.Cacheable;
import jp.co.anywhere.consumer.shared.interceptor.ClearCache;

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
  private TodoServiceProxy  proxy;

  /**
   * タスクの作成
   */
  public void create(Todo todo) {
    proxy.save(todo);

    // TODO ajax更新の場合taskの値が残ってしまうので削除処理を入れておく、なんとかならないのか
    todo.setTask("");
  }

  /**
   * タスクの削除
   */
  @ClearCache
  public void delete(Todo todo) {
    proxy.delete(todo);
  }

  public void check(Todo todo) {
    proxy.save(todo);
  }

  /**
   * タスクの取得
   * @return
   */
  @Cacheable
  public Collection<Todo> getResult() {
    return proxy.findAll();
  }
}
