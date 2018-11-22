package service.queryParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Path("/queryParam")
public class QueryParams {

	@GET
	@Path("/query")
	
	// http://localhost:8080/RESTEasyWeek2.1/queryParam/query?id=5
	public String queryParam(@QueryParam("id") int id)
	{
		return "queryParam :" + id;
	}
	
	@GET
	@Path("/books")
	// http://localhost:8080/RESTEasyWeek2.1/root-path/queryParam/books?start=25&name=huseyin
	public String queryParamlar(@QueryParam("start") int id,@QueryParam("name") String name)
	{
		return "queryParam :" + id + " : " + name;
	}
	
	
	
	
	@GET
	@Path("/query-param")
	
	// http://localhost:8080/RESTEasyWeek2.1/root-path/queryParam/query-param?sayi=15
	public String getInfoqueryparam(@Context UriInfo uriInfo)
	{
		
		String query = uriInfo.getQueryParameters().getFirst("sayi");
		return query;
	}
}
