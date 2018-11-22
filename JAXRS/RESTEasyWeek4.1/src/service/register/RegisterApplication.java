package service.register;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import _05.client.api.MessageResource;
import _06.client.api.LibaryResource;
import _07.client.api.LibaryResource2;
import _08.client.api.EmployeeResource;
import _09.client.api.EmployeeResource2;






@ApplicationPath("/root-path")
public class RegisterApplication extends Application{
	
	public Set<Object> singletions = new HashSet<Object>();
	
	
	public RegisterApplication() 
	{
		singletions.add(new MessageResource());
		singletions.add(new LibaryResource());
		singletions.add(new LibaryResource2());
		singletions.add(new EmployeeResource()); 
		singletions.add(new EmployeeResource2());
	}
	
	@Override
	public Set<Object> getSingletons() {
		
		return singletions;
	}
}
