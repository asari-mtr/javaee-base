package jp.co.anywhere.rest.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by asari on 2015/11/22.
 */
@Path("/hello")
public class HelloRestAction {

  @GET
  @Path("/hello")
  @Produces("text/plain")
  public String hello() {
    return "Hello RestAction";
  }

}
