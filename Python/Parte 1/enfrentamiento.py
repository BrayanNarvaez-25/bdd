import random

jugador1 = input("Ingrese el nombre del Jugador 1: ")
jugador2 = input("Ingrese el nombre del Jugador 2: ")

input("Jugador 1 lanza el dado (preciona enter)")
numA1 = random.randint(1,6)
print(f"{jugador1} sacaste un {numA1}")

input("Jugador 2 lanza el dado (preciona enter)")
numA2 = random.randint(1,6)
print(f"{jugador2} sacaste un {numA2}")

if numA1 > numA2:
    print(f"El ganador es: {jugador1}")

elif numA2 > numA1:
    print(f"El ganador es: {jugador2}")

else:
    print(f"{jugador1} y {jugador2} empataron.")