package service.path;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/messages")
public class MessageService {
	
	@GET
	@Path("/selam")
	public String getmessage()

	{
		return "Welcome Restfull Easy!!";
	}
}
