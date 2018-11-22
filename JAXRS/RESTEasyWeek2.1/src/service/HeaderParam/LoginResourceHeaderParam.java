package service.HeaderParam;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;

@Path("/login-headerParam")
public class LoginResourceHeaderParam {

	@GET
	@Path("/userAgent")
	// http://localhost:8080/RESTEasyWeek2.1/login-headerParam/userAgent

	// @HeaderParam annotation ile header bilgilerini inject edebiliriz.
	public String getUserAgent(@HeaderParam("user-agent") String userAgent) {
		return "userAgent : " + userAgent;
	}

	@GET
	@Path("/headerInformation")
	// http://localhost:8080/RESTEasyWeek2.1/login-headerParam/headerInformation
	public String getHeadersInformation(@Context HttpHeaders headers) {
		String message = "";
		for (String headerName : headers.getRequestHeaders().keySet()) {
			message = message + "<br/>" + headerName + ":" + headers.getRequestHeader(headerName);
		}
		return message;
	}
}

// The @HeaderParam annotation allows you to map a request HTTP header to your
// method invocation.