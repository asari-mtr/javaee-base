package jp.co.anywhere.mock;

import jp.co.anywhere.entity.TaskItem;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import java.util.Collection;
import java.util.List;

/**
 * Created by asari on 2015/11/07.
 */
@Singleton
@Startup
public class MockApplication {

  @PostConstruct
  public void init () {
    System.out.println("init --------");
  }

}
