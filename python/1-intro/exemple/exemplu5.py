# Exemplu 5: Se citește de la tastatură n, apoi o listă de n numere naturale.
# Să se afișeze cel mai mare divizor comun al tuturor numerelor din listă.
# Programul conține validarea datelor.

def cmmdc(a, b):
    while (a != b):
        if (a > b):
            a -= b
        else:
            b -= a
    return a

n = int(input("Introduceți numărul de elemente din listă, n = "))
while (n <= 0):
    print("Numărul introdus nu este natural. Reîncercați.")
    n = int(input("Introduceți numărul de elemente din listă, n = "))

print(f"Acum introduceți cele {n} elemente ale listei, cîte unul pe linie.")
numere = []
for i in range(n):
    numere.append(int(input()))

d = cmmdc(numere[0], numere[1])
for i in range(2, n):
    d = cmmdc(d, numere[i])

print(f"cmmdc({numere}) = {d}")
