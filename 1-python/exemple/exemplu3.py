# Exemplu 3: Programul citește de la tastatură n,
# care reprezintă lungimea unui mesaj și returnează
# mesajul generat aleatoriu.
# De asemenea, programul transformă în majuscule
# un număr ales aleatoriu de caractere din mesaj.

import random

n = int(input("Introduceți lungimea mesajului de generat, n = "))

alfabet = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
        'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
        'w', 'x', 'y', 'z']

litere = []
for i in range(n):
    litere.append(random.randint(0, 25))

mesaj = ""
for litera in litere:
    mesaj += alfabet[litera]

nrMajuscule = random.randint(0, n)
if (nrMajuscule == 0):
    print("Programul nu a ales adăugarea de majuscule.")
    print(f"Mesajul generat este: {mesaj}.")
    exit()

pozitiiMajuscule = []
majusculeUnice = 0
while (majusculeUnice < nrMajuscule):
    m = random.randint(0, n)
    if m not in pozitiiMajuscule:
        pozitiiMajuscule.append(m)
        majusculeUnice += 1

pozitiiMajuscule.sort()
mesajMajuscule = ""
for c in mesaj:
    if mesaj.index(c) in pozitiiMajuscule:
        mesajMajuscule += c.upper()
    else:
        mesajMajuscule += c

print(f"Mesajul generat aleatoriu, cu majuscule adăugate aleatoriu pe pozițiile {pozitiiMajuscule}")
print(f"este: {mesajMajuscule}")
