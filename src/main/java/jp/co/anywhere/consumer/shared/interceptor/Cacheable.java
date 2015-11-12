package jp.co.anywhere.consumer.shared.interceptor;

import javax.interceptor.InterceptorBinding;
import java.lang.annotation.*;

/**
 * Created by asari on 2015/11/12.
 */
@InterceptorBinding
@Inherited
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Cacheable {
}
