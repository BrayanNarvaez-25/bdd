#import tkinter as tk  #módulo completo
from tkinter import   Tk,Label,Entry,Button

contactos = [] #lista sin elementos

#FUNCIONES
def fnGuardar():
    nombre = txtNombre.get()
    contactos.append(nombre)
    print(contactos)

#GRÁFICA
ventana = Tk()
ventana.geometry("300x300")
ventana.title("CONTACTOS")

lblNombre = Label(text="Ingrese su nombre: ")
lblNombre.pack()

txtNombre = Entry()
txtNombre.pack()

btnGuardar = Button(text="GUARDAR",command=fnGuardar)
btnGuardar.pack()

ventana.mainloop()