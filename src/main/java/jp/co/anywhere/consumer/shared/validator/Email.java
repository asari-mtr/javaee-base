package jp.co.anywhere.consumer.shared.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by asari on 2015/11/21.
 */
@Constraint(validatedBy = EmailValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface
  Email {

  String message() default "{valid.email}";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
