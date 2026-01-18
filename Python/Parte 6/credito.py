def calcularInteresSimple(monto,plazo,tasa):
    interesSimple = monto * (tasa/100) * plazo
    return interesSimple

def calcularInteresCompuesto(monto,plazo,tasa):
    interesCompuesto = monto * (1+(tasa/100))**plazo
    totalInteresCompuesto = interesCompuesto - monto
    return round(totalInteresCompuesto,2)

def calcularCuota(monto,tasa,plazo):
    i = tasa/100
    pago = monto * (((1 + i)**plazo) * i)/(((1 + i)**plazo) - 1)
    return round(pago,2)
