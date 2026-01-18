def calcularPromedio(nota1,nota2,nota3):
    promedio = (nota1 + nota2 + nota3)/3
    return promedio

def consultarMulta(tipoMulta):
    if tipoMulta == 1:
        return 10
    elif tipoMulta == 2:
        return 15
    elif tipoMulta == 3:
        return 20
    elif tipoMulta == 4:
        return 30
    else:
        return -1

def calcularValorHora(salario):
    valorHora = salario / 160
    return valorHora

def calcularSubtotal(precioProducto,cantidad,porcentajeDescuento):
    subtotalSinDescuento = precioProducto * cantidad
    descuento = (subtotalSinDescuento * porcentajeDescuento) / 100
    subtotal = subtotalSinDescuento - descuento
    return subtotal

def calcularValorDescuento(precio,porcentajeDescuento):
    total = (precio * porcentajeDescuento) / 100
    return total
