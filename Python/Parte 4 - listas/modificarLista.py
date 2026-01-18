notas = [9.5,9.5,9,10,5]

tamanio = len(notas)
for indice in range(tamanio):
    nota = notas[indice]
    if nota >= 9.5:
        notas[indice] = 10
    
print(notas)