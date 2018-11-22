package _06.client.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/week4.3")
public class LibaryResource {
	
	@GET
	@Path("/hafta4.3")
	@Produces(MediaType.APPLICATION_JSON)
	// http://localhost:8080/RESTEasyWeek4.1/root-path/week4.3/hafta4.3
	public Response response()
	{
		String name="huseyin saglam";
		ResponseBuilder builder = Response.ok(name);
		return builder.build();
	}

}
