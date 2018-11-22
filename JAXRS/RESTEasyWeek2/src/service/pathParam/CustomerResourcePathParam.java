package service.pathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/customer-pathparam")
public class CustomerResourcePathParam {
	
	@GET
	@Path("/pathparam/{id}")
	// http://localhost:8080/RESTEasyWeek2/customer-pathparam/pathparam/100
	public String getmessage(@PathParam("id") String customerid)
	{
		return "path param : " +customerid;
	}

}
