package jp.co.anywhere.provider.shared;

import jp.co.anywhere.iface.Model;

/**
 * Created by asari on 2015/11/11.
 */
public interface Converter<M extends Model, E extends Entity> {
  M toModel(E entity);
  E toEntity(E entity, M model);
}
