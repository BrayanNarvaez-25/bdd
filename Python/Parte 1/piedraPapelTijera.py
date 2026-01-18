import random

print("Vas a jugar piedra, papel o tijera contra el computador")

print("\nPara PIEDRA digita 1")
print("Para PAPEL dijita 2")
print("Para TIJERA digita 3")

numE = int(input("\nEscoje tu opción: "))
if numE == 1:
    print("\nELEGISTE PIEDRA")
elif numE == 2:
    print("\nELEGISTE PAPEL")
elif numE == 3:
    print("\nELEGISTE TIJERA")
else:
    print("\nDEBE SER UN NÚMERO ENTRE 1 Y 3")

numA = random.randint(1,3)
if numA == 1:
    print("\nLA COMPU ELIGIO PIEDRA")
elif numA == 2:
    print("\nLA COMPU ELIGIO PAPEL")
elif numA == 3:
    print("\nLA COMPU ELIGIO TIJERA")

if numE == numA:
    print("\nEMPATE")
elif (numE == 1 and numA == 3) or (numE == 2 and numA == 1) or (numE == 3 and numA == 2):
     print("\nGANASTE!!")
elif(numE == 3 and numA == 1) or (numE == 1 and numA == 2) or (numE == 2 and numA == 3):
     print("\nLA COMPU GANA")

#Forma mas simple:
#else:
#    print("\nLA COMPU GANA")