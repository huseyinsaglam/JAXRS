package _01.Notes;

public class Notes {

}

//Negotiation -> uzlasma
//Content Negotiation -> Conneg

// web service hizmetini farkli farkli clientler kulllanabilir.
// bir musteri/client datayi XML olarak isteyebilir , digeri JSON , bir baskasi YAML formatinda datayi isteyebilir.
// bu durumda her bir response type icin dublicate code yazmak yerine bunu flexible/esnek sekilde cozumleyebiliriz.

// client/browser -> server ilet iletisimi HTTP ile saglamaktadir.
// client bir header ekler; Accept headeri
// client tercih ettigi header bilgisini Accept headeri ile server a gonderir.


//GET http://example.com/stuff
//Accept: application/xml, application/json

// bu durumda client serverdan data formati olarak/cevap response olarak XML ya da JSON beklemektedir.
//eger server bu formati desklemiyorsa bu durumda HTTP 406 Not Acceptable

// client'lar  Accept header bilgisini verererek tercih sirasini berlirleyebilir.
// ozellesmis olan oncelikli olacaktir.

// Clients set an Accept request header that is a comma-delimited list of preferred formats.
// The implicit rule is that more specific media types take precedence over less specific ones

// GET http://example.com/stuff
// Accept: text/*, text/html;level=1, */*, application/xml

//1)text/html;level=1
//2)application/xml
//3)text/*
//4)*/*


// GET http://example.com/stuff
// Accept: text/*;q=0.9, */*;q=0.1, audio/mpeg, application/xml;q=0.5

// q -> MIME type property
// 0.0 1.0 arasinda deger alir.
// eger tanimli degilse default deger 1.0 dir.

//1)audio/mpeg
//2)text/*;q=0.9 (q buyuk oldugu icin)
//3)application/xml;q=0.5
//4)*/*;q=0.1