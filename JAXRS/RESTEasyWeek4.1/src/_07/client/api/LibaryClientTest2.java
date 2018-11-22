package _07.client.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response; 

public class LibaryClientTest2 {

	public static void main(String[] args) {
	
	    // String URL1 = "http://localhost:8080/RESTEasyWeek4.1/root-path/week4.4/hafta4.4/ff";
	    
	    String URL2 = "http://localhost:8080/RESTEasyWeek4.1/root-path/week4.4/hafta4.4/{isbn}";
	    Client client = ClientBuilder.newClient();
	   //  WebTarget target1 = client.target(URL1);
	     WebTarget target = client.target(URL2).resolveTemplate("isbn",200);
	    Invocation.Builder builder = target.request();
	    
	    
	   Response response =  builder.get();
	 //  Book book = response.readEntity(Book.class);
	   
	   Book book = response.readEntity(new GenericType<Book> () {} );
	   
	   System.out.println(book);
	    

	}

}
