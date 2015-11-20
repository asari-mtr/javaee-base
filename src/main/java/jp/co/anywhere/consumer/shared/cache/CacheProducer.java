package jp.co.anywhere.consumer.shared.cache;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * リクエストスコープの値を一つだけキャッシュします。
 *
 * 主に検索時のキャッシュようですが拡張するかも。
 *
 * CacheProducer(RequestScoped)とAction(RequestScoped)とスコープを合わせておく必要がある。
 * CacheProducerをDependedにしていたら、ActionのスコープとProducerのスコープが違うせいで
 * clearイベントを処理するインスタンスが変わってしまっていたので、使用・拡張する場合はスコープに注意
 * Created by asari on 2015/11/12.
 */
@RequestScoped
public class CacheProducer implements Serializable {

  @Inject
  @Named("simpleCache")
  private SimpleCache requestCache;

  @Produces
  @Named("requestCache")
  public SimpleCache produceRequestCache() {
    return requestCache;
  }

  public void clear(@Observes CacheClear cacheClear) {
    requestCache.clear();
  }

}
