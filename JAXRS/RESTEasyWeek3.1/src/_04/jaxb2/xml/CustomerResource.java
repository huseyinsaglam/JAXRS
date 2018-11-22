package _04.jaxb2.xml;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/week3.2")
public class CustomerResource {
	
	@GET
	@Path("/customer")
	@Produces(MediaType.APPLICATION_XML)
	public Customer getcustomer()
	{
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("fenerbahce");
		customer.setSurname("sporkulubu");
		
		Adress adress = new Adress();
		adress.setCity("hatay");
		adress.setKat(5);
		
		customer.setAdress(adress);
		return customer;
	}

}
