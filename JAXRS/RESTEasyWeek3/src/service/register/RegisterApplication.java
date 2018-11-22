package service.register;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import _01.encoded.EmployeeResource;
import _02.ContextResource;

@ApplicationPath("/root-path")
public class RegisterApplication extends Application{
	
	public Set<Object> singletions = new HashSet<Object>();
	
	
	public RegisterApplication() 
	{
		singletions.add(new EmployeeResource());
		singletions.add(new ContextResource());
	}
	
	@Override
	public Set<Object> getSingletons() {
		
		return singletions;
	}
}
