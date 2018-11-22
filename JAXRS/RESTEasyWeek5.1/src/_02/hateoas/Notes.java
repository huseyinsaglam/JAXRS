package _02.hateoas;

public class Notes {

}

// https://twitter.com/leonardr


// HATEOAS -> hypermedia as the engine of application state

// bir web sitesine girdigimizde bir cok link yer almaktadir.
// bunlarin yerini/tam adresini ezberlemeyiz. siteye bir kere girdigimzide
// linklere tiklayarak istedigimiz icerigi/contenti buluruz.

// HATEOAS kavramida bu mantaiktan yola cikmaktadir.
// RESTFul web servicelerinin extra olarak bilgi sunmasi ve boylece tek bir
// giris noktasindan sonra client/istemcinin kolayca uygulamayi kullanmasini
// hedefler. daha az dokumantasyon.

// The idea of HATEOAS is that your data format provides extra information on how to change the state of your application. 

// Hypermedia helps make clients more flexible by avoiding hard-coding REST URLs. 
// It can also help in self-documenting REST APIs.

// https://blogs.oracle.com/theaquarium/hypermediahateoas-support-in-jax-rs-2java-ee-7


//The point of hypermedia controls is that they tell us what we can do next, 
//and the URI of the resource we need to manipulate to do it.

// HATEOAS bir RESTFul kisitlamasidir/constraint

//https://www.ibm.com/developerworks/library/x-atom10/index.html
//<?xml version="1.0" encoding="UTF-8"?>
//<feed xmlns="http://www.w3.org/2005/Atom" xml:base="http://www.example.org/">
//   <id>http://www.example.org/pictures</id>
//   <title>My Picture Gallery</title>
//   <updated>2005-07-15T12:00:00Z</updated>
//   <author>
//      <name>James M Snell</name>
//   </author>
//   <entry>
//      <id>http://www.example.org/entries/1</id>
//      <title>Trip to San Francisco</title>
//      <link href="/entries/1" />
//      <updated>2005-07-15T12:00:00Z</updated>
//      <summary>A picture of my hotel room in San Francisco</summary>
//      <content type="image/png" src="/mypng1.png" />
//   </entry>
//   <entry>
//      <id>http://www.example.org/entries/2</id>
//      <title>My new car</title>
//      <link href="/entries/2" />
//      <updated>2005-07-15T12:00:00Z</updated>
//      <summary>A picture of my new car</summary>
//      <content type="image/png" src="/mypng2.png" />
//   </entry>
//</feed>

// https://developer.paypal.com/docs/api/overview/#hateoas-links