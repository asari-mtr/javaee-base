package jp.co.anywhere.consumer.shared.validator;

import jp.co.anywhere.common.util.StringHelper;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by asari on 2015/11/21.
 */
public class EmailValidator implements ConstraintValidator<Email, String> {

  public static final String EMAIL_REGEX = "^[a-zA-Z0-9!#$%&'_`/=~\\*\\+\\-\\?\\^\\{\\|\\}]+(\\.[a-zA-Z0-9!#$%&'_`/=~\\*\\+\\-\\?\\^\\{\\|\\}]+)*+(.*)@[a-zA-Z0-9][a-zA-Z0-9\\-]*(\\.[a-zA-Z0-9\\-]+)+$";

  @Override
  public void initialize(Email email) {

  }

  @Override
  public boolean isValid(String mailAddress, ConstraintValidatorContext constraintValidatorContext) {
    if(StringHelper.isEmpty(mailAddress)){
      return true;
    }
    return mailAddress.matches(EMAIL_REGEX);
  }
}
