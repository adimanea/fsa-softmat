# Centralizator exerciții

- Exercițiile "standard" sînt numerotate sub forma LN.M., unde N este numărul laboratorului și M numărul exercițiului. Ele pot conține cerințe opționale (marcate cu *BONUS*), care pot fi ignorate la o primă implementare;
- Exercițiile mai simple sînt numerotate sub forma SN.M., unde M și N au același sens ca mai sus;
- Exercițiile bonus (mai dificile) sînt numerotate sub forma BN.M.

## Săptămîna 1: Setup
Scopul principal este de instalare a uneltelor necesare:
- limbajul (compilatorul/interpretorul etc);
- un editor/IDE preferat.

Apoi, teste simple care să vă obișnuiască cu modul de lucru.

L1.1. Copiați (*scriind și înțelegînd*, nu copy-paste) exemplele de [aici](https://github.com/adimanea/fsa-softmat/tree/main/python/1-intro/exemple)
(fișierele `exemplu1.py, ..., exemplu5.py`). 
Citiți comentariile din cod și asigurați-vă că obțineți rezultatele corecte la ieșire.

L2.1. Interacționați cu intepretorul, urmînd pașii de mai jos.
Introduceți în terminal comanda `python`, apoi apăsați Enter. Ar trebui să vedeți
un rezultat de forma:

```
Python 3.9.2 (default, Feb 20 2021, 18:40:11)
[GCC 10.2.0] on linux
Type "help", "copyright", "credits" or "license" for more information.
>>> |
```

Sînteți în interpretorul interactiv Python. Acolo puteți introduce comenzi. Încercați
diverse comenzi de forma (apăsați Enter după fiecare pentru confirmare; am inclus
și rezultatul așteptat; liniile precedate de `>>>` sînt linii de intrare, iar liniile
care nu au acel simbol la început sînt linii de ieșire, adică răspunsul interpretorului;
acolo unde linia începe cu `...`, înseamnă că interpretorul încă mai așteaptă informații):

```
>>> print('a')
a
>>> print(5 + 12)
17
>>> a = 3
>>> b = 5
>>> print(a * b)
15
>>> print(f'Rezultatul produsului {a} * {b} este {a*b}')
Rezultatul produsului 3 * 5 este 15
>>> for i in range(5):
...     print(i)
...
0
1
2
3
4
>>> text = 'laborator'
>>> print(f"Lungimea cuvîntului 'laborator' este {len(text)}.")
Lungimea cuvîntului 'laborator' este 9.
>>> lista = [1,2,3]
>>> for i in range(7, 3, -1):
... # adaug la listă numerele de la 7 la 4, descrescător
...     lista.append(i)
... 
>>> print(lista)
[1, 2, 3, 7, 6, 5, 4]
```

Ieșiți din interpretor apăsînd `Ctrl + d`.

## Săptămîna 2: Exerciții simple
### Exerciții standard
L2.1. Se citesc de la tastatură două numere întregi.
Să se afișeze o listă cu divizorii lor primi comuni.
Exemplu: se citesc 100 și 200. Se afișează `[2, 5]`.

L2.2. Se citește de la tastatură un număr întreg. Să se afișeze
descompunerea lui în factori primi.
Exemplu: se citește `1000`, se afișează `1000 = 2^3 * 5^3`.

L2.3. Se citește de la tastatură un număr prim `p`, un număr `n`
și o listă de `n` numere naturale. Să se afișeze care numere din listă
sînt divizibile cu `p`. *BONUS:* Se va ține cont de validarea datelor.
Astfel, dacă numărul `p` introdus nu este prim, se va afișa `EROARE` și
se va cere alt număr. Similar, dacă `n` sau vreunul dintre elementele
listei nu este număr întreg (`n` trebuie să fie chiar natural!) se va cere
alt număr. Exemplu:

```
-- Introduceți un număr prim p = 10
10 nu este număr prim, reîncercați.
-- Introduceți un număr prim p = 11
-- Cîte elemente va conține lista? n = -3
Numărul de elemente trebuie să fie natural! Reîncercați.
-- Cîte elemente va conține lista? n = 4
-- Introduceți, pe rînd, cele 4 elemente.
4
18
120
1.2
-- 1.2 nu este număr întreg, reîncercați!
121
-- Elementele din lista [4, 18, 120, 121] divizibile cu 11 sînt: 121.
```

L2.4. Se dau două numere naturale `m` și `n`. Să se afișeze numerele
prime dintre `m` și `n`, precum și numărul acestora. *BONUS*: Se va ține cont
de validarea datelor. Exemplu:

```
-- Introduceți marginea inferioară a intervalului m = 20
-- Introduceți marginea superioară a intervalului n = 4
EROARE! Marginea superioară trebuie să fie mai mare decît marginea inferioară.
Reîncercați cu un număr mai mare decît 20.
-- Introduceți marginea superioară a intervalului n = 30
Există 2 numere prime între 20 și 30: 23, 29.
```

L2.5. Scrieți un program care să înmulțească două matrice pătratice de dimensiune `n`
(cu `n` citit de la tastatură). *BONUS:* Refaceți programul cu matricele avînd
elemente din `Z_m`, cu `m` citit de la tastatură și cu validarea datelor (alternativ,
convertiți elementele în `Z_m` înainte de operații).

L2.6. Scrieți un program care să implementeze cifrul Caesar pentru un cuvînt.
Se citește de la tastatură un cuvînt (fără caractere speciale, ci doar din alfabetul
englezesc) și o cheie de criptare `k`. Cifrul este rezultatul translației cu `k`
poziții în alfabet a caracterelor din cuvîntul dat. *BONUS:* Adăugați condiții
de validare, de exemplu, ignorarea caracterelor non-alfabetice și asigurarea
că se folosește o cheie număr întreg. Exemplu:

```
-- Introduceți cuvîntul: laborator
-- Introduceți cheia de criptare k = 2
Codul rezultat este: ncdqtcvqt
```

L2.7. Scrieți un program care să rezolve o ecuație de gradul 1 cu coeficienți
în `Z_n`, de forma `a * x + b = c`. Se citesc de la tastatură coeficienții
`a, b, c` și modulul `n` și se returnează soluția `x`. *BONUS:* Atenție la
condiții de validare. Anumite astfel de ecuații nu se pot rezolva. În plus,
țineți cont și de faptul că toate numerele implicate trebuie să fie elemente
din `Z_n`.

L2.8. Scrieți un program care să rezolve o ecuație de gradul 2 în `Z_n`, de forma
`a*x^2 + b*x + c = d`. Se citesc de la tastatură coeficienții `a, b, c, d` și
modulul `n` și se returnează rădăcinile. *BONUS:* Atenție la condiții de validare
și la condițiile de existență a soluțiilor.

L2.9. Scrieți un program care să citească un text dintr-un fișier și să returneze
o statistică simplă pe text, de exemplu (nu neapărat aceste elemente sau toate):
- numărul de vocale;
- numărul de consoane;
- numărul de cuvinte;
- numărul de spații libere;
- numărul de caractere numerice;
- numărul total de semne;
- cel mai lung cuvînt.

L2.10. Scrieți un program care să poată calcula suma a două numere de maximum 1000 cifre.
Cele două numere se vor citi dintr-un fișier, iar suma se va afișa tot în fișier
(același sau altul).

### Exerciții bonus
B2.1. Cifrul Caesar pe blocuri: Se împarte cuvîntul citit în blocuri de lungime `b`, cu
`b` citit de la tastatură și se folosesc chei diferite pentru fiecare bloc. Dacă
cuvîntul citit nu se împarte în mod egal în blocuri de lungime `b`, se neglijează
excesul sau caracterle insuficiente. Exemplu: pentru cuvîntul `matematica` și `b = 3`,
se obțin 4 blocuri: `mat ema tic a`.

B2.2. Cifrul Caesar cu majuscule introduse aleatoriu: Modificați programul cu
cifrul Caesar astfel încît să transforme în majuscule caractere alese aleatoriu din cuvînt.

B2.3. Cifrul Caesar cu fișiere: Modificați oricare dintre exercițiile cu cifrul Caesar
astfel încît să ia mesajul în text clar dintr-un fișier și doar cheia de criptare de
la tastatură. Cifrul rezultat se va afișa tot într-un fișier.

B2.4. Folosiți o bibliotecă grafică (de exemplu, `matplotlib`) și reprezentați grafic
statistici pe text.

### Exerciții simple
S2.1. Citiți de la tastatură numere pînă la introducerea simbolului `q` și afișați
suma lor. Exemplu:

```
Introduceți numere de adunat, ieșiți cu q:
4
6
3
9
-1
2
q
Suma este: 23
```

S2.2. Citiți de la tastatură numere impare și afișați-le într-o listă.
Citirea se termină cu introducerea unui număr par sau 0. Exemplu:

```
Introduceți numere impare. Ieșiți cu 0 sau cu un număr par:
5
7
11
2121
4111
0
Lista numerelor impare introduse este: [5, 7, 11, 2121, 4111]
```

S2.3. Prezentați utilizatorului o alegere între `sumă` și `produs`, apoi cereți
două numere. Se va afișa rezultatul operației alese între ele. Exemplu:

```
Ce veți calcula: suma (s) sau produsul (p)?
s
Introduceți numerele de sumat:
21
51
Suma lor este: 72
```

S2.4. Afișați numărul de divizori proprii (diferiți de 1 și de numărul dat)
ai unui număr citit de la tastatură. Exemplu:

```
Introduceți numărul: 42
Numărul 42 are 5 divizori.
```

S2.5. Citiți două numere de la tastatură și afișați dacă vreunul dintre ele divide pe celălalt.
Exemplu:

```
Introduceți două numere:
32
16
16 este divizor al lui 32
---------------------------
Introduceți două numere:
11
41
Niciunul dintre numere nu divide pe celălalt
```

S2.6. Scrieți un program pentru administrarea invitaților la o petrecere:
- Se citește o listă neagră a persoanelor nedorite;
- Se citește numărul maxim de invitați;
- Se citesc invitații și se adaugă în lista de invitați, ținînd cont ca (a) invitatul să nu fie pe lista neagră și (b) invitatul să nu fie deja în listă;
- Se afișează lista finală de invitați.

Exemplu:

```
Introduceți lista persoanelor nedorite, ieșiți cu 'q':
Ionel
Marcel
Ana
q
Următorii nu vor putea fi invitați: [Ionel, Marcel, Ana]
Introduceți numărul maxim de invitați: 4
Introduceți invitații, ieșind cu 'q':
Ionel
Ionel este în lista neagră și nu poate fi invitat!
Ioana
Cătălin
Ioana
Ioana a fost deja invitată!
Gigi
q
Invitații vor fi: [Ioana, Cătălin, Gigi]
```

S2.7. Scrieți un program care să verifice dacă suma cifrelor unui număr citit de la tastatură
este un număr prim. Exemplu:

```
Introduceți numărul: 14512
Suma cifrelor sale este 13, care este un număr prim.
```

S2.8. Scrieți un program care să verifice dacă suma numerelor unui număr citit de la tastatură
este un pătrat perfect. Exemplu:

```
Introduceți numărul: 12525
Suma cifrelor sale este 15, care un este un pătrat perfect.
```

S2.9. Scrieți un program care să verifice, pentru un număr dat, cîte cifre pare are (inclusiv 0), situate pe
poziții impare. Vom presupune indexarea pozițiilor de la 1. Exemplu:

```
Introduceți numărul: 149087098
Numărul are 4 cifre pare, dintre care 3 sînt pe poziții impare.
```

S2.10. Modificați oricare dintre programele de mai sus astfel încît să se ruleze
repetat, pînă cînd utilizatorul introduce o anumită literă/cifră.

## Săptămîna 3: Jupyter
Toate exercițiile de mai jos trebuie rezolvate folosind foi Jupyter Notebook.

### Exerciții standard
L3.1. Scrieți o foaie Jupyter cu un bloc Markdown în care să explicați pașii de rezolvare a unei ecuații de gradul 1
și un bloc de cod care să rezolve o astfel de ecuație, cu coeficienții aleși aleatoriu (folosind `random`).

L3.2. Scrieți o foaie Jupyter cu un bloc Markdown în care explicați ce este un număr prim și un bloc de cod
în care afișați primele 100 de numere prime.

L3.3. Scrieți o foaie Jupyter cu un bloc Markdown în care explicați algoritmul lui Euclid cu scăderi repetate
și un bloc de cod în care să îl aplicați pentru trei perechi de numere alese aleatoriu (folosiți `random.randint`).

L3.4. Scrieți o foaie Jupyter cu un bloc Markdown în care explicați procedura de calcul al sumei cifrelor
unui număr și un bloc de cod în care să calculați această sumă pentru un număr de 10 cifre, ales aleatoriu
(folosiți `random.randint`, cu intervalul corespunzător).

L3.5. Scrieți o foaie Jupyter cu un bloc Markdown care explică procedura de descompunere în factori primi
a unui număr și un bloc de cod care să aplice această procedură pentru un număr aleatoriu de cel puțin 3 cifre
(alternativ, puteți citi numărul dintr-un fișier).

L3.6. Scrieți o foaie Jupyter cu un bloc Markdown care să explice cifrul Caesar și un bloc de cod care să aplice
această cifrare pentru unul dintre prenumele voastre, cheia de criptare fiind ziua de naștere.

L3.7. Scrieți o foaie Jupyter cu un bloc Markdown în care să explicați statistici simple pe text (e.g. numărul de
vocale sau numărul de caractere numerice) și un bloc de cod care să aplice statisticile respective pentru
un text dintr-un fișier de intrare creat de voi (e.g. cu text copiat de pe Wikipedia).

L3.8. Scrieți o foaie Jupyter care să explice într-un bloc Markdown ce este un pătrat perfect într-un inel de clase de resturi `Z_n`
și un bloc de cod care să afișeze toate pătratele perfecte din `Z_n`, cu `n` aleatoriu (între 100 și 1000).

L3.9. Scrieți o foaie Jupyter care să explice într-un bloc Markdown procedura de rezolvare a unei ecuații de gradul 1
cu coeficienți într-un inel de clase de resturi `Z_n` și un bloc de cod care să aplice această procedură
pentru o ecuație cu `n` ales aleatoriu (între 5 și 100) și coeficienții aleși aleatoriu (folosind `random.randint` 
și convertiți în `Z_n`).

L3.10. Scrieți o foaie Jupyter care să explice într-un bloc Markdown cum se inversează o matrice cu 2 linii și
2 coloane și un bloc de cod care să calculeze această inversă, pentru o matrice cu elemente alese aleatoriu;
*BONUS:* Puteți lucra cu matrice avînd elemente în `Z_n`, cu `n` ales aleatoriu (între 5 și 100).

### Exercițiu simplu
S3.1. Scrieți o foaie Jupyter cu un bloc Markdown care să conțină cel puțin 3 dintre următoarele elemente:
- titluri de secțiuni (headings);
- text formatat (bold, italic, underline, strikethrough, cod);
- link către un website;
- liste;
- matematică;
- tabel
și un bloc de cod care să calculeze, de exemplu:
- suma unor numere scrise deja în cod;
- suma elementelor unei liste scrisă deja;
- suma a două numere întregi alese aleatoriu (folosind `random.randint`);
- numărul de vocale sau consoane dintr-un text introdus deja în text.

### Exercițiu bonus
B4.1. Citiți documentația `matplotlib` și scrieți o foaie Jupyter care să conțină cel puțin un bloc de cod
care să afișeze un grafic discret (histogram, scatter, bar, pie) și un bloc Markdown care să explice ce reprezintă codul.
Exemple de surse de inspirație: [1](https://www.geeksforgeeks.org/using-matplotlib-with-jupyter-notebook/),
[2](https://www.tutorialspoint.com/matplotlib/matplotlib_jupyter_notebook.htm),
[3](https://vegibit.com/matplotlib-in-jupyter-notebook/).


## Săptămîna 4: Recapitulare
Oricare dintre exercițiile de mai jos poate fi rezolvat fie în cod sursă, fie folosind Jupyter Notebook.
Dacă alegeți varianta Jupyter, scrieți și cel puțin un bloc Markdown care să explice motivația și scopul codului.
Exercițiile sînt formulate intenționat vag pentru a lăsa libertate studentului să interpreteze sau să modifice
exercițiul dacă apar idei utile.

L4.1. Se dau două șiruri de caractere. Afișați șirul care rezultă prin întrepătrunderea caracterelor celor două.
Exemplu: `abcd` și `xyzt` produc `axbyczdt`.

L4.2. Se dau marginea inferioară și marginea superioară a unui interval. Afișați cît la sută dintre numerele din
interval sînt prime.

L4.3. Se dă o listă de `n` numere naturale, cu `n` cunoscut. Să se afișeze cel mai mare divizor comun al elementelor
din listă.

L4.4. Se dă `n`, număr natural mai mic sau egal cu 20. Să se afișeze tabla înmulțirii inelului `Z_n`.

L4.5. Se dă un text și un caracter. Să se afișeze în ce procent apare caracterul în textul respectiv.
Opțional, se poate separa majuscula de minusculă.

L4.6. Se dau două liste de numere întregi. Să se afișeze mediile celor două liste, minimul și maximul din fiecare
dintre liste și cîte dintre numerele primei liste sînt mai mari decît toate numerele celei de-a doua liste.
