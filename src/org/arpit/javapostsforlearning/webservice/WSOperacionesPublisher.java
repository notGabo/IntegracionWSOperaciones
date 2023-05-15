package org.arpit.javapostsforlearning.webservice;
import javax.xml.ws.Endpoint;
//import javax.xml.ws.spi.http.HttpContext;

//import java.io.FileInputStream;
//import java.net.InetSocketAddress;
//import java.security.KeyStore;
//import java.security.SecureRandom;
//
//import javax.jws.soap.SOAPBinding;
//import javax.net.ssl.KeyManagerFactory;
//import javax.net.ssl.SSLContext;
//import javax.net.ssl.TrustManagerFactory;

public class WSOperacionesPublisher {
 public static void main(String[] args) {
	 
	 System.out.println("Iniciando WS.");
  
	 Endpoint.publish("http://localhost:8080/WS/WSOperaciones",new WSOperacionesImp());
	 System.out.println("WS corriendo.");
	 
  /*
  String keystoreFile="ssl-server.jks";
  String keyPass="changeit";
  
  SSLContext ssl = SSLContext.getInstance("TLS");

  KeyManagerFactory keyFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
  KeyStore store = KeyStore.getInstance("JKS");

  store.load(new FileInputStream(keystoreFile),keyPass.toCharArray());

  keyFactory.init(store, keyPass.toCharArray());


  TrustManagerFactory trustFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());

  trustFactory.init(store);

  ssl.init(keyFactory.getKeyManagers(),
  trustFactory.getTrustManagers(), new SecureRandom());

  HttpsConfigurator configurator = new HttpsConfigurator(ssl);

  HttpsServer httpsServer = HttpsServer.create(new InetSocketAddress(hostname, port), port);

  httpsServer.setHttpsConfigurator(configurator);

  HttpContext httpContext = httpsServer.createContext(uri);

  httpsServer.start();

  Endpoint.publish(httpContext,new HelloWorldImpl());
  */
  
 }
}