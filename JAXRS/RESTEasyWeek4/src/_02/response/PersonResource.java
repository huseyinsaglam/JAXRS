package _02.response;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

@Path("/week4.1")
public class PersonResource {
	
	@GET
	@Path("/hafta4.1")
	// http://localhost:8080/RESTEasyWeek4/root-path/week4.1/hafta4.1
	public Response getPersonName()
	{
		String name="huseyin";
		ResponseBuilder builder = Response.ok(name);
		
		builder.header("myheader", "value");
		builder.cookie(new NewCookie("huseyin","saglam"));
		return builder.build();
	}
	
	@GET
	@Path("/hafta4.2")
	@Produces(MediaType.APPLICATION_JSON)
	// http://localhost:8080/RESTEasyWeek4/root-path/week4.1/hafta4.2
	public Response getAllPersons()
	{
		Person person1 = new Person(100, "testname1", "testsurname1");
		Person person2 = new Person(200, "testname2", "testsurname2");
		Person person3 = new Person(300, "testname3", "testsurname3");
		
		List<Person> persons = Arrays.asList(person1,person2,person3);
		
		return Response.ok(persons).build();
	}

}
