import random

numeroUsuario = int(input("Adivina un número del 1 al 5: "))
numeroAleatorio = random.randint(1,6)

print(f"El número correcto era el: {numeroAleatorio}")

if numeroUsuario == numeroAleatorio:
    print("Felicidades Ganaste!!")
    print("Estas de suerte")
    