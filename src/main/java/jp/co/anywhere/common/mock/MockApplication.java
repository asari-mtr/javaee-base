package jp.co.anywhere.common.mock;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

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
