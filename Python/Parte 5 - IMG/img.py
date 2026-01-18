from tkinter import *
from utilitariosImagen import obtenerImagen

ventana = Tk()
ventana.geometry("500x500")
ventana.title("IMÁGENES")

img1 = obtenerImagen("emoji1.jpg")
lablimg1 =Label(image=img1)
lablimg1.pack()

ventana.mainloop()

