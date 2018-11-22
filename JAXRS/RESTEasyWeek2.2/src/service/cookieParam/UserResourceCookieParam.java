package service.cookieParam;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/user-cookieParam")
public class UserResourceCookieParam {

	// The @javax.ws.rs.CookieParam annotation allows you to inject cookies sent
	// by a client request into your JAX-RS resource methods.

	@GET
	@Path("/addCookie")
	//http://localhost:8080/RESTEasyWeek2.2/root-path/user-cookieParam/addCookie
	public Response addCookie() {
		String resultMessage = "addCokiee is invoked!";
		ResponseBuilder builder = Response.ok(resultMessage);
		builder.cookie(new NewCookie("cookieName", "cookieValue"));
		// http://www.injavawetrust.com/pure-java-08-declare-var-args/

		return builder.build();
	}

	@GET
	@Path("/getCookie")

	// http://localhost:8080/RESTEasyWeek2.2/root-path/user-cookieParam/getCookie
	public Response getCookie(@CookieParam("cookieName") String cookie) {
		String resultMessage = "getCookie is invoked!";
		ResponseBuilder builder = Response.ok(resultMessage + " " + cookie);

		return builder.build();
	}
	
	//cookiler ozellesmis header bilgileridir.
	@GET
	@Path("/getCookieWithContext")
	
	// http://localhost:8080/RESTEasyWeek2.2/root-path/user-cookieParam/getCookieWithContext
	public Response getCookieWithContext(@Context HttpHeaders headers){
		String result = "getCookieWithContext";
		for(String name : headers.getCookies().keySet()){
			Cookie cookie = headers.getCookies().get(name);
			result = result + "Cookie : " + cookie.getName() + " ," + cookie.getValue();
		}
		
		ResponseBuilder builder = Response.ok(result);
		return builder.build();
	}
}
