package jp.co.anywhere.rest.todo;

import jp.co.anywhere.iface.TodoServiceObject;
import jp.co.anywhere.provider.service.todo.TodoService;
import org.omnifaces.util.Json;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Collection;

/**
 * Created by asari on 2015/11/22.
 */
@Path("todo")
public class TodoRestAction {

  @Inject
  private TodoService service;

  @GET
  @Path("/list")
  @Produces("text/plain")
  public String getList() {
    Collection<TodoServiceObject> list = service.findAll();

    return Json.encode(list);
  }

}
