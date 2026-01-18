nombreProducto = input("Ingrese el nombre del producto: ")
precioProducto = float(input("Ingrese el precio del producto: "))
cantidad = int(input("Ingrese la cantidad que desea comprar: "))

total = precioProducto * cantidad
print(f"El valor de {cantidad} {nombreProducto} es: {total}")
