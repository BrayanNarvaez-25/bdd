from random import randint

def generarAleatorios():
    lista = []
    for num in range(5):
        lista.append(randint(10,20))
    return lista