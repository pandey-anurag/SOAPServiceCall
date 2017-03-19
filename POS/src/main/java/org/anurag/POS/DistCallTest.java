package org.anurag.POS;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class DistCallTest {
public InputStream sendJson() throws IOException {
	String address="Street+Number+160+Action+Area+I+Newtown+New+Town+West+Bengal+700156";//Street+Number+160+Action+Area+I+Newtown+New+Town+West+Bengal+700156
	URL url;
	HttpsURLConnection conn=null;
	try {
		url = new URL("https://maps.googleapis.com/maps/api/geocode/json?address="+address+"&key=AIzaSyAjkzhvWOZtuur2Z0lB6XACrQpZ58DHnq4");
		conn=(HttpsURLConnection)url.openConnection();
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn.getInputStream();				

}
}
