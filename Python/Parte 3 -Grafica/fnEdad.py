import datetime
def calcularEdad(anioNacimiento):
    fechaHoy=datetime.date.today()
    anioActual=fechaHoy.year
    edad=anioActual-anioNacimiento
    return edad
