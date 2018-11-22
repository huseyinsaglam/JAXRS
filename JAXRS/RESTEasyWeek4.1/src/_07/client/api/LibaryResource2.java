package _07.client.api;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/week4.4")
public class LibaryResource2 {
	

	@GET
	@Path("/hafta4.4/{isbn}")
	@Produces(MediaType.APPLICATION_JSON)
	// http://localhost:8080/RESTEasyWeek4.1/root-path/week4.4/hafta4.4/ff
	public Response response(@PathParam("isbn") String isbn)
	{
		Book book = new Book(isbn, "kanarya kanadi");
		ResponseBuilder builder =Response.ok(book);
		return builder.build();
	}

}
