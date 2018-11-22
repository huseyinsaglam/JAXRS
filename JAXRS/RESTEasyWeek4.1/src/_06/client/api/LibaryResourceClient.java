package _06.client.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class LibaryResourceClient {

	public static void main(String[] args) {
		
		String URL="http://localhost:8080/RESTEasyWeek4.1/root-path/week4.3/hafta4.3";
		Client client =ClientBuilder.newClient();
		WebTarget target = client.target(URL);
		Invocation.Builder builder = target.request();
		
		
		Response response = builder.get();
		String message= response.readEntity(String.class);
		System.out.println(message);
		
		

	}

}
