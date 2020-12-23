# Exemplu 1: Se citește de la tastatură un număr n.
# Să se afișeze dacă acesta este număr prim.
# Dacă nu este prim, să se afișeze primul divizor găsit.

import math

n = int(input("Introduceți un număr n = "))
for i in range(2, int(math.sqrt(n)) + 1):
    if (n % i == 0):
        print(f"Numărul {n} nu este prim. Are pe {i} drept divizor.")
        exit()
print(f"Numărul {n} este prim.")
