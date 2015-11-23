package jp.co.anywhere.provider.shared;

import jp.co.anywhere.iface.ServiceObject;

/**
 * Created by asari on 2015/11/11.
 */
public interface EntityConverter<SO extends ServiceObject, E extends Entity> {
  SO toServiceObject(E entity);
  E toEntity(E entity, SO serviceObject);
}
