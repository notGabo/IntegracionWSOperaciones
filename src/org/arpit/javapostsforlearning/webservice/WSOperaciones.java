package org.arpit.javapostsforlearning.webservice;
import javax.jws.WebMethod;
import javax.jws.WebService;
 

@WebService
public interface WSOperaciones {
 
 @WebMethod public String wsoperaciones(String name);
 @WebMethod public String login (String usuario, String clave);
 @WebMethod public Integer procesarPago (int total, int pago);
 @WebMethod public String producto (String categoria, int precio);
}