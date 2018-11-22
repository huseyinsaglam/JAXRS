package service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class RegisterApplication extends Application{
	
	public Set<Object> singletons = new HashSet<Object>();
	
	
	public RegisterApplication()
	{
		singletons.add(new MessageService());
	}
	@Override
	public Set<Object> getSingletons() {
		return singletons;
		
	}

}
