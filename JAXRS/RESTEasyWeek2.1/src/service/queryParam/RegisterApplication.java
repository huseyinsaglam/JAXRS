package service.queryParam;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/root-path") // pathsegment kullanabilmemiz i�in kesinlikle @ApplicationPath("") yerine
// @ApplicationPath("/root-path") boyle vermemiz gerekir..



//---   /*  kullanmam�z probleme neden olacakt�r
// @ApplicationPath("/root-path/*") s�k�nt�ya neden olur
//@ApplicationPath("/root-path") s�k�nt�ya neden olmaz
public class RegisterApplication extends Application{
	
	public Set<Object> singletons = new HashSet<Object>();
	
	
	public RegisterApplication()  // ilgili classlari register etmemiz gerekiyordu
	{
		singletons.add(new QueryParams());
		
	}
	@Override
	public Set<Object> getSingletons() {
		return singletons;
		
	}

}
