package service.register;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import _05.json.jackson.CustomerResource;
import _05.json2.jackson.PersonResource;




@ApplicationPath("/root-path")
public class RegisterApplication extends Application{
	
	public Set<Object> singletions = new HashSet<Object>();
	
	
	public RegisterApplication() 
	{
		singletions.add(new CustomerResource());
		singletions.add(new PersonResource());
	}
	
	@Override
	public Set<Object> getSingletons() {
		
		return singletions;
	}
}
