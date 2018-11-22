package service.formParam2;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.jboss.resteasy.annotations.Form;

@Path("/formparamslar")
public class FormParams {

	@POST
	@Path("/param")
	// http://localhost:8080/RESTEasyWeek2.1/root-path/formparamslar/param
	public String form(@FormParam("name") String name,@FormParam("surname") String surname)
	{
		// formda yaz�lan datalar� @formpath ile �ekiyoruz...
		return "inject OK...." + name + "  " + surname;
	}
	
	
	
	@POST
	@Path("/personform") // @form annotation sadece RESTEasy de vard�r...
	// http://localhost:8080/RESTEasyWeek2.1/root-path/formparamslar/personform
	public String PersonForm(@Form Person person)
	{
		return "PersonForm :" +person;
	}
}
