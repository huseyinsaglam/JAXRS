package service.formParam;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/formparamslar")
public class FormParams {

	@POST
	@Path("/param")
	// http://localhost:8080/RESTEasyWeek2.1/root-path/formparamslar/param
	public String form(@FormParam("name") String name,@FormParam("surname") String surname)
	{
		// formda yazýlan datalarý @formpath ile çekiyoruz...
		return "inject OK...." + name + "  " + surname;
	}
}
