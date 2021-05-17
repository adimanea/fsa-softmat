# Elemente de statistică

În acest ultim curs, ne vom ocupa de calcule statistice simple și de reprezentarea
lor grafică, pentru un set de date generat manual sau descărcat din baze de date
(de exemplu, incluzînd și [procesarea CSV](4-csv.md)).

## Calcule elementare
Presupunem că lucrăm cu un set discret de date, în care avem, în cazul cel mai simplu,
perechi de date de forma `(X, Y)` sau, mai general, n-tupluri `(X1, X2, ..., Xn)`.
Cîteva calcule statistice simple care se pot face pe un astfel de set de date includ:
- media sau media aritmetică (eng. "mean" sau "average");
- media ponderată (eng. "weighted average"); 
- mediana (eng. "median");
- abaterea standard (eng. "standard deviation");
- modul (eng. "mode").

Definițiile urmează.

Dat un set de date `(X1, X2, ..., Xn)`:
- **media** sau **media aritmetică** se calculează prin raportul între suma valorilor și numărul lor. În pseudocod, pentru o listă `l = [x1, x2, ..., xn]`, 
  
```
media = (x1 + x2 + ... + xn) / length(l)
```
  
- **media ponderată**, cu ponderi `p1, p2, ..., pn` se calculează prin înmulțirea valorilor `xi` cu ponderile corespunzătoare, împărțind apoi tot la numărul lor. În pseudocod, am scrie, pentru aceeași listă de mai sus, 
  
```
media_ponderata = (x1 * p1 + x2 * p2 + ... + xn * pn) / (p1 + p2 + ... + pn)`;
```

- **mediana** este valoarea care apare în mijlocul setului de date, dacă avem un număr impar de date sau media aritmetică a celor două date care apar în mijloc, dacă avem un set cu un număr par de date. Astfel, de exemplu, pentru setul de date `[1, 2, 3, 4, 5]`, mediana este `3`, iar pentru setul de date `[1,2,3,4,5,6]`, mediana este `3.5 = (3 + 4) / 2`;
- **modul** este valoarea care apare cel mai frecvent. Dacă există o unică astfel de valoare, setul de date se numește *unimodal*, altfel, se numește *bimodal*, *trimodal* sau, în general, *multimodal*. Exemple:
    + modul setului `[1, 2, 2, 3, 4, 5]` este `2`;
    + modurile setului `[1, 2, 2, 3, 3, 4, 5]` sînt `2` și `3`;
- **abaterea standard**, notată de obicei, cu `sigma`, este calculată, pentru un set de date `[x1, x2,..., xn]`, cu media stocată în variabila `media` și folosind notații uzuale, cu formula:
  
```
sigma = sqrt( ((x1 - media)^2 + (x2 - media)^2 + ... + (xn - media)^2) / n )
```

## Exemplu
Fie setul de date `(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)`.
- media este 5.5;
- fie ponderile `1, 2, 0, 0, 0, 0, 1, 2, 0, 0`. Media ponderată este 4.67;
- mediana este 5.5;
- modul nu există (sau fiecare valoare din set este un mod);
- abaterea standard este 2.8722.

## Verificare Excel
Valorile pot fi verificate folosind Excel și formulele:
- `AVERAGE` este formula pentru medie (exemplu `AVERAGE(A1:A10)` pentru datele stocate în coloanele `A1:A10`);
- media ponderată se poate calcula cu o combinație de `SUMPRODUCT` și `SUM`. Astfel, pentru valorile stocate în celulele `A1:A10` și ponderile stocate în celulele `B1:B10`, calculăm:
    + `SUMPRODUCT(A1:A10, B1:B10)` calculează suma produselor dintre valori și ponderi;
    + `SUM(B1:B10)` calculează suma ponderilor;
    + `SUMPRODUCT(A1:A10, B1:B10) / SUM(B1:B10)` returnează media ponderată;
- `MEDIAN` returnează mediana (`MEDIAN(A1:A10)` în exemplul de mai sus);
- `MODE.MULT` returnează modul, dacă există, sau `N/A`, dacă nu există (`MODE.MULT(A1:A10)`, de exemplu);
- `STDEV.P` returnează abaterea standard (`STDEV.P(A1:A10)`).

## Resurse suplimentare
- Foaie Excel cu exemple [aici (CSV)](cars.csv) și [aici (XLSX)](cars.xlsx) (vedeți coloanele colorate cu galben, au fost adăugate pe baza foii CSV inițiale. Click pe elementele din coloană pentru a vedea formula aplicată);
- Foaie Jupyter cu calcule Python, împreună cu grafice [aici](6-stat.ipynb)
- Exerciții (**TBA**).