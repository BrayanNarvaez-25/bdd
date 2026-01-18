import random

print("****PRUEBA TU SUERTE****")
print("Si obtienes un 6 ganas!!")

input("Presiona enter para lanzar el dado")

valorObtenido = random.randint(1,6)
print(f"Obtuviste un {valorObtenido}")

if valorObtenido == 6:
    print("Felicidades Ganaste!!")
    print("Estas de suerte!!")
else:
    print("Los siento, no es tu dia de suerte")    