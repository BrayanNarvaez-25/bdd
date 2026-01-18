import tkinter as tk
import fnIMC as fI

#*********FUNCIONES********

def btnCalcularIMC():
    limpiar()
    peso = float(txtPeso.get())
    okPeso = validarRangos(peso,lblErrorPeso,0,150)
    estatura = float(txtEstatura.get())
    okEstatura = validarRangos(estatura,lblErrorEstatura,30,230)
    if okPeso == True and okEstatura == True:
        imc = fI.calcularIMC(peso,estatura)
        lblIMC.config(text=f"Su IMC es: {imc}")
        resultado = fI.interpretarIMC(imc)
        lblInterpretacion.config(text=f"RESULTADO: {resultado}")

def validarRangos(valor,lblError,desde,hasta):
    ok = False
    if valor < desde or valor > hasta:
        lblError.config(text=f"Ingrese un valor entre {desde} y {hasta}")
        return ok
    else:
         ok = True
         return ok

def limpiar():
    lblErrorPeso.config(text="")
    lblErrorEstatura.config(text="")
    lblIMC.config(text="Su IMC es:")
    lblInterpretacion.config(text="")

        
#*********PARTE VISUAL*****
ventana=tk.Tk()
ventana.geometry("400x400")
ventana.title("INDICE DE MASA CORPORAL")
lblIngresePeso=tk.Label(text="Ingrese su peso en kilos")
lblIngresePeso.pack()
txtPeso=tk.Entry()
txtPeso.pack()
lblErrorPeso=tk.Label(text="",fg="red")
lblErrorPeso.pack()
lblIngreseEstatura=tk.Label(text="Ingrese su estatura en centimetros")
lblIngreseEstatura.pack()
txtEstatura=tk.Entry()
txtEstatura.pack()
lblErrorEstatura=tk.Label(text="",fg="red")
lblErrorEstatura.pack()
btnIMC=tk.Button(text="CALCULAR IMC", command=btnCalcularIMC)
btnIMC.pack()
lblIMC=tk.Label(text="Su IMC es:",fg="blue")
lblIMC.pack()
lblInterpretacion=tk.Label(text="",fg="blue")
lblInterpretacion.pack()
ventana.mainloop()
