import random

def saludar():
    numA = random.randint(1,3)
    if numA == 1:
        print("Dia soleado")
    elif numA == 2:
        print("Dia nublado")
    elif numA == 3:
        print("Mejor ni salgas")


def mostrarGanador(nombre):
    print(f"El ganador es: {nombre}")

def mostrarLanzamiento(nombre,dado1,dado2):
    total = dado1 + dado2
    print(f"{nombre}, obtuviste {dado1} y {dado2}, total: {total}")

def sumar(valor1,valor2):
    total = valor1 + valor2
    return total