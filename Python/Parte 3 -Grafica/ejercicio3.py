numeros = [10,20,30,40,50]

for num in numeros:
    print(num)
    if num == 30:
        break

tamanio = len(numeros)
for indice in range(tamanio):
    num2 = numeros[indice]
    print(num2)
    if num2 == 30:
        break

dado1 = [1,2,3,4,5,6]
dado2 = [1,2,3,4,5,6]
combinaciones = []
for valor1 in dado1:
    for valor2 in dado2:
        combinaciones.append(f"{valor1} y {valor2}")
    if valor1 == 3:
        break
print(combinaciones)