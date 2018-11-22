package service.pathSegment;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.PathSegment;

@Path("/car-pathSegment")
public class CarResourcePathSegment {
	
	@GET
	@Path("/car/{search : criteria}")
	// http://localhost:8080/RESTEasyWeek2/root-path/car-pathSegment/car/criteria;brand=bmw;color=red;color=blue;
	public String getCar(@PathParam("search") PathSegment pathSegment) {
		String brand = pathSegment.getMatrixParameters().getFirst("brand");
		List<String> colors = pathSegment.getMatrixParameters().get("color");
		return "brand : " + brand + " colors : " + colors;
	}

}
