package _05.client.api;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

public class MessageClientTest2 {

	public static void main(String[] args) {
		
		String URL="http://localhost:8080/RESTEasyWeek4.1/root-path/week4.2/listmessages";
		Client client = ClientBuilder.newClient();
	    WebTarget target = client.target(URL);
	    Invocation.Builder builder=target.request();
	    List<String> listmessages= builder.get(new GenericType<List<String>> () {});
	    System.out.println(listmessages);

	}

}
