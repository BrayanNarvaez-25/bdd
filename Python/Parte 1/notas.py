nota = float(input("Ingrese la nota de su examen: "))
if nota <= 10 and nota >= 0:
    print("\nEs una nota válida")
    faltas = int(input("\nIngrese el número de faltas: "))
    if faltas < 3 and nota >= 8:
        print("\nAPROVADO!!")
    else:
        print("\nREPROBADO :(")
else:
    print("\nSolo se permiten notas entre 1 y 10")

print("\nFIN DEL PROGRAMA")