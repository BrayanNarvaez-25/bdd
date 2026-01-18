def obtenerValorCarta(infoCarta):
    partes = infoCarta.split("-")
    return int(partes[-1])

def calcularProbabilidadGanar(listaCartas,cartaMenor,cartaMayor):
    cartasGanadoras = 0
    valorMin = obtenerValorCarta(cartaMenor)
    valorMax = obtenerValorCarta(cartaMayor)

    for carta in listaCartas:
        valorActual = obtenerValorCarta(carta)
        if valorMin < valorActual < valorMax:
            cartasGanadoras += 1
    
    totalCartas = len(listaCartas)
    
    if totalCartas == 0:
        return 0.0
    
    probabilidad = (cartasGanadoras / totalCartas) * 100
    return round(probabilidad,2)