package org.arpit.javapostsforlearning.webservice;

import javax.jws.WebService;
 
@WebService(endpointInterface="org.arpit.javapostsforlearning.webservice.WSOperaciones")
public class WSOperacionesImp implements WSOperaciones{
 
 public String wsoperaciones(String name) {
	 
	 if(name.toUpperCase().contains("HOLA"))
		 name=" "+name;
	 else
		 name=" no upper case"+name;
	 
	 System.out.println("LOG -"+new java.util.Date() + "-"+name);
	 
  return name;
 }

 public String login(String usuario, String clave){
	 String booleano = "false";
	 if ( usuario.equals("Hola") && clave.equals("123") ){
		 booleano = "true";
	 }
	 System.out.println("Funcion login: " + booleano);
	 return booleano;
 }

 public Integer procesarPago(int total, int pago){
	 Integer resultado = 0;
	 if ( pago >= total ){
		 resultado =  pago - total;
	 }
	 else{
		 resultado =  -1;
	 }
	 System.out.println("Funcion procesarPago: " + Integer.toString(resultado));
	 return resultado;

 }

 public String producto (String categoria, int precio){
	 String productoResultado;
	 if (categoria == null || categoria.length() == 0 || precio < 0)  {
		 return "Error";
	 }
	 else{
		productoResultado =  categoria + " | " + "Precio: " + Integer.toString( precio );
	 }
	 System.out.println("Funcion producto: "+ productoResultado);
	 return productoResultado;
 }
}