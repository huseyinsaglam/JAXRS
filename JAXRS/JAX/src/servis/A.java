package servis;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/mesage")
public class A {
	
	
	@GET
	@Path("/selam")
	public String message()
	{
		return "welcome jax rs ";
		
	}

}
