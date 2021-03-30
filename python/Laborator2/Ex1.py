# L2.1. Se citesc de la tastatură două numere întregi. Să se afișeze o listă cu divizorii lor primi comuni. Exemplu: se citesc 100 și 200. Se afișează [2, 5].
from sympy import sieve
a = int(input("a:"))
b = int(input("b:"))
for i in range(2, min(a, b)):
    if(a % i == 0 and b % i == 0 and (i in sieve)):
        print(i, " ")
