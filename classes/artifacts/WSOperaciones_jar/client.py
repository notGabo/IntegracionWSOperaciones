from zeep import client



from zeep import Client

client = Client('http://localhost:8080/WS/WSOperaciones?wsdl')

loginTrue = client.service.login("Hola","123")
print(f"Funcion loginTrue: {loginTrue}")

loginFalse = client.service.login("Hola","1234")
print(f"Funcion loginFalse: {loginFalse}")

procesarPago = client.service.procesarPago(2000, 200)
print(f"Funcion procesarPago: {procesarPago}")

producto = client.service.producto("Categoria",400)
print(f"Funcion producto {producto}")
