from tkinter import *
from tkinter import messagebox
from tkinter import ttk
from utilNotas import buscarEstudiante

#VARIABLES GLOBALES
estudiantes=["1727392035-Brayan-Narváez-10-10-10",
             "1749499293-Diego-Menedoza-10-10-10",
             "1783859393-Pepe-Díaz-10-10-10"]

#messagebox.showinfo(title="", message="")
#FUNCIONES

def fnGuardar():
    cedula = txtCedula.get()
    nombre = txtNombre.get()
    apellido = txtApellido.get()
    nota1 = txtNota1.get()
    nota2 = txtNota1.get()
    nota3 = txtNota1.get()
    estEncontrado = buscarEstudiante(cedula,estudiantes)
    if estEncontrado == None:
        estudiantes.append(f"{cedula}-{nombre}-{apellido}-{nota1}-{nota2}-{nota3}")
        messagebox.showinfo(title="IMPORTANTE", message="Estudiante Guardado")
    else:
        messagebox.showwarning(title="IMPORTANTE", message=f"Estudiante existente con cédula: {cedula}")

def limpiar():
    txtCedula.delete(0,END)
    txtNombre.delete(0,END)
    txtApellido.delete(0,END)
    txtNota1.delete(0,END)
    txtNota2.delete(0,END)
    txtNota3.delete(0,END)
def fnNuevo():
    limpiar()

def fnBuscar():
    estudianteEncontrado = buscarEstudiante(txtCedula.get(),estudiantes)
    if estudianteEncontrado == None:
        messagebox.showwarning(title="IMPORTANTE", message="No existe el estudiante")
    else:
        partesEstudiante = estudianteEncontrado.split("-")
        limpiar()
        txtCedula.insert(0,partesEstudiante[0])
        txtNombre.insert(1,partesEstudiante[1])
        txtApellido.insert(2, partesEstudiante[2])
        txtNota1.insert(3, partesEstudiante[3])
        txtNota2.insert(4, partesEstudiante[4])
        txtNota3.insert(5, partesEstudiante[5])

#GRAFICA
ventana=Tk()
ventana.title("NOTAS")
ventana.geometry("600x400")
tabControl=ttk.Notebook(ventana)
tab1=ttk.Frame(tabControl)
tab2=ttk.Frame(tabControl)
tab3=ttk.Frame(tabControl)
tabControl.add(tab1,text="REGISTRO")
tabControl.add(tab2,text="LISTA")
tabControl.add(tab3,text="BUSQUEDA")
tabControl.pack(expand = 1, fill ="both") 
#TAB REGISTRO
frRegistro= Frame(tab1)
frRegistro.place(x=100,y=100)
lblCedula=ttk.Label(frRegistro,text="CEDULA:")
lblNombre=ttk.Label(frRegistro,text="NOMBRE:")
lblApellido=ttk.Label(frRegistro,text="APELLIDO:")
lblNota1=ttk.Label(frRegistro,text="NOTA 1:")
lblNota2=ttk.Label(frRegistro,text="NOTA 2:")
lblNota3=ttk.Label(frRegistro,text="NOTA 3:")
txtCedula=ttk.Entry(frRegistro,state="normal")
txtNombre=ttk.Entry(frRegistro)
txtApellido=ttk.Entry(frRegistro)
txtNota1=ttk.Entry(frRegistro)
txtNota2=ttk.Entry(frRegistro)
txtNota3=ttk.Entry(frRegistro)
frBotones=Frame(frRegistro)
btnGuardar=ttk.Button(frBotones,text="GUARDAR",width=20,command=fnGuardar)
btnNuevo=ttk.Button(frBotones,text="NUEVO",width=20,command=fnNuevo)
btnBuscar=ttk.Button(frBotones,text="Buscar",width=20,command=fnBuscar)
btnGuardar.grid(row=0,column=0,padx=10)
btnNuevo.grid(row=0,column=1,padx=10)
btnBuscar.grid(row=0,column=2,padx=10)
lblCedula.grid(row=2,column=1,padx=30)
txtCedula.grid(row=2,column=2,pady=2)
lblNombre.grid(row=3,column=1,pady=2)
txtNombre.grid(row=3,column=2)
lblApellido.grid(row=4,column=1,pady=2)
txtApellido.grid(row=4,column=2)
lblNota1.grid(row=5,column=1,pady=2)
txtNota1.grid(row=5,column=2)
lblNota2.grid(row=6,column=1,pady=2)
txtNota2.grid(row=6,column=2)
lblNota3.grid(row=7,column=1,pady=2)
txtNota3.grid(row=7,column=2)
frBotones.grid(row=8,column=0,columnspan=4,pady=10)
ventana.mainloop()


