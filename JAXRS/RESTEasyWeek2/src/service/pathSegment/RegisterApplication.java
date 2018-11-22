package service.pathSegment;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/root-path") // pathsegment kullanabilmemiz için kesinlikle @ApplicationPath("") yerine
// @ApplicationPath("/root-path") boyle vermemiz gerekir..



//---   /*  kullanmamýz probleme neden olacaktýr
// @ApplicationPath("/root-path/*") sýkýntýya neden olur
//@ApplicationPath("/root-path") sýkýntýya neden olmaz
public class RegisterApplication extends Application{
	
	public Set<Object> singletons = new HashSet<Object>();
	
	
	public RegisterApplication()  // ilgili classlari register etmemiz gerekiyordu
	{
		singletons.add(new CarResourcePathSegment());
		
	}
	@Override
	public Set<Object> getSingletons() {
		return singletons;
		
	}

}
