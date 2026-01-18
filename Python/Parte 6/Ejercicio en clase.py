precio_base = 8.50

total_ventas = 0
hombres_mayores = 0
mujeres_menores = 0

while True:
    nombre = input("Ingrese el nombre del cliente (o 'salir' para terminar): ")
    if nombre.lower() == "salir":
        break

    genero = input("Ingrese el género (hombre/mujer): ").lower()
    edad = int(input("Ingrese la edad: "))

    precio_final = precio_base

    if genero == "hombre" and edad >= 18:
        precio_final *= 0.90
        hombres_mayores += 1
    elif genero == "mujer" and edad < 18:
        precio_final *= 0.75
        mujeres_menores += 1

    total_ventas += precio_final

    print(f"Cliente: {nombre}")
    print(f"Precio a pagar: ${precio_final:.2f}")
    print("-" * 30)

print("RESUMEN DE VENTAS")
print(f"Total recaudado: ${total_ventas:.2f}")
print(f"Hombres mayores de edad: {hombres_mayores}")
print(f"Mujeres menores de edad: {mujeres_menores}")
