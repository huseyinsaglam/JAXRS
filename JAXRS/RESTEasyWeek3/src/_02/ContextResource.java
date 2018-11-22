package _02;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;


@Path("/week3")
public class ContextResource {
	
	
    // javax.ws.rs.core.HttpHeaders
	// javax.ws.rs.core.UriInfo
	// javax.ws.rs.core.Request
	// javax.servlet.http.HttpServletRequest
	// javax.servlet.http.HttpServletResponse
	// javax.servlet.ServletConfig
	// javax.servlet.ServletContext
	// javax.ws.rs.core.SecurityContext


// context , config , Request , Response gibi objeleri inject eder.
// Sonucta http ile calýsýyoruz...

	@GET
	@Path("/week3.2")
	// http://localhost:8080/RESTEasyWeek3/root-path/week3/week3.2
	// sonuc = /RESTEasyWeek3
	
	
	// http://localhost:8080/...contextPath.../root-path/...Pathinfo..
	public String ContextPath(@Context ServletContext context)
	{
		String contextPath = context.getContextPath();
		return contextPath;
	}
	
	@GET
	@Path("/week3.3")
	// http://localhost:8080/RESTEasyWeek3/root-path/week3/week3.3
	// /week3/week3.3
	public String injectHttpServletRequest(@Context HttpServletRequest request)
	{
		String requestInfo = request.getPathInfo();
		return requestInfo;
	}

}
