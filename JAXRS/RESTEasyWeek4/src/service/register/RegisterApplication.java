package service.register;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import _01.httpResponse.HttpResponseResource;
import _02.response.PersonResource;
import _03.exception.CustomerResource;
import _04.exceptionMapper.CustomerResourceMapper;





@ApplicationPath("/root-path")
public class RegisterApplication extends Application{
	
	public Set<Object> singletions = new HashSet<Object>();
	
	
	public RegisterApplication() 
	{
		singletions.add(new HttpResponseResource());
		singletions.add(new PersonResource());
		singletions.add(new CustomerResource());
		singletions.add(new CustomerResourceMapper());
	}
	
	@Override
	public Set<Object> getSingletons() {
		
		return singletions;
	}
}
