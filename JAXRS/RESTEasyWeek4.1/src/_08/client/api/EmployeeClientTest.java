package _08.client.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;


public class EmployeeClientTest {

	public static void main(String[] args) {
	
		String URL="http://localhost:8080/RESTEasyWeek4.1/root-path/okey/hs";
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target(URL);
		Entity<Employee> jsonEntity = Entity.json(new Employee(1, "hs", "saglam")) ;
		// hs adresine gidip ekleme yapacagýz..
		Invocation.Builder builder= target.request(); // URL adresi cagirmamizi saglar..
		
		Response message = builder.post(jsonEntity);
		System.out.println(message.readEntity(String.class)); 
		// readEntity ile String formatýnda okuyabiliriz..

	}

}
