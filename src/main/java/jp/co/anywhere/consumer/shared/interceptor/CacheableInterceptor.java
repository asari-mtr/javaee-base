package jp.co.anywhere.consumer.shared.interceptor;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.io.Serializable;

/**
 * Created by asari on 2015/11/12.
 */
@Priority(Interceptor.Priority.APPLICATION)
@Interceptor
@Cacheable
public class CacheableInterceptor implements Serializable {
  private Object result;
  @AroundInvoke
  public Object aroundInvoke(InvocationContext context) throws Exception {
    if (result == null) {
      result = context.proceed();
    }
    return result;
  }
}
