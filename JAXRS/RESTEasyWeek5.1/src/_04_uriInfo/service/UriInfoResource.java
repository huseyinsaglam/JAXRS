package _04_uriInfo.service;

import java.net.URI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

@Path("/uriInfo-path")
public class UriInfoResource {

	@GET
	@Path("/test1")
	//http://localhost:8080/RESTEasyWeek5.1/root-path/uriInfo-path/test1?queryParam=value1
	public String test1UriInfo(@Context UriInfo uriInfo) {

		URI requestURI = uriInfo.getRequestUri(); 
		// http://localhost:8080/RESTEasyWeek5.1/root-path/uriInfo-path/test1?queryParam=value1
		//getRequestUri metodu , absolute URI doner ek olarak query paremetresiyle birlikte.
		//Get the absolute request URI including any query parameters.
		
		URI absolutePathURI = uriInfo.getAbsolutePath();
		// http://localhost:8080/RESTEasyWeek5.1/root-path/uriInfo-path/test1
		//Get the absolute path of the request. This includes everything preceding the path (host, port etc) but excludes query parameters.
		//query paremetresini donmez.
		
		//Get the base URI of the application. URIs of root resource classes are all relative to this base URI.
		URI baseURI = uriInfo.getBaseUri();
        // http://localhost:8080/RESTEasyWeek5.1/root-path/
		
	    System.out.println(requestURI);
		System.out.println(absolutePathURI);
		System.out.println(baseURI);

		return "UriInfoResource#test1UriInfo";
	}
	
	@GET
	@Path("/test2")
	// http://localhost:8080/RESTEasyWeek5.1/root-path/uriInfo-path/test2
	public String test2UriInfo(@Context UriInfo uriInfo) {

		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.queryParam("startIndex", 10);
		builder.queryParam("endIndex", 20);
		URI uri = builder.build();
		
		return uri.toString();
	}
	
}
