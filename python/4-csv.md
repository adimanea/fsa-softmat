# Parcurgerea și utilizarea fișierelor CSV

Formatul CSV (eng. *Comma Separated Values*, adică valori separate prin virgulă)
este foarte folositor atunci cînd vrem să preluăm seturi de date. Practic,
informațiile sînt similare cu cele tabelate, doar că sînt definite într-un format
mult mai accesibil din punctul de vedere al textului simplu (*plain text*).

Un fișier CSV se prezintă într-o formă similară cu cea de mai jos:

```csv
titlu_coloana1, titlu_coloana2, titlu_coloana3, titlu_coloana4
valoare1_col1, valoare1_col2, valoare1_col3, valoare1_col4
valoare2_col1, valoare2_col2, valoare2_col3, valoare2_col4
...
```

De exemplu, datele de mai jos ar putea reprezenta valorile preluate
dintr-un sondaj cu întrebarea: *Cîte cărți ați citit în ultimul an?*:
```csv
oraș, 1-10, 11-20, 21-30, 31-40, 41-50
bucurești, 4, 63, 31, 44, 55
cluj, 43, 32, 55, 22, 11
iași, 44, 66, 11, 22, 55
```

Datele, prezentate în forma de mai sus, sînt echivalente cu forma tabelară:

| Oraș | 1-10 | 11-20 | 21-30 | 31-40 | 41-50 |
| ---- | ---- | ----- | ----- | ----- | ----- |
| București | 4 | 63 | 31 | 44 | 55 |
| Cluj | 43 | 32 | 55 | 22 | 11 |
| Iași | 44 | 66 | 11 | 22 | 55 |

Pentru diverse proiecte din cadrul *data science* și subiecte conexe, există mai
multe site-uri de unde puteți descărca asemenea seturi de date, în format CSV, precum:
- [data.world](https://data.world/datasets/free) (necesită cont, gratis);
- [datahub](https://datahub.io/collections) (gratis);
- [kaggle datasets](https://www.kaggle.com/datasets) (necesită cont, gratis);
- [google dataset search](https://datasetsearch.research.google.com/) (gratis);
- direct de pe GitHub, precum [acest](https://github.com/nytimes/covid-19-data) repository, de la NY Times.

## Utilizarea fișierelor CSV pentru grafice
Înainte de utilizarea unui fișier CSV pentru grafice, avem nevoie de o "curățire" a lui,
pentru a putea fi interpretat direct de Python. Această operațiune se numește, în general, *parsing*
preluat direct în română prin "parsare". Operațiunea este specifică teoriei limbajelor formale
și compilatoarelor și înseamnă "înțelegerea" elementelor componente și descompunerea
datelor în consecință.

Python poate face asta foarte simplu, folosind biblioteca `csv`. Verificați
dacă este deja instalată lansînd în terminal interpretorul Python și încercînd
să importați această bibliotecă:

```shell
python
>>> import csv
>>>
```
Dacă nu primiți o eroare, înseamnă că biblioteca este instalată. Altfel, trebuie
instalată manual cu comanda `pip install csv`.

### Parsing în Python, folosind modulul `csv`
Operațiunea este foarte simplă și se face similar cu citirea dintr-un fișier,
doar că apelăm funcția de citire din modulul `csv`:

```python
import csv

with open('myData.csv', 'r') as csv_file:
    readData = csv.reader(csv_file)
    # acum avem în lista readData toate elementele, pe care le putem accesa linie cu linie
    # atenție! readData este in scope doar în interiorul acestui bloc `with'
    for row in readData:
        print(row)
    csv_file.close()
```

**Atenție:** În versiunea de mai sus, programul nu știe să utilizeze codarea UTF-8,
astfel că dacă aveți informații cu diacritice, for fi afișate greșit.

Pentru utilizarea codării UTF-8, folosim sintaxa:

```python
with open('myData.csv', 'r', encoding='utf-8') as csv_file:
    # ...
```

O sintaxă similară poate fi folosită și pentru scriere.

Putem și scrie un fișier CSV dintr-o listă de date (de exemplu, tabelul de mai sus cu orașe și numere):

```python
import csv

row1 = ['Oraș', '1-10', '11-20', '21-30', '31-40', '41-50']
row2 = ['București', '4', '63', '31', '44', '55']
row3 = ['Cluj', '42', '32', '55', '22', '11']
row4 = ['Iași', '44', '66', '11', '22', '55']

# deschidem (sau creăm) fișierul în care scriem
with open('orase_carti.csv', 'w+') as csv_file:
    # accesăm obiectul care scrie
    writeData = csv.writer(csv_file)
    writeData.writerow(row1)
    writeData.writerow(row2)
    writeData.writerow(row3)
    writeData.writerow(row4)
    csv_file.close()
```

## Resurse suplimentare
- Documentația oficială a modulului `csv` este [aici](https://docs.python.org/3/library/csv.html);
- Un alt tutorial este [aici](https://www.geeksforgeeks.org/working-csv-files-python/) (vedeți și sugestiile din partea de jos a paginii);
- Un modul mai puternic, în special pentru data science, este `pandas`, cu site-ul [aici](https://pandas.pydata.org/), documentația oficială [aici](https://pandas.pydata.org/docs/) (puteți căuta după "csv" și găsiți, de exemplu, [funcțiile de citire](https://pandas.pydata.org/docs/reference/api/pandas.read_csv.html?highlight=csv#pandas.read_csv));
    + Un tutorial simplu de Pandas CSV este [aici](https://www.journaldev.com/29055/python-pandas-module-tutorial) sau [aici](https://realpython.com/python-csv/).
  
## Exerciții suplimentare
[Aici](https://github.com/adimanea/fsa-softmat/blob/main/python/exercitii.md#s%C4%83pt%C4%83m%C3%AEna-6-grafice-discrete-%C8%99i-csv-parsing)