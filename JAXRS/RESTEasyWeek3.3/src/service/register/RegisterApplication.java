package service.register;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import _06.json.jettison.ProductResourceJettison;





@ApplicationPath("/root-path")
public class RegisterApplication extends Application{
	
	public Set<Object> singletions = new HashSet<Object>();
	
	
	public RegisterApplication() 
	{
		singletions.add(new ProductResourceJettison());
		
	}
	
	@Override
	public Set<Object> getSingletons() {
		
		return singletions;
	}
}
