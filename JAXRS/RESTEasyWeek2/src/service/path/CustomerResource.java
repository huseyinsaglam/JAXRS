package service.path;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/customer")
public class CustomerResource {

	@GET
	// her HTTP istegine kars�l�k bir tane metot kullan�labilir.eger @path annotation kullan�lmayacaksan...
	public String greeting()
	{
		String message="huseyin saglam";
		return message;
	}
	

	@POST
	// her HTTP istegine kars�l�k bir tane metot kullan�labilir.eger @path annotation kullan�lmayacaksan...
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
