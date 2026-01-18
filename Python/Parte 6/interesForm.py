from tkinter import *
from tkinter import messagebox
from tkinter import ttk
from credito import calcularInteresCompuesto,calcularInteresSimple

existeError = False

#FUNCIONES

def fnObtenerEntero(txtInfo,lblError,desde,hasta = None):
    global existeError
    valorEntenero =None
    try:
        valorEntenero =int(txtInfo.get())
        if hasta is not None:
            if valorEntenero >=desde and valorEntenero <=hasta:
                existeError = False
                lblError.config(text="")
                return valorEntenero 
            else:
                existeError = True
                lblError.config(text=f"Debe ingresar un valor entre {desde} y {hasta}")
        else:
            if valorEntenero >=desde:
                existeError = False
                lblError.config(text="")
                return valorEntenero 
            else:
                existeError = True
                lblError.config(text=f"Debe ingresar un valor mayor o igual a {desde}")
    except:
        existeError = True
        lblError.config(text="Debe ingresar un número")
    return valorEntenero 

def btnCalcularSimple():
    monto = fnObtenerEntero(txtMonto,lblErrorMonto,1000,50000)
    plazo = fnObtenerEntero(txtPlazo,lblErrorPlazo,1,15)
    tasa = fnObtenerEntero(txtTasa,lblErrorTasa,3,20)
    if monto != None and plazo != None and tasa != None and existeError == False:
        interesSimple = calcularInteresSimple(monto,plazo,tasa)
        lblTotal.config(text=interesSimple)
    
def btnCalcularCompuesto():
    monto = fnObtenerEntero(txtMonto,lblErrorMonto,1000,50000)
    plazo = fnObtenerEntero(txtPlazo,lblErrorPlazo,1,15)
    tasa = fnObtenerEntero(txtTasa,lblErrorTasa,3,20)
    if monto != None and plazo != None and tasa != None and existeError == False:
        interesCompuesto = calcularInteresCompuesto(monto,plazo,tasa)
        lblTotal.config(text=interesCompuesto)

def limpiar():
    txtMonto.delete(0,END)
    txtPlazo.delete(0,END)
    txtTasa.delete(0,END)
    lblTotal.config(text="0.00")

#GRÁFICA

ventana = Tk()
ventana.title("INTERÉS")
ventana.geometry("600x400")
tabControl=ttk.Notebook(ventana)
tab1=ttk.Frame(tabControl)
tabControl.add(tab1,text="REGISTRO")
tabControl.pack(expand = 1, fill ="both") 
fnInteres= Frame(tab1)
fnInteres.place(x=100,y=100)
lblMonto=ttk.Label(fnInteres,text="MONTO:")
lblPlazo=ttk.Label(fnInteres,text="PLAZO:")
lblTasa=ttk.Label(fnInteres,text="TASA:")

lblResultado=ttk.Label(fnInteres,text="RESULTADO:")
lblTotal=ttk.Label(fnInteres,text="0.00",foreground="green")

txtMonto=ttk.Entry(fnInteres)
txtPlazo=ttk.Entry(fnInteres)
txtTasa=ttk.Entry(fnInteres)

lblErrorMonto=ttk.Label(fnInteres,text="",foreground="red")
lblErrorPlazo=ttk.Label(fnInteres,text="",foreground="red")
lblErrorTasa=ttk.Label(fnInteres,text="",foreground="red")


frBotones=Frame(fnInteres)
btnSimple=ttk.Button(frBotones,text="CALCULAR SIMPLE",width=20,command=btnCalcularSimple)
btnCompuesto=ttk.Button(frBotones,text="CALCULAR COMPUESTO",width=20,command=btnCalcularCompuesto)
btnLimpiar=ttk.Button(frBotones,text="LIMPIAR",width=20,command=limpiar)
btnSimple.grid(row=0,column=0,padx=10)
btnCompuesto.grid(row=0,column=1,padx=10)
btnLimpiar.grid(row=0,column=2,padx=10)

lblMonto.grid(row=2,column=1,padx=30)
txtMonto.grid(row=2,column=2,pady=2)
lblErrorMonto.grid(row=2,column=3)
lblPlazo.grid(row=3,column=1,pady=2)
txtPlazo.grid(row=3,column=2)
lblErrorPlazo.grid(row=3,column=3)
lblTasa.grid(row=4,column=1,pady=2)
txtTasa.grid(row=4,column=2)
lblErrorTasa.grid(row=4,column=3)
lblResultado.grid(row=9,column=1)
lblTotal.grid(row=9,column=2)
frBotones.grid(row=10,column=0,columnspan=4,pady=10)


ventana.mainloop()