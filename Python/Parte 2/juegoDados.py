import random
import funciones

jugador1 = input("Ingrese el nombre del jugador 1")
jugador2 = input("Ingrese el nombre del jugador 2")

print("\nPara lanzar los dados, presione ENTER")
input(f"\nLanza {jugador1}")

dado1Jugador1 = random.randint(1,6)
dado2Jugador1 = random.randint(1,6)
total1 = dado1Jugador1 + dado2Jugador1
funciones.mostrarLanzamiento(jugador1,dado1Jugador1,dado2Jugador1)


input(f"\nLanza {jugador2}")

dado1Jugador2 = random.randint(1,6)
dado2Jugador2 = random.randint(1,6)
total2 = dado1Jugador2 + dado2Jugador2
funciones.mostrarLanzamiento(jugador1,dado1Jugador2,dado2Jugador2)

if total1 > total2:
    funciones.mostrarGanador(jugador1)
elif total2 > total1:
    funciones.mostrarGanador(jugador2)
else:
    print("\nES UN EMPATE!!")