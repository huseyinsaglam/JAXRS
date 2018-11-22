package servis;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class B extends Application {

	public Set<Object> aa = new HashSet<Object>();
	
	
	
	public B() {
	   aa.add(new A());
	}



	@Override
	public Set<Object> getSingletons() {
		
		return aa;
	}
}
