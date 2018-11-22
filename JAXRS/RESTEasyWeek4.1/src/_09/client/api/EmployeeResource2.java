package _09.client.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/okeyxml")
public class EmployeeResource2 {
	
	@POST
	@Path("/hsxml")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.TEXT_PLAIN)
	public String addEmployee(Employee employee)
	{
		System.out.println("addEmployee basarili eklendi");
		System.out.println(employee);
		
		return "Huseyin Saglam Fenerbahce Spor kulubu ";
	}

}
