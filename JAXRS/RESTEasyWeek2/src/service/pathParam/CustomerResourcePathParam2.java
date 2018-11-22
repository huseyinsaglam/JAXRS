package service.pathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/customer-pathparam")
public class CustomerResourcePathParam2 {
	
	@GET
	@Path("/pathparam/{id}/{sayi}/{name}")
	// http://localhost:8080/RESTEasyWeek2/customer-pathparam/pathparam/100/150/huseyin
	public String getmessage(@PathParam("id") String customerid,
			@PathParam("sayi") int sayi,
			@PathParam("name") String name)
	{
		return "path param : " +customerid + " name :" +sayi + "surname :" + name;
	}

	@GET
	@Path("/order/{id : \\d+}")
	public String orderby(@PathParam("id") int id)
	{
		return "orderby : " +id ;
	}
}
