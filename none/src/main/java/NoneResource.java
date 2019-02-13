import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Path("") public class NoneResource {

  public NoneResource(@Context UriInfo uriInfo) { }

  @GET public String getResponse() {
    return "none";
  }

}
