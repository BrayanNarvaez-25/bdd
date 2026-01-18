from tkinter import Tk,Entry,Label,Button

notas=[]
#FUNCIONES
#def fnAgregarNota():
    #
#def fnCalcularPromedio():
    #

#PARTE GRAFICA
ventana=Tk()
ventana.geometry("300x300")
ventana.title("PROMEDIO DE NOTAS")

lblNota=Label(text="Ingrese una nota")
lblNota.pack()

txtNota=Entry()
txtNota.pack()

btnAgregarNota=Button(text="AGREGAR NOTA")
btnAgregarNota.pack()

btnCalcularPromedio=Button(text="CALCULAR PROMEDIO")
btnCalcularPromedio.pack()


lblPromedio=Label(text="",fg="red")
lblPromedio.pack()
ventana.mainloop()