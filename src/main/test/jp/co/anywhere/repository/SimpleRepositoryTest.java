package jp.co.anywhere.repository;

import com.sun.javafx.tk.Toolkit;
import jp.co.anywhere.entity.TaskItem;
import jp.co.anywhere.repository.SimpleRepository;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by asari on 2015/11/07.
 */
@RunWith(Arquillian.class)
public class SimpleRepositoryTest {
  @Deployment
  public static JavaArchive createDeployment() {
    return ShrinkWrap.create(JavaArchive.class)
        .addClass(SimpleRepository.class)
        .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
  }

  @Inject
  private SimpleRepository repository;

  @Test
  public void test() {

    // ほぞん
    TaskItem taskItem = new TaskItem();
    taskItem.setTask("ミルクを買う");
    repository.save(taskItem);

    // 取得
    Collection<TaskItem> allTasks = repository.findAll(TaskItem.class);

    assertThat(allTasks.size(), is(1));
    assertThat(allTasks.iterator().next().getTask(), is("ミルクを買う"));

    fail();
  }

}
