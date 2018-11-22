package service.beanParam;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/root-path")
//---   /*  kullanmamız probleme neden olacaktır
// @ApplicationPath("/root-path/*") sıkıntıya neden olur
//@ApplicationPath("/root-path") sıkıntıya neden olmaz
public class RegisterApplication extends Application{
	
	public Set<Object> singletons = new HashSet<Object>();
	
	
	public RegisterApplication()  // ilgili classlari register etmemiz gerekiyordu
	{
		singletons.add(new ProductResourceBeanParam());
			}
	@Override
	public Set<Object> getSingletons() {
		return singletons;
		
	}

}
