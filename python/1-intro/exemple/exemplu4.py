# Exemplu 4: Se citește dintr-un fișier un text și
# de la tastatură un caracter.
# Să se afișeze de cîte ori apare caracterul respectiv
# în textul din fișier. Se va oferi opțiunea de a alege
# dacă se numără case sensitive sau nu.

caracter = input("Introduceți caracterul de căutat în fișier, c = ")
while (len(caracter) != 1):
    print("Introduceți un singur caracter. Reîncercați.")
    caracter = input("Introduceți caracterul de căutat în fișier, c = ")

caseSensitive = "nu"

if caracter.isalpha():
    rasp = ['da', 'nu']
    caseSensitive = input("Căutarea va fi case sensitive? (da/nu) ")
    while (caseSensitive not in rasp):
        print("Vă rugăm introduceți 'da' sau 'nu'")
        caseSensitive = input("Căutarea va fi case sensitive? (da/nu) ")

fisier = open("text", "r").readlines()

nrAparitii = 0

for l in fisier:
    if (caseSensitive == 'da'):
        for c in l:
            if (c == caracter):
                nrAparitii += 1
    else:
        for c in l:
            if (c.lower() == caracter.lower()):
                nrAparitii += 1

if (caseSensitive == 'da'):
    print(f"Caracterul '{caracter}' apare de {nrAparitii} în textul din fișier.")
else:
    print(f"Caracterul '{caracter.upper()}/{caracter.lower()}' apare de {nrAparitii} în textul din fișier.")
