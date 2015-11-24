package jp.co.anywhere.provider.repository;

import jp.co.anywhere.iface.TodoServiceObject;
import jp.co.anywhere.provider.service.todo.TodoService;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.transaction.api.annotation.TransactionMode;
import org.jboss.arquillian.transaction.api.annotation.Transactional;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import java.io.File;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by asari on 2015/11/07.
 */
@RunWith(Arquillian.class)
@Transactional(value = TransactionMode.COMMIT)
public class SimpleRepositoryTest {
  @Deployment
  public static WebArchive createDeployment() {
    return ShrinkWrap.create(WebArchive.class, "hoge.war")
        .addPackages(true, "jp.co.anywhere")
        .addAsWebInfResource(new File("src/main/webapp", "WEB-INF/beans.xml"))
        .addAsResource("message.properties")
        .addAsResource("resource.properties")
        .addAsResource("ValidationMessages.properties")
        .addAsResource("META-INF/persistence.xml");
  }

  @Inject
  private TodoService service;

  @Test
  public void test() {

    // ほぞん
    TodoServiceObject todo = new TodoServiceObject();
    todo.setTask("ミルクを買う");
    service.save(todo);

    // 取得
    Collection<TodoServiceObject> allTasks = service.findAll();

    assertThat(allTasks.size(), is(1));
    assertThat(allTasks.iterator().next().getTask(), is("ミルクを買う"));

  }

}
