package _01.encoded;

import javax.ws.rs.Encoded;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/week3")
public class EmployeeResource {
	
	@GET
	@Path("/hafta3")
	// http://localhost:8080/RESTEasyWeek3/root-path/week3/hafta3
	public String getGreeting()
	{
		return "message";
	}
	
	@GET
	@Path("/encoded")
	// http://localhost:8080/RESTEasyWeek3/root-path/week3/encoded?name=["huseyin saglam"] 
	// bu row hali imis
	// cýktý = %5B%22huseyin%20saglam%22%5D
	public String namegreetingEncoded(@Encoded @QueryParam("name") String name)
	{
		return name;
	}
	
	@GET
	@Path("/noencoded")
	//  http://localhost:8080/RESTEasyWeek3/root-path/week3/noencoded?name=["huseyin saglam"]
	// cýktý = ["huseyin saglam"]
	public String namegreeting(@QueryParam("name") String name)
	{
		return name;
	}

}
