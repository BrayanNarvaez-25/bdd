estatura = float(input("Ingrese su estatura: "))
edad = int(input("Ingrese su edad (1-100): "))

if edad >= 1 and edad <= 100:
    print("Edad correcta")

    if edad < 5 and estatura < 1.20:
        print("Puedes usar el juego")
    else:
        print("Lo siento, este juego no es para ti")
else:
    print("Edad incoreccta")


