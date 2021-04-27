# Centralizator exerciții

- Exercițiile "standard" sînt numerotate sub forma LN.M., unde N este numărul laboratorului și M numărul exercițiului. Ele pot conține cerințe opționale (marcate cu *BONUS*), care pot fi ignorate la o primă implementare;
- Exercițiile mai simple sînt numerotate sub forma SN.M., unde M și N au același sens ca mai sus;
- Exercițiile bonus (mai dificile) sînt numerotate sub forma BN.M.

## Săptămîna 1: Setup
Scopul principal este de instalare a uneltelor necesare:
- limbajul (compilatorul/interpretorul etc);
- un editor/IDE preferat.

Vezi detalii despre setup și [aici](https://github.com/adimanea/fsa-softmat/tree/main/python/1-intro/README.org).

Apoi, teste simple care să vă obișnuiască cu modul de lucru.

L1.1. Copiați (*scriind și înțelegînd*, nu copy-paste) exemplele de [aici](https://github.com/adimanea/fsa-softmat/tree/main/python/1-intro/exemple)
(fișierele `exemplu1.py, ..., exemplu5.py`). 
Citiți comentariile din cod și asigurați-vă că obțineți rezultatele corecte la ieșire.

L1.2. Interacționați cu intepretorul, urmînd pașii de mai jos.
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

## Săptămîna 5: Grafice discrete
**Înainte de a rezolva oricare dintre exercițiile de mai jos, este preferabil să fi citit și lucrat atent**
**exemplele simple de lucru cu Numpy și Matplotlib. De asemenea, orice funcție sau clasă necunoscută**
**ar trebui căutată în documentație pentru a îi înțelege funcționarea.**

Toate exercițiile de mai jos este preferabil să fie rezolvate în foi Jupyter, toate la un loc sau cîte
un exercițiu pe foaie, împreună cu teoria necesară.

L5.1. Studiați și înțelegeți exemplele din documentația `matplotlib`, în special:
- [histograme colorate cu diverse modele](https://matplotlib.org/stable/gallery/lines_bars_and_markers/filled_step.html#sphx-glr-gallery-lines-bars-and-markers-filled-step-py);
- [figuri complexe cu scatter și histograme](https://matplotlib.org/stable/gallery/lines_bars_and_markers/scatter_hist.html#sphx-glr-gallery-lines-bars-and-markers-scatter-hist-py);
- [scatter plot cu buline stilizate și grid](https://matplotlib.org/stable/gallery/lines_bars_and_markers/scatter_demo2.html#sphx-glr-gallery-lines-bars-and-markers-scatter-demo2-py);
- [scatter plot cu pie în loc de bulină](https://matplotlib.org/stable/gallery/lines_bars_and_markers/scatter_piecharts.html#sphx-glr-gallery-lines-bars-and-markers-scatter-piecharts-py);
- [scatter plot cu trifoi în loc de bulină](https://matplotlib.org/stable/gallery/lines_bars_and_markers/scatter_symbol.html#sphx-glr-gallery-lines-bars-and-markers-scatter-symbol-py);
- [histogramă cu calcule statistice](https://matplotlib.org/stable/gallery/statistics/histogram_features.html#sphx-glr-gallery-statistics-histogram-features-py);
- [histogramă de diverse tipuri cu `histtype`](https://matplotlib.org/stable/gallery/statistics/histogram_histtypes.html#sphx-glr-gallery-statistics-histogram-histtypes-py);
- [`histtype` pe mai multe seturi de date](https://matplotlib.org/stable/gallery/statistics/histogram_multihist.html#sphx-glr-gallery-statistics-histogram-multihist-py);
- [mai multe histograme pe aceeași figură](https://matplotlib.org/stable/gallery/statistics/multiple_histograms_side_by_side.html#sphx-glr-gallery-statistics-multiple-histograms-side-by-side-py);
- [extragerea unei felii dintr-un pie chart](https://matplotlib.org/stable/gallery/pie_and_polar_charts/bar_of_pie.html#sphx-glr-gallery-pie-and-polar-charts-bar-of-pie-py);
- [pie charts concentrice](https://matplotlib.org/stable/gallery/pie_and_polar_charts/nested_pie.html#sphx-glr-gallery-pie-and-polar-charts-nested-pie-py);
- [pie și donut](https://matplotlib.org/stable/gallery/pie_and_polar_charts/pie_and_donut_labels.html#sphx-glr-gallery-pie-and-polar-charts-pie-and-donut-labels-py);
- [histogramă animată](https://matplotlib.org/stable/gallery/animation/animated_histogram.html#sphx-glr-gallery-animation-animated-histogram-py);
- [histogramă în sistem logaritmic](https://matplotlib.org/stable/gallery/scales/log_bar.html#sphx-glr-gallery-scales-log-bar-py);

L5.2. Experimentați cu exemplele de mai sus, modificînd seturile de date, culorile, tipul reprezentărilor, rescalarea, etichetele etc.

L5.3. Se consideră setul de date: `(X, Y) = [(1, 3), (2, 5), (3, 7), (4, 10), (5, 5), (6, 3), (7, 20), (8, 11), (9, 20), (10, -1)]`.
- realizați un grafic de tip histogramă care să arate dependența variabilei `Y` de variabila `X`;
- realizați un grafic de tip scatter plot care să arate dependența de mai sus;
- realizați un grafic de tip pie chart care să arate cîte procente din perechile `(X, Y)` de mai sus au aceeași paritate (după ce calculați procentele, tot în cod). Mai precis, trebuie să aveți 4 perechi cu aceeași paritate (`(1, 3), (3, 7), (4, 10), (5, 5)`) și 6 perechi cu parități diferite, deci graficul va avea 2 felii. Realizați-l și în varianta lipită, și în cea folosind `explode`.

L5.4. Se realizează un sondaj, unde 10 persoane sînt întrebate cîte cărți pe an citesc. Se primesc răspunsurile
(sub forma `(sex, vîrstă, nr cărți)`): `(F1, 21, 30), (F2, 41, 40), (F3, 19, 55), (F4, 44, 4), (F5, 80, 20), (M1, 55, 25), (M2, 31, 31), (M3, 71, 21), (M4, 15, 25), (M5, 34, 31)`.
- realizați cîte un grafic de tip histogramă care să arate, separat, numărul de cărți citite de persoanele de sex feminin și cele de sex masculin;
- realizați un singur grafic de tip bar chart care să arate numărul de cărți citite de femei și bărbați, alăturînd barele după cea mai mică diferență de vîrstă (i.e. `(F1, 21)` va fi alăturată lui `(M4, 15)`, `(F2, 41)` va fi alăturată lui `(M5, 34)` etc.).

L5.5. Se realizează un sondaj de opinie printre locuitorii unui oraș, care sînt întrebați
 ce genuri de muzică preferă și se primesc răspunsurile:

| Numărul de respondenți | Genul de muzică |
|----------------------- | --------------- |
| 200                    | clasică         |
| 171                    | jazz            |
| 311                    | blues           |
| 411                    | rock            |
| 401                    | electronică     |
| 355                    | folk            |

Realizați un grafic de tip pie chart care să arate procentele preferințelor, cu etichetele corespunzătoare.

B5.1. Se consideră conjectura lui Collatz: dat un număr natural `n`, se aplică transformările:
- dacă `n` este par, se înjumătățește;
- dacă `n` este impar, se transformă în `3*n + 1`.

Conjectura afirmă că după un număr finit de pași, indiferent de numărul de pornire, se ajunge la 1.

Exemple:

```
10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
31 -> 64 -> 32 -> 16 -> 8 -> 4 -> 2 -> 1
15 -> 46 -> 23 -> 70 -> 35 -> 106 -> 53 -> 160 -> 80 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
```

- Scrieți un program care să producă un set de date alcătuit din perechi de forma `(n, nr_pași_collatz(n))`,
pentru 1000 de valori aleatoare ale lui `n`, *diferite*. Exemplu: în cazul de mai sus avem setul:
`(10, 6), (31, 7), (15, 17)`. 
- Reprezentați grafic, pe o histogramă, dependența celor două variabile, sub forma `X = n, Y = nr_pași_collatz(n)`.
- Reprezentați grafic, pe o histogramă, pe intervale de lungime 10, numărul mediu de pași în algoritmul Collatz. Așadar, se va calcula media `M` de pași pentru numerele din intervalele `X1 = (1, 10), X2 = (11, 20), X3 = (21, 30)...` și se va reprezenta grafic dependența lui `M` de `X`.
- Reprezentați grafic pe un pie chart procentele dintre numerele care au necesitat între 1 și 100 de pași Collatz, între 101 și 200, între 201 și 300 etc., pînă la valoarea maximă din setul de date generat.

**Bonus** pentru oricare dintre exercițiile de mai sus dacă folosiți stilizări diverse: culori nestandard, modele, legende plasate non-standard, grid-uri, fonturi speciale etc.

## Săptămîna 6: Grafice discrete și CSV parsing
L6.1. Scrieți un fișier CSV folosind modulul specific, care să conțină cel puțin 3 liste
(corespunzătoare unui cap de tabel și două linii). Exemplu:
- `cap_tabel = ["nr_crt", "oraș/sector", "nota_parcuri", "nota_parcări", "nota_trafic", "nota_trotuar", "nota_borduri"]`
- `rasp_b = ["1", "B, Sector 3", "5", "8", "3", "10", "7"]`;
- `rasp_ct = ["2", "CT", "5", "7", "10", "3", "8"]`

Apoi reprezentați grafic pe o histogramă care să conțină alăturat datele pentru cele două orașe.
Opțional, trasați și cîte o orizontală care să arate media notelor.

L6.2. Refaceți oricare dintre exercițiile laboratorului anterior, folosind scriere sau citire
în și din fișiere CSV. Exemple:
- L5.3.: puteți scrie cele două liste `X` și `Y` într-un CSV, cu 2 coloane și 10 linii;
- L5.4.: puteți scrie tripletele în trei liste `sex, vîrstă, nr_cărți` într-un CSV cu 3 coloane și 10 linii;
- L5.5.: puteți reface tabelul într-un CSV, cu listele `nr_rasp, gen_muzical`, apoi le scrieți într-un CSV cu 2 coloane și 7 linii;
- B5.1.: puteți scrie datele generate într-un CSV, de forma `input, pasiCollatz(input)`, cu 2 coloane și 1000 linii.

L6.3. Preluați seturi de date de pe Internet în format CSV și realizați reprezentări grafice relevante.
Exemple:
- [Coronavirus Source Data](https://ourworldindata.org/coronavirus-source-data). Grafice posibile:
  + evoluția cazurilor noi într-o lună, pentru o țară fixată;
  + evoluția numărului total de vaccinări într-o lună, pentru o țară fixată;
  + pentru un set de cîteva (8-10 cel puțin) țări, media vaccinărilor într-o lună fixată;
 
- [Project datasets](https://perso.telecom-paristech.fr/eagan/class/igr204/datasets). Grafice posibile:
  + Alegeți o caracteristică nutritivă (e.g. proteine) și reprezentați grafic conținutul acelei caracteristici pentru tipurile de cereale incluse în CSV;
  + Evoluția lungimii filmelor versus data lansării;
  + Pie chart cu procentele de actori principali masculini/feminini pentru un deceniu.
 
- [CORGIS](https://corgis-edu.github.io/corgis/csv/). Grafice posibile:
  + Încasările medii pentru musical vs piese de teatru [de pe Broadway](https://corgis-edu.github.io/corgis/csv/broadway/) într-un pie chart;
  + Evoluția [temperaturii medii, minime, maxime](https://corgis-edu.github.io/corgis/csv/weather/) dintr-un stat din SUA;
  + Evoluția [vînzărilor de carte de pe Amazon](https://corgis-edu.github.io/corgis/csv/publishers/).