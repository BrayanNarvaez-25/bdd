import random

print("DEBES OBTENER MÁS DE 8 PARA SALVARTE")

input("Presiona enter para lanzar los dados")

dado1 = random.randint(1,6)
dado2 = random.randint(1,6)
total = dado1 + dado2

print(f"Has obtenido {dado1} y {dado2}, total: {total}")

if total <= 8:
    print("Los siento no es tu día de suerte, no te salvas")
else:
    print("Felcidades!!")
    print("TE SALVASTE")