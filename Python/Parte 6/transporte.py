def calcularTotal(listaNum):
    total = 0

    for num in listaNum:
        total += num
    return total

def validarListas(listaO,listaD):
    pOrigen = calcularTotal(listaO)
    pDestino = calcularTotal(listaD)
    if pOrigen == pDestino:
        return True
    else:
        return False


    
def resolverProblema(listaO, listaD):
    movimientos = []

    for indice1 in range(len(listaD)):
        for indice2 in range(len(listaO)):
            if listaD[indice1] == 0:
                break

            valorDestino = listaD[indice1]
            valorOrigen = listaO[indice2]

            if valorOrigen == 0:
                continue

            cantidadMovimiento = min(valorOrigen,valorDestino)
            
            if cantidadMovimiento > 0:
                registro = f"{indice2} - {indice1} - {cantidadMovimiento}"
                movimientos.append(registro)

                listaO[indice2] -= cantidadMovimiento
                listaD[indice1] -= cantidadMovimiento
    return movimientos
            

def recuperarCurso(infoEstudiante):
    listaEstudiante = infoEstudiante.split("-")
    curso = int(listaEstudiante[0])
    return curso

def recuperarNombreCompleto(infoEstudiante):
    listaEstudiante = infoEstudiante.split("-")
    nombre = listaEstudiante[1]
    apellido = listaEstudiante[2]
    return f"{nombre} {apellido}"

def recuperarNota(infoEstudiante):
    listaEstudiante = infoEstudiante.split("-")
    nota = int(listaEstudiante[3])
    return nota

def buscarEstudiante(listaEstudiantes,numCurso,nota):
    for est in listaEstudiantes:
        cursoActual = recuperarCurso(est)
        notaActual = recuperarNota(est)

        if cursoActual == numCurso and notaActual == nota:
            return recuperarNombreCompleto(est)
        
    return "Estudiante no encontrado"