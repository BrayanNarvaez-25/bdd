import tkinter as tk

#############Funciones
def saludar():
    #get devuelve lo que ingresó el usuario como string
    nombre = txtNombre.get()
    #Modifique el texto del lblMensaje
    #config modifica las propiedades que recibe como parametros
    lblMensaje.config(text=f"Hola mijin {nombre}")


#############Gráfica
#Crear ventana
ventana = tk.Tk()

#Cambiar titulo (ventana)
ventana.title("BIENVENIDA")
#Cambiar tamaño (ancho*alto)
ventana.geometry("800x300")
#Crear y mostrar una etiqueta
lblNombre = tk.Label(text="Ingrese su nombre")
lblNombre.pack()
#Crear y mostrar caja de texto
txtNombre = tk.Entry()
txtNombre.pack()
#Agregar y mostrar boton 
btnOK = tk.Button(text="OK",command=saludar)
btnOK.pack()
#Crear y mostrar una etiqueta
lblMensaje = tk.Label(text="")
lblMensaje.pack()

#Mostrar ventana
ventana.mainloop()