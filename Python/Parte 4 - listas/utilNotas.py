def buscarEstudiante(cedula,listaEstudiantes):
    for est in listaEstudiantes:
        partesEstudiante = est.split("#")
        if partesEstudiante[0] == cedula:
            return est
    return None

def calcularTotal(n1,n2,n3,faltas):
    n4 = 0 
    if faltas == 0:
        n4 = 10
        promedio = (n1 + n2 + n3 + n4)/4
        return round(promedio,2)
    elif faltas >=1 and faltas < 4:
        n4 = 9
        promedio = (n1 + n2 + n3 + n4)/4
        return round(promedio,2)
    elif faltas >= 4 and faltas < 5:
        n4 = 8
        promedio = (n1 + n2 + n3 + n4)/4
        return round(promedio,2)
    elif faltas >= 5:
        n4 = 7
        promedio = (n1 + n2 + n3 + n4)/4
        return round(promedio,2)
    
def calcularPromedioCurso(listaEstudiantes):
    totalSuma = 0
    for est in listaEstudiantes:
        cadena = est.split("#")
        nota = float(cadena[7])
        totalSuma += nota
    estudiantes = len(listaEstudiantes)
    promedioCurso = totalSuma / estudiantes
    return round(promedioCurso,4)
        