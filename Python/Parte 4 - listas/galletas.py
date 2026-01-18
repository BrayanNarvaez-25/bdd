from random import randint

def generarFortuna():
    mensajes = ["\nNo vuelvas con tu ex",
                "\nAlguien está pensando en ti",
                "\nLa fundas de caramelos no son para un dia",
                "\nPiensa en grande",
                "\nTiempo al tiempo"]
    numA = randint(0,4)
    return mensajes[numA]
    