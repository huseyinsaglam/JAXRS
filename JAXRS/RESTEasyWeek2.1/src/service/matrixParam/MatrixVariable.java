package service.matrixParam;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;

@Path("/car-matrix")
public class MatrixVariable {
	
	@GET
	@Path("/matrix")
	
	// http://localhost:8080/RESTEasyWeek2.1/root-path/car-matrix/matrix;name=huseyin;color=red;color=blue;
	// http://localhost:8080/RESTEasyWeek2.1/car-matrix/matrix;name=huseyin;color=red;color=blue;
	public String matrixParam(@MatrixParam("name") String name,
			@MatrixParam("color") List<String> colors)
	{
		return "name : " +name + "& "+ "colors : " + colors ;
	}

}
