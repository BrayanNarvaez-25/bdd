import tkinter as tk 
import fnEdad 

#########funciones
def btnCalcularEdad():
    anioN = int(txtAnio.get())
    edad = fnEdad.calcularEdad(anioN)
    lblResultado.config(text=f"Este año cumples {edad}")
#########parte visual
ventana=tk.Tk()
ventana.geometry("300x300")
ventana.title("DESCUENTOS")

lblAnio=tk.Label(text="Ingrese su año de nacimiento (1000-2024)")
lblAnio.pack()

txtAnio=tk.Entry()
txtAnio.pack()

btnEdad=tk.Button(text="CALCULAR EDAD",command=btnCalcularEdad)
btnEdad.pack()

lblResultado=tk.Label(text="Este año cumple....")
lblResultado.pack()

ventana.mainloop()