from tkinter import *
from utilitariosImagen import obtenerImagen
from random import randint


ventana=Tk()
ventana.geometry("500x400")
ventana.title("JUEGO DADOS")

#FUNCIONES
imagenes = [
    obtenerImagen("dadoIncognita.png",100),
    obtenerImagen("dados1.png",100),
    obtenerImagen("dados2.png",100),
    obtenerImagen("dados3.png",100),
    obtenerImagen("dados4.png",100),
    obtenerImagen("dados5.png",100),
    obtenerImagen("dados6.png",100)
]

valorJugador1 = 0
valorJugador2 = 0

def fnNuevaPartida():
    lblDadoJugador1.config(image=imagenes[0])
    lblDadoJugador2.config(image=imagenes[0])
    lblResultado.config(text="Resultado")
    global valorJugador1
    valorJugador1 = 0
    global valorJugador2
    valorJugador2 = 0
    btnLanzar1.config(state="normal")
    btnLanzar2.config(state="normal")

def fnLanzarDadoJugador1():
    global valorJugador1
    valorJugador1 = randint(1,6)
    lblDadoJugador1.config(image=imagenes[valorJugador1])
    if valorJugador2 != 0:
        fnDeterminarGanador()
    btnLanzar1.config(state="disabled")

def fnLanzarDadoJugador2():
    global valorJugador2
    valorJugador2 = randint(1,6)
    lblDadoJugador2.config(image=imagenes[valorJugador2])
    if valorJugador1 != 0:
        fnDeterminarGanador()
    btnLanzar2.config(state="disabled")

def fnDeterminarGanador():
    if valorJugador1 > valorJugador2:
        lblResultado.config(text="Gana el jugador 1")
    elif valorJugador2 > valorJugador1:
        lblResultado.config(text="Gana el jugador 2")
    else:
        lblResultado.config(text="EMPATE")

#FIN DE FUNCIONES
framePrincipal = Frame(ventana,)
framePrincipal.place(x=100,y=100)

lblTitulo=Label(framePrincipal,text="VEAMOS QUIEN ES EL MEJOR")
lblDadoJugador1=Label(framePrincipal,image=imagenes[0])
btnLanzar1=Button(framePrincipal,text="LANZAR",command=fnLanzarDadoJugador1)
lblDadoJugador2=Label(framePrincipal,image=imagenes[0])
btnLanzar2=Button(framePrincipal,text="LANZAR",command=fnLanzarDadoJugador2)
lblResultado=Label(framePrincipal,text="Resultado")
btnNuevaPartida = Button(framePrincipal,text="NUEVA PARTIDA",command=fnNuevaPartida)

lblTitulo.grid(row=0,column=0,columnspan=3,padx=50)
lblResultado.grid(row=3,column=0,columnspan=3)
lblDadoJugador1.grid(row=1,column=0)
lblDadoJugador2.grid(row=1,column=2)
btnLanzar1.grid(row=2,column=0)
btnLanzar2.grid(row=2,column=2)
btnNuevaPartida.grid(row=4,column=1)

ventana.mainloop()