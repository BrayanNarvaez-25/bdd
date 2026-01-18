dado1 = [1,2,3,4,5,6]
dado2 = [1,2,3,4,5,6]
combinaciones = []
combinaciones2 = []

for valor1 in dado1:
    for valor2 in dado2:
        combinaciones.append(f"{valor1} y {valor2}")

print(combinaciones)

tamanioDado1 = len(dado1)
tamanioDado2 = len(dado2)

for indice1 in range(tamanioDado1):
    valor1 = dado1[indice1]
    for indice2 in range(tamanioDado2):
        valor2 = dado2[indice2] 
        combinaciones2.append(f"{valor1} y {valor2}")
    dado1[indice1] = 0

print(combinaciones2)
print(dado1)