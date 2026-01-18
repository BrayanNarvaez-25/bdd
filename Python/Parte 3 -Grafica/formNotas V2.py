import tkinter as tk
import fnNotas

existeErrores = False


#********FUNCIONES*******
def obtenerFloat(cajaTexto,lblError):
    try:
        valorNota=float(cajaTexto.get())
        validarNota(valorNota,lblError)
    except:
        lblError.config(text="Debe ingresar un número")
        global existeErrores
        existeErrores = True
        valorNota = None
    return valorNota

def validarNota(nota,lblError):
    if (nota < 0 or nota > 10):
        lblError.config(text="La nota debe ser un valor entre 0 y 10")
        global existeErrores
        existeErrores = True

def limpiar():
    global existeErrores
    existeErrores = False
    lblError1.config(text="")
    lblError2.config(text="")
    lblError3.config(text="")
    lblPromedio.config(text="Promedio: 0")

def btnCalcularPromedio():
    limpiar()
   
    valorNota1 = obtenerFloat(txtNota1,lblError1)
    valorNota2 = obtenerFloat(txtNota2,lblError2)
    valorNota3 = obtenerFloat(txtNota3,lblError3)

    if existeErrores == False:
        promedio=fnNotas.calcularPromedio(valorNota1,valorNota2,valorNota3)
        lblPromedio.config(text=f"Promedio: {promedio}")


#********GRAFICA*********
ventana=tk.Tk()
ventana.title("PROMEDIO")
ventana.geometry("400x400")
lblNota1=tk.Label(text="Nota 1")
lblNota1.pack()
txtNota1=tk.Entry()
txtNota1.pack()
lblError1 = tk.Label(text="",fg="red")
lblError1.pack()
lblNota2=tk.Label(text="Nota2")
lblNota2.pack()
txtNota2=tk.Entry()
txtNota2.pack()
lblError2 = tk.Label(text="",fg="red")
lblError2.pack()
lblNota3=tk.Label(text="Nota3")
lblNota3.pack()
txtNota3=tk.Entry()
txtNota3.pack()
lblError3 = tk.Label(text="",fg="red")
lblError3.pack()
btnPromedio=tk.Button(text="PROMEDIO",command=btnCalcularPromedio)
btnPromedio.pack()
lblPromedio=tk.Label(text="Promedio: 0")
lblPromedio.pack()
ventana.mainloop()