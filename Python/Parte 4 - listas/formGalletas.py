from tkinter import Tk,Entry,Label,Button
from galletas import generarFortuna

#FUNCIONES
def fnGenerar():
    mensaje = generarFortuna()
    lblMensaje.config(text=mensaje)

#GRÁFICA
ventana = Tk()
ventana.geometry("200x200")
ventana.title("Galletas fortuna")

lblFortuna = Label(text="Prueba tu fortuna")
lblFortuna.pack()

btnFortuna = Button(text="PRESIONAME",command=fnGenerar)
btnFortuna.pack()

lblMensaje = Label(text="",fg="red")
lblMensaje.pack()

ventana.mainloop()