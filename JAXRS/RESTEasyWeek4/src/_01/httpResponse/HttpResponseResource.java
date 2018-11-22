package _01.httpResponse;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/week4")
public class HttpResponseResource {

	@GET
	@Path("/hafta4")
	// http://localhost:8080/RESTEasyWeek4/root-path/week4/hafta4
	// basar�l� donerse [200,399] degerler doner..
	public String response200()
	{
		return "response200!";
	}
	
	@GET
	@Path("/hafta4responsenull")
	// http://localhost:8080/RESTEasyWeek4/root-path/week4/hafta4responsenull
	// donus  nullsa yada metot voidse HTTP204 doner
	// No content yani icerik yok anlam�ndad�r
	public String responseNull()
	{
		return null;
	}
	
	
	//Hata kodlar� [400,599] aras�nda yer al�r..
	// en bilineni HTTP404 hatas�d�r.. NotFound hatas�d�r yani sayfa bulunamad� hatas�d�r
	// HTTP 405 method not alowed
	
	@POST
	@Path("/http405")
	public String response405()
	{
		return "response405!";
	}
	// burada gordugunuz gibi yanl�s istek ile geldigimiz zaman HTTP405 hatas� al�r�z..
	// post degilde get istek ile gitseydik HTTP405 hatas� al�rd�k..
}
