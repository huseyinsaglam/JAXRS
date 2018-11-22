package _09.client.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class EmployeeClientTest {

	public static void main(String[] args) {
	
		
		String URL="http://localhost:8080/RESTEasyWeek4.1/root-path/okeyxml/hsxml";
	    Client client =	ClientBuilder.newClient();
	    WebTarget target =client.target(URL);
	    Entity<Employee> xmlEntity = Entity.xml(new Employee(2, "nevin", "saglam"));
	    Invocation.Builder builder = target.request();
	    
	    Response message =builder.post(xmlEntity);
	    System.out.println(message.readEntity(String.class));

	}

}
