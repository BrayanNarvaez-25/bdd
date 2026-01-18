nota = float(input("Ingrese su nota (0.0 - 10.0): "))
if nota >= 0 and nota <= 4:
    print("\nDebes mejorar")
elif nota > 4 and nota <= 6:
    print("\nMuy bien")
elif nota > 6 and nota <= 10:
    print("\nExcelente")
else:
    print("\nNota incorrecta")