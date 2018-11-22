package _01.httpResponse;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/week4")
public class HttpResponseResource {

	@GET
	@Path("/hafta4")
	// http://localhost:8080/RESTEasyWeek4/root-path/week4/hafta4
	// basarýlý donerse [200,399] degerler doner..
	public String response200()
	{
		return "response200!";
	}
	
	@GET
	@Path("/hafta4responsenull")
	// http://localhost:8080/RESTEasyWeek4/root-path/week4/hafta4responsenull
	// donus  nullsa yada metot voidse HTTP204 doner
	// No content yani icerik yok anlamýndadýr
	public String responseNull()
	{
		return null;
	}
	
	
	//Hata kodlarý [400,599] arasýnda yer alýr..
	// en bilineni HTTP404 hatasýdýr.. NotFound hatasýdýr yani sayfa bulunamadý hatasýdýr
	// HTTP 405 method not alowed
	
	@POST
	@Path("/http405")
	public String response405()
	{
		return "response405!";
	}
	// burada gordugunuz gibi yanlýs istek ile geldigimiz zaman HTTP405 hatasý alýrýz..
	// post degilde get istek ile gitseydik HTTP405 hatasý alýrdýk..
}
