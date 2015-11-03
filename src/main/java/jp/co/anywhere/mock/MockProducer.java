package jp.co.anywhere.mock;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by asari on 2015/11/03.
 */
@Dependent
public class MockProducer implements Serializable{
  /**
   *
   * @return
   */
  @Produces
  @Named("emptyCollection")
  public Collection<String> produceEmptyCollection() {
    Collection<String> list = new ArrayList<String>();
    for(int i = 0; i < 10; i++) {
      list.add("Hello " + i);
    }
    return list;
  }
}
