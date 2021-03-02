# Exemplu 2: Se citesc de la tastatură n și g.
# Să se afișeze dacă g este generator al grupului multiplicativ Z_n - {0}.
# Dacă nu, să se afișeze ordinul lui g în Z_n - {0} și subgrupul generat de acesta.
# Programul conține și validarea datelor.

n = int(input("Introduceți modulul cu care lucrăm, n = "))
while (n <= 0):
    print("Numărul introdus trebuie să fie natural. Reîncercați.")
    n = int(input("Introduceți modulul cu care lucrăm, n = "))

g = int(input(f"Introduceți elementul din Z_{n}, g = "))
while (g > n) or (g <= 0):
    print(f"Numărul introdus nu este un element din Z_{n}. Reîncercați.")
    g = int(input(f"Introduceți elementul din Z_{n}, g = "))

puteri_g = [g]
putere = g
for i in range(2, n):
    putere = putere * g % n
    if putere not in puteri_g:
        puteri_g.append(putere)

if (len(puteri_g) == n - 1):
    print(f"{g} este un generator pentru Z_{n}.")
else:
    print(f"{g} nu este un generator pentru Z_{n}. El are ordinul {len(puteri_g)}.")
    print(f"Subgrupul generat de {g} este {puteri_g}.")
