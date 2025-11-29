nombreUsuario = input("Ingrese su nombre: ")
edadUsuario = int(input("Ingrese su edad: "))
nombreAmigo = input("Ingrese el nombre de un amigo: ")
edadAmigo = int(input("Ingrese la edad de su amigo: "))

resultadoSuma = edadUsuario + edadAmigo
resultadoResta = edadUsuario - edadAmigo

print(f"La suma de las edades de {nombreUsuario} y {nombreAmigo} es: {resultadoSuma}")
print(f"La diferencia de las edades de {nombreUsuario} y {nombreAmigo} es: {resultadoResta}")