package jp.co.anywhere.producer.shared;

/**
 * Created by asari on 2015/11/11.
 */

import jp.co.anywhere.common.Service;
import jp.co.anywhere.consumer.shared.Model;

public abstract class AbstractService<E extends Model> implements Service<E> {
}
