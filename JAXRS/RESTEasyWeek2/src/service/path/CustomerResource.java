package service.path;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/customer")
public class CustomerResource {

	@GET
	// her HTTP istegine karsılık bir tane metot kullanılabilir.eger @path annotation kullanılmayacaksan...
	public String greeting()
	{
		String message="huseyin saglam";
		return message;
	}
	

	@POST
	// her HTTP istegine karsılık bir tane metot kullanılabilir.eger @path annotation kullanılmayacaksan...
	public String greetingPOST()
	{
		String message="huseyin saglam POST";
		return message;
	}
	
	@GET
	@Path("/customers")
	public String getgreeting()
	{
		String message="huseyin saglam getgreeting";
		return message;
	}
}
