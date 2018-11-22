package _04.jaxb.xml;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;



@Path("/week")
public class PersonResource {
	
	@GET
	@Path("/person")
	@Produces(MediaType.APPLICATION_XML)
	public Person getPersone()
	{
		Person person = new Person(1, "huseyin", "saglam");
		return person;
		
	}
	
	@GET
	@Path("/personlist")
	@Produces(MediaType.APPLICATION_XML)
	public List<Person> PersonList()
	{
		Person person1 = new Person(1, "huseyin", "saglam");
		Person person2 = new Person(2, "merve", "saglam");
		Person person3 = new Person(3, "nevin", "saglam");
		
		return Arrays.asList(person1,person2,person3);
	}
	
	@GET
	@Path("/personArray")
	@Produces(MediaType.APPLICATION_XML)
	public Person[] PersonArray()
	{
		Person person1 = new Person(1, "huseyin", "saglam");
		Person person2 = new Person(2, "merve", "saglam");
		Person person3 = new Person(3, "nevin", "saglam");
		
		Person[] personArray = new Person[] {person1,person2,person3};
		return personArray;
	}

}
