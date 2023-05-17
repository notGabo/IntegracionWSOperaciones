# Servidor y cliente para prueba 2 integracion de plataformas

## 0. ANTES DE COMENZAR
Este proyecto ha sido escrito en java con el jdk 1.8 (java-1.8.0-openjdk-1.8.0) usando el ide de Jetbrains IntelliJ idea, el cual puede ser descargado [en este enlace](https://www.jetbrains.com/idea/download/). Tambien se probo el proyecto con estas configuraciones en linux y windows en 2 equipos distintos, por lo que no deberia haber dramas para la ejecucion del proyecto. Sin embargo, esto no sucedia en netbeans, daba muchos problemas y obligaba a tener un tipo de servidor instalado. De todas maneras, deje el proyecto buildeado en un .jar en la ruta ```./IntegracionWSOperaciones/classes/artifacts/WSOperaciones_jar/```

## 1. Ejecucion de los ambientes (servidor y cliente)

En caso de que no haya podido ejecutar el codigo con el ide, mencione anteriormente que deje el archivo buildeado, pero viene con el puerto hardcodeado en 8080, asi que es probable de que de un error si el puerto esta siendo utilizado por algun otro programa. De todas maneras aqui la forma de ejecutarlo:
Servidor:
```
{ruta de jdk-1.8}/jre/bin/java -jar {ruta del proyecto}/IntegracionWSOperaciones/classes/artifacts/WSOperaciones_jar/WSOperaciones.jar
```
Por otro lado, nuestro cliente no necesita un puerto, solamente necesita python y el modulo preinstalado de Tk que normalmente viene integrado en python windows. En caso de que no este instalado puede ejecutareste comando:
```
pip install tk
```
Cliente python: 
```
python {ruta del proyecto}/IntegracionWSOperaciones/classes/artifacts/WSOperaciones_jar/clientTk.py
```
## 2. Acceso a WSDL
Por defecto, nuestro jar no proporciona un html de index, por lo que al momento de ingresar al link [http://localhost:8080/WS/WSOperaciones](http://localhost:8080/WS/WSOperaciones) que dejamos como endpoint para el proyecto dara un error, ya que no existe el html que debe renderizar. Por lo que nosotros en el navegador, deberemos cambiar el enlace manualmente para acceder al archivo WSDL de la siguiente manera [http://localhost:8080/WS/WSOperaciones?wsdl](http://localhost:8080/WS/WSOperaciones?wsdl)
## 3. Screenshots 
![image](https://github.com/notGabo/IntegracionWSOperaciones/assets/101845172/ae836b20-a13e-430c-b7d5-eae641bf9b06)
Aqui ejecuto el web service con el script "runserver", notese que le digo la ruta de donde esta el jdk que quiero utilizar, seguido de el parametro **-jar** y el archivo a ejecutar 
##
![image](https://github.com/notGabo/IntegracionWSOperaciones/assets/101845172/1ac83c25-e065-4fff-8277-fd8ad5fea5a3)
Acceso a xml wsdl usando el ejecutable.
##
![image](https://github.com/notGabo/IntegracionWSOperaciones/assets/101845172/717004bc-e536-4d2b-a44c-7ac645191d6e)
Aqui ejecuto el mismo programa pero desde su codigo de fuente, haciendo uso del ide de IntelliJ Idea.
##
![image](https://github.com/notGabo/IntegracionWSOperaciones/assets/101845172/5afeffa4-2f96-4d11-ac0e-7acda6063e80)
Mismo resultado al acceder al archivo wsdl, pero usando el ide.
##
![image](https://github.com/notGabo/IntegracionWSOperaciones/assets/101845172/a7a68d2d-d0f8-4291-bd96-502a32f1d224)\
Fragmento del codigo del cliente, mostrando la conexion y como interactua con el metodo de login segun la respuesta que reciba.
##
![image](https://github.com/notGabo/IntegracionWSOperaciones/assets/101845172/2b33b29c-fd9b-4b28-99d6-542ab200b5b8)
Aqui muestro como interactua el cliente escrito en python con el servidor escrito en java, mostrando las respuestas que tiene que enviar en la consola del servidor y lo que interpreta el cliente mostrandolo en una interfaz basica.

## 4. Integrantes
- Alfredo Galdames
- Fabian Muñoz
- Fernando Muñoz
- Gabriel Soto


