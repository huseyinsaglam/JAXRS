package _05.client.api;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;



public class MessageClientTest {



	public static void main(String[] args) {
	
		String URL = "http://localhost:8080/RESTEasyWeek4.1/root-path/week4.2/client-api";
		Client client = ClientBuilder.newClient();  //newClient yeni bir Client objesi olusturur.
	    WebTarget target= client.target(URL); //WebTarget objesi olusturmak icin client objesinden yararlaniriz.
	    //WebTarget , belirtigimiz URI adresini cagirmamizi/ invoke etmemizi saglar.
	    Invocation.Builder builder =target.request();
	    
	    String messages = builder.get(String.class);
	    System.out.println(messages);
	    
	 

	}

}

//Client arabirimi , JAX-RS client API nin giris noktasidir.
//Client objeleri , socket connection acmak/yonetmekten sorumludur.
//Client objleerini ClientBuilder abstract classi yardimiyla olustururz.

