package _01.conneg.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import _01.model.Customer;

@Path("/customer-root")
public class CustomerResource {

	@GET
	@Path("/hello")
	// http://localhost:8080/RESTEasyWeek05/root-path/customer-root/hello
	public String hello() {
		return "it is works!";
	}

	@GET
	@Path("/customer")
	@Produces(MediaType.TEXT_HTML)
	public String getCustomerText() {
		System.out.println("getCustomerText");
		return new Customer(1, "levent").toString();
	}

	@GET
	@Path("/customer")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomerJSON() {
		System.out.println("getCustomerJSON");
		return new Customer(1, "levent");
	}

	@GET
	@Path("/customer")
	@Produces(MediaType.APPLICATION_XML)
	public Customer getCustomerXML() {
		System.out.println("getCustomerXML");
		return new Customer(1, "levent");
	}
	
	@GET
	@Path("/customerFormat")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Customer getCustomerFormat() {
		System.out.println("getCustomerFormat");
		return new Customer(1, "levent");
	}
}
