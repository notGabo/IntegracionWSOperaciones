import zeep
import tkinter as tk

try:
    Client = zeep.Client('http://localhost:8080/WS/WSOperaciones?wsdl')
except:
    print("No se pudo conectar al servidor")
    exit()

app = tk.Tk()

app.title("Cliente SOAP Prueba 2")
app.geometry('240x540')

### Login
# Title Login
lblTituloLogin = tk.Label(app, width=35,font='bold' ,text="Login")
lblTituloLogin.pack()

def loginSoapClient():
    try:
        result = Client.service.login(txtUser.get(), txtPass.get())
        if result == "true":
            lblRespuetaLogin.config(text="Login exitoso")
        else:
            lblRespuetaLogin.config(text="Login fallido")
    except:
        lblRespuetaLogin.config(text="Error al conectar con el servidor")

# Usuario
lblUser = tk.Label(app, text="Usuario")
lblUser.pack()

txtUser = tk.Entry(app,width=10)
txtUser.pack()

# Contraseña
lblPass = tk.Label(app, text="Contraseña")
lblPass.pack()

txtPass = tk.Entry(app,show='*',width=10)
txtPass.pack()

# Boton
btnLogin = tk.Button(app, text="Login", command=lambda: loginSoapClient())
btnLogin.pack()

lblRespuetaLogin = tk.Label(app, text="")
lblRespuetaLogin.pack()


### procesarPago
# Title Procesar pago
lblTituloProcesarPago = tk.Label(app, width=35,font='bold' ,text="Procesar pago")
lblTituloProcesarPago.pack()

def procesarPagoSoapClient():
    if not txtPago.get().isdigit() or not txtTotal.get().isdigit():
        lblRespuetaProcesarPago.config(text="Pago y Total deben ser numeros")
        return
    pagoToInt = int(txtPago.get())
    totalToInt = int(txtTotal.get())
    try:
        result = Client.service.procesarPago(totalToInt, pagoToInt)
        lblRespuetaProcesarPago.config(text=result)
    except:
        lblRespuetaProcesarPago.config(text="Error al conectar con el servidor")

# Pago
lblPago = tk.Label(app, text="Pago")
lblPago.pack()

txtPago = tk.Entry(app,width=10)
txtPago.pack()

# Total
lblTotal = tk.Label(app, text="Total")
lblTotal.pack()

txtTotal = tk.Entry(app,width=10)
txtTotal.pack()

# Boton
btnProcesarPago = tk.Button(app, text="Procesar pago", command=lambda: procesarPagoSoapClient())
btnProcesarPago.pack()

lblRespuetaProcesarPago = tk.Label(app, text="")
lblRespuetaProcesarPago.pack()

###Producto
# Title Producto
lblTituloProducto = tk.Label(app, width=35,font='bold' ,text="Producto")
lblTituloProducto.pack()

def productoSoapClient():
    if not txtPrecio.get().isdigit():
        lblRespuetaProducto.config(text="Precio debe ser numerico")
        return
    precioToInt = int(txtPrecio.get())
    try:
        result = Client.service.producto(txtCategoria.get(), precioToInt)
        lblRespuetaProducto.config(text=result)
    except:
        lblRespuetaProducto.config(text="Error al conectar con el servidor")
    
# Categoria
lblCategoria = tk.Label(app, text="Categoria")
lblCategoria.pack()

txtCategoria = tk.Entry(app,width=10)
txtCategoria.pack()

# Precio
lblPrecio = tk.Label(app, text="Precio")
lblPrecio.pack()

txtPrecio = tk.Entry(app,width=10)
txtPrecio.pack()

# Boton
btnProducto = tk.Button(app, text="Producto",command=lambda: productoSoapClient())
btnProducto.pack()

lblRespuetaProducto = tk.Label(app, text="")
lblRespuetaProducto.pack()

background_image=tk.PhotoImage(file="background.ppm")
limg = tk.Label(app, i=background_image)
limg.pack()

app.mainloop()