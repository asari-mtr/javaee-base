package jp.co.anywhere.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 * Created by asari on 2015/11/21.
 */
@Dependent
public class LoggerProducer {

  @Produces
  public Logger getLogger(InjectionPoint point) {
    return LoggerFactory.getLogger(point.getMember().getDeclaringClass());
  }
}
