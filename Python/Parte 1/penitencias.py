import random

print("Juego de penitencias según un número del dado")
input("Presiona enter para empezar")

numA = random.randint(1,6)

print(f"Tu número es: {numA}")

if numA == 1:
    print("Hacer 10 flexiones de pecho")

elif numA == 2:
    print("Grita que estas loco") 

elif numA == 3:
    print("Aguanta la respiración por 1 min")

elif numA == 4:
    print("Come un limón entero")

elif numA == 5:
    print("Canta la cancion de 'Los pollitos dicen'")

else:
    print("Baila la canción de Chuchuwa")