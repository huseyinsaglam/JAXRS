package service.register;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import _04.jaxb.xml.PersonResource;
import _04.jaxb2.xml.CustomerResource;


@ApplicationPath("/root-path")
public class RegisterApplication extends Application{
	
	public Set<Object> singletions = new HashSet<Object>();
	
	
	public RegisterApplication() 
	{
		singletions.add(new PersonResource());
		singletions.add(new CustomerResource());
	}
	
	@Override
	public Set<Object> getSingletons() {
		
		return singletions;
	}
}
