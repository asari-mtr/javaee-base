package jp.co.anywhere.consumer.shared.interceptor;

import jp.co.anywhere.consumer.shared.cache.SimpleCache;

import javax.annotation.Priority;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.io.Serializable;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by asari on 2015/11/12.
 */
@Priority(Interceptor.Priority.APPLICATION)
@Interceptor
@Cacheable
@Dependent
public class CacheableInterceptor implements Serializable {

  @Inject
  @Named("requestCache")
  private SimpleCache result;

  @AroundInvoke
  public Object aroundInvoke(InvocationContext context) throws Exception {
    String cacheKey = createCacheKey(context.getParameters());
    if (!result.isCached(cacheKey)) {
      result.setKey(cacheKey);
      result.setValue(context.proceed());
    }
    return result.getValue();
  }

  private String createCacheKey(Object[] parameters) {
    return Stream.of(parameters).map(Object::toString).collect(Collectors.joining(":"));
  }

}
