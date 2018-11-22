package _02.hateoas;

public class RichardsonModel {

}

// Richardson modelinde 3 tane faktor RESTFul web servicelerin gelismislik/olgunluk seviyesini belirtir.

// URI (uniform resource identifier)
// HTTP methods
// Hypermedia

// Level Zero
// Level One
// Level Two
// Level Three

// -------
// LEVEL ZERO
// bu level tipik ozelligi ; single URI , single method
// servisin tek bir giris noktasi ve tek bir metot kullanilmakta (genelde http post)
// bu yaklasim SOAP web servicelerinde yer almaktair. tek giris noktasi ve http post
// XML-rpc 

// Level ONE
//---------
// multiple uri , single method
// burada birden fazla uri var , fakat yine tek tip method yer almakta (HTTP POST)

// Level TWO
//---------
//multiple uri , multiple method
// CRUD -> create (post) , read (get) , update(put), delete (delete)

// Level THREE
//-----------
// ,multiple uri , multiple methods , hypermedia/hateoas

//The point of hypermedia controls is that they tell us what we can do next, 
//and the URI of the resource we need to manipulate to do it.
// Martin Fowler

// https://martinfowler.com/articles/richardsonMaturityModel.html
