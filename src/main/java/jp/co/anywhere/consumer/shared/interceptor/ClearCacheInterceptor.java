package jp.co.anywhere.consumer.shared.interceptor;

import javax.annotation.Priority;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.io.Serializable;

/**
 * Created by asari on 2015/11/12.
 */
@Priority(Interceptor.Priority.APPLICATION)
@Interceptor
@ClearCache
@Dependent
public class ClearCacheInterceptor implements Serializable {

  @Inject
  private Event<jp.co.anywhere.consumer.shared.cache.CacheClear> clearEvent;

  @Inject
  private jp.co.anywhere.consumer.shared.cache.CacheClear cacheClear;


  @AroundInvoke
  public Object aroundInvoke(InvocationContext context) throws Exception {
    Object result = context.proceed();

    // キャッシュクリア
    clearEvent.fire(cacheClear);

    return result;
  }

}
