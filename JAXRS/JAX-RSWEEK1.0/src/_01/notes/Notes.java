package _01.notes;

public class Notes {

}

//web serviceler farkli uygulamalarin birlikte calismasina olana saglar.
// anahtar keliemiz -> interoperating kavrami (birlikte calisma)

// farkli programlama dilide olsa ya da frrkli frameworkler de olsa fark etmez.
// 2 tane uygulama birbiri ile veri degisimi (data exchange) saglamak amacimiz.

// ya da disariya public bir hizmet acilabilir.
// hava durumu , currency , ip location web service ,
// twitter , amazon vs

// musteriye saglanan web hizmetleri ;

// web service yardimiyla kendi bilgilerini parametre olarak vererek ,
// transaction , order vs bilgilerini gorebilir...


// Java da 2 tip web service vardir;
// 1- JAX-RS
// 2- JAX-WS
// JAX-RS ve JAX-WS , JAVA EE 'in bir parcasidir/bolumudur.

//####
// JAX-RS
// Java API for RESTful web services

// lin uzerinden Spect'e erisim saglanabilir.
//https://jcp.org/en/jsr/detail?id=339

// JAX-RS 2.0, JSR-339, is a new JCP specification that provides a Java API for RESTful Web Services over the HTTP protocol.

// JAX-RS implementations ;
// 1 - Jersey
// 2 - RESTEasy
// 3 - Restlet
// 4 - Apache CXF

// REST

// 2000 yili , Roy Fielding , doktora tezinden ortaya cikmistir.
//http://www.ics.uci.edu/~fielding/pubs/dissertation/top.htm

// Representation State Transfer anlamina gelmektedir.

// RESTFul Architectural principles

// ## Addressability/Addressable resources

// kaynaklara (resource) erisim unique/tekil bir identier ile ulasilabilir olmalidir.
//her kaynak , URI(uniform resource identifier) ile adreslenebilir olmalidir.

// scheme://host:port/path?queryString#fragment
// scheme -> kullanilan protocol , http , https , ftp
// host -> dns adi ya ip adresi olabilir
// port -> optional
// path ve queryString

// http://example.com/customers?lastName=Erguder&zipcode=34000

// Addressability is the idea that every object and resource in your system 
// is reachable through a unique identifier. 
// each resource must be addressable via a URI (Uniform Resource Identifier).

// ### Representation Oriented
// representation -> XML , JSON gibi formatlar araciligiyla exchange ediyoruz.
// HTTP GET istediginde bulunduguumuzda , ilgili kaynagin mevcut durumunu/ representation íni aliriz.


// ### The Uniform , Constrained Interface

// This means that you don’t have an “action” parameter in your URI and use only 
// the methods of HTTP for your web services. 

// uri bilgiinsde bir actrion paremetresi gonderip , bu parametreye gore akis kontrolu YAPMA!


// GET
// serverdan bir kaynak/resource isteginde bulundugumuzda GET i kullaniriz.

// idempotent ->
// bir islem/istek/operation yaptigimizda , bunu kacdefa yaptigimizn bir onermi yoktur.
// sonuc her zaman aynidir.
// GET dogasi geregi idempotent ozellik gosterir;

//public int getNumber() {
//	return 100;
//}

//Idempotent means that no matter how many times you apply the operation, 
//the result is always the same.

// POST
// non-idempotent ozellige sahiptir.
// islemi kac defa uyguladigimiz onemlidir, her defasinda sonuc degisecektir.

// private int number =10;
//public int getNumber() {
//	return ++number;
//}

// create resource , post icin uygun olacaktir.

// PUT
// put update/guncelleme amaciyla tercih edilir.
// put da , get gibi idempotent ozellige sahiptir!    
// bir dosyayi kaydetmeyi dusunelim ;
// 1 kez kaydettigimizde (update) olur. sonrasindaki kaydetme islemleri(degisiklik yapmadan) bir sey ifade etmez.
// put un mantigida bu sekilde calismalidir. bu nedenle idempotent ozellik gosterir.

//POST means “create new” as in “Here is the input for creating a user, create it for me”.
//PUT means “insert, replace if already exists” as in “Here is the data for user 5”.


// DELETE
// remove/delete resource
// idempotent ozellik gosterir.


//
