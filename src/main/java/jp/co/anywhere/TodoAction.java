package jp.co.anywhere;

import jp.co.anywhere.action.Action;
import jp.co.anywhere.entity.Entity;
import jp.co.anywhere.entity.TaskItem;
import jp.co.anywhere.model.TodoModel;
import jp.co.anywhere.repository.SimpleRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by asari on 2015/11/07.
 */
@RequestScoped
@Named
public class TodoAction implements Action {

  @Inject
  private SimpleRepository repository;

  /**
   * タスクの作成
   */
  @Transactional
  public void create(TodoModel todo) {
    TaskItem taskItem = new TaskItem();
    taskItem.setTask(todo.getTask());

    repository.save(taskItem);

    // TODO ajax更新の場合taskの値が残ってしまうので削除処理を入れておく、なんとかならないのか
    todo.setTask("");
  }

  /**
   * タスクの削除
   */
  @Transactional
  public void delete(TodoModel todo) {
    repository.delete(TaskItem.class, todo.getId());
  }

  /**
   * タスクの取得
   * @return
   */
  public Collection<TodoModel> getResult() {
    Collection<TodoModel> result = repository.findAll(TaskItem.class).stream().map(i -> {
      TodoModel todoModel = new TodoModel();
      todoModel.setId(i.getId());
      todoModel.setDone(i.isDone());
      todoModel.setTask(i.getTask());
      return todoModel;
    }).collect(Collectors.toList());
    return result;
  }
}
