package _04.exceptionMapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import _03.exception.Customer;

@Path("/customer-exception-mapper")
public class CustomerResourceMapper {

	@GET
	@Path("/customer/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomer(@PathParam("id") int id) {

		CustomerService service = new CustomerService();

		Customer customer = service.findCustomer(id); //new Customer(1, "bestCustomer");
		if (customer == null) {
			throw new CustomerNotFoundException("Could not find customer id : " + id);
		}
		return customer;

	}

}
