package _05.client.api;


import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/week4.2")
public class MessageResource {
	
	@GET
	@Path("/client-api")
	// http://localhost:8080/RESTEasyWeek4.1/root-path/week4.2/client-api
	public String message()
	{
		return "client APi WELCOME!!";
	}
	
	@GET
	@Path("/listmessages")
	@Produces(MediaType.APPLICATION_JSON)
	// http://localhost:8080/RESTEasyWeek4.1/root-path/week4.2/listmessages
	public List<String> messages()
	{
		
		return Arrays.asList("ali","huseyin","fenerbahce");
	}

}
