package jp.co.anywhere.common;

import jp.co.anywhere.consumer.shared.Model;
import jp.co.anywhere.producer.shared.Entity;

/**
 * Created by asari on 2015/11/11.
 */
public interface Converter<M extends Model, E extends Entity> {
  M toModel(E entity);
  E toEntity(E entity, M model);
}
