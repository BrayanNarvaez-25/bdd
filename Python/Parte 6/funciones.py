def calcularIVA(precio):
    iva = precio * 0.15
    return iva

def calcularAporteEmpleado(sueldo):
    aporteEmpleado = sueldo * 0.0945
    return round(aporteEmpleado,2)

def calcularAporteEmpresa(sueldo):
    aporteEmpresa = sueldo * 0.121
    return round(aporteEmpresa,2)

def calcularDescuento(precio,porcentaje):
    descuento = precio * (porcentaje/100)
    return round(descuento,2)

def calcularPrecioFinal(precio,porcentaje):
    descuento = precio * (porcentaje/100)
    total = precio - descuento
    return total