import tkinter as tk 
import fnTemperatura as fT

#########funciones
def btnConvertirF():
    centigrados = float(txtCentigrados.get())
    farenheit = fT.convertirFarenheit(centigrados)
    lblResultado.config(text=f"Son {farenheit} grados farenheit")
#########parte visual
ventana=tk.Tk()
ventana.geometry("300x300")
ventana.title("CONVERTIDOR TEMPERATURA")

lblIngreseCentigrados=tk.Label(text="Ingrese la temperatura en Grados Centigrados")
lblIngreseCentigrados.pack()

txtCentigrados=tk.Entry()
txtCentigrados.pack()

btnConvertir=tk.Button(text="CONVERTIR A FARENHEIT", command=btnConvertirF)
btnConvertir.pack()

lblResultado=tk.Label(text="...")
lblResultado.pack()

ventana.mainloop()