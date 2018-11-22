package service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
//---   /*  kullanmamýz probleme neden olacaktýr
// @ApplicationPath("/root-path/*") sýkýntýya neden olur
//@ApplicationPath("/root-path") sýkýntýya neden olmaz
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
