package jp.co.anywhere.action;

import jp.co.anywhere.model.TodoModel;
import jp.co.anywhere.repository.SimpleRepository;
import jp.co.anywhere.service.TodoService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
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
  public void create(TodoModel todo) {
    service.save(todo);

    // TODO ajax更新の場合taskの値が残ってしまうので削除処理を入れておく、なんとかならないのか
    todo.setTask("");
  }

  /**
   * タスクの削除
   */
  public void delete(TodoModel todo) {
    service.delete(todo);
  }

  public void check(TodoModel todo) {
    service.changeDone(todo, !todo.isDone());
  }

  /**
   * タスクの取得
   * @return
   */
  public Collection<TodoModel> getResult() {
    return service.findAll();
  }
}
