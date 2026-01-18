from tkinter import *
from utilitariosImagen import obtenerImagen

#FUNCIONES
def fnApagar():
    compuA = obtenerImagen("compuApagada.PNG")
    global lblCompu
    lblCompu.config(image=compuA)
    lblCompu.image = compuA
    btnApagar.config(state="disabled")
    btnEncender.config(state="normal")

def fnEncender():
    compuE = obtenerImagen("compuPrendida.PNG")
    global lblCompu
    lblCompu.config(image=compuE)
    lblCompu.image = compuE
    btnApagar.config(state="normal")
    btnEncender.config(state="disabled")

#GRÁFICA
ventana = Tk()
ventana.geometry("500x500")
ventana.title("COMPU")

compuA = obtenerImagen("compuApagada.PNG")

lblCompu = Label(image=compuA)
lblCompu.pack()

btnApagar = Button(text="APAGAR",command=fnApagar,state="disabled")
btnApagar.pack()
btnEncender = Button(text="ENCENDER",command=fnEncender)
btnEncender.pack()


ventana.mainloop()