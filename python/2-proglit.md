# Programarea literată (Literate Programming)

## Introducere și scurtă istorie
Această ramură a programării s-a dezvoltat în special mulțumită lui
[Donald Knuth](https://en.wikipedia.org/wiki/Donald_Knuth), pe care majoritatea
îl cunoaștem pentru crearea "limbajului" [TeX](https://en.wikipedia.org/wiki/TeX)
(pronunțat *"teh"*, deoarece X-ul se vrea a fi un *chi*, χ, grecesc stilizat),
folosit pe scară largă astăzi pentru articole și cărți științifice. Ghilimelele
din jurul cuvîntului "limbaj" se datorează faptului că, asemenea Markdown
și HTML, TeX este mai curînd o unealtă de marcaj a textului (*markup language*),
care permite conversia din text simplu (*plain text*) în text bogat (*rich text*),
conținînd culori, diagrame, imagini, mai multe tipuri de fonturi și aspecte etc.

TeX a apărut în special din interesul lui Knuth pentru tipografie, dar modul
în care acesta a fost creat se bazează pe un sistem de programare nou la vremea
respectivă (anii '70-'80), numit [WEB](https://en.wikipedia.org/wiki/Web_(programming_system)).
Unul dintre scopurile declarate ale acestui sistem era acela de a facilita
["programarea literată"](https://en.wikipedia.org/wiki/Literate_programming),
termen creat tot de Knuth. În viziunea lui, o astfel de paradigmă de programare
face legătura între un articol științific sau o carte, pînă la urmă, și un
program software. Practic, duce ideea de documentație și comentarii din cod
la extrem prin faptul că *documentația devine programul*. Cu alte cuvinte,
software-ul programat folosind această paradigmă este, în primul rînd,
destinat a fi citit de o persoană, cu un puternic accent pe documentație, deci,
iar printre rîndurile de text să fie intercalate și bucăți de cod care se execută.

TeX și succesorul său, [LaTeX](https://en.wikipedia.org/wiki/LaTeX), sînt exemple
majore de asemenea abordări, însă, așa cum am menționat mai sus, strict formal,
ele nu sînt limbaje *de programare*, ci doar de *marcaj*. Iterații ulterioare
au schimbat acest lucru și astăzi avem, de exemplu, 
[LuaTeX](https://en.wikipedia.org/wiki/LuaTeX) și alte derivate care permit
utilizarea programatică a marcajelor (La)TeX cu ajutorul unor limbaje de programare
și scripting precum [Lua](https://en.wikipedia.org/wiki/Lua_(programming_language)).

Astăzi, programarea literată nu putem spune că a avut același succes precum celelalte
paradigme (de departe, cea mai de succes fiind [programarea orientată pe obiecte](https://en.wikipedia.org/wiki/Object-oriented_programming),
utilizată pe scară largă în industrie și pentru care Python, Java și C++ sînt limbaje
de căpătîi), însă există suficiente exemple care arată că nu a dispărut cu totul.

De exemplu, în mediul academic, în domenii precum bioinformatică și lingvistică
computațională, programarea literată se folosește în mod curent. De exemplu,
recent publicata [sursă a vaccinului Moderna](https://github.com/NAalytics/Assemblies-of-putative-SARS-CoV2-spike-encoding-mRNA-sequences-for-vaccines-BNT-162b2-and-mRNA-1273/blob/main/Assemblies%20of%20putative%20SARS-CoV2-spike-encoding%20mRNA%20sequences%20for%20vaccines%20BNT-162b2%20and%20mRNA-1273.docx.pdf)
folosește un sistem hibrid de text și cod (genetic), care se poate traduce
ușor în programare literată, folosind unelte specifice de bioinformatică.

Pe lîngă WEB și LuaTeX, sînt și alte limbaje și sisteme moderne care permit
programarea literată (vezi prezentarea de ansamblu de [aici](https://en.wikipedia.org/wiki/Literate_programming#Literate_programming_practices)), precum:
- [Literate Haskell](https://wiki.haskell.org/Literate_programming), care combină programarea funcțională pentru care este cunoscut Haskell cu sistemul LaTeX;
- [Emacs Org Mode](https://orgmode.org/), un sistem complex, care suportă blocuri de cod executabile în aproape orice limbaj de programare, precum și documentație ce se bazează pe un export de tip LaTeX;
- [Swift Playgrounds](https://developer.apple.com/library/prerelease/ios/recipes/Playground_Help/Chapters/AboutPlaygrounds.html), bazat pe limbajul de programare Swift, dezvoltat de Apple pentru iOS și macOS în special;
- Wolfram și Maple au propriile sisteme pentru Mathematica și, respectiv, Maple;
- [Rmarkdown](https://rmarkdown.rstudio.com/), bazat pe simplul [Markdown](https://www.markdownguide.org/), îmbogățit cu blocuri executabile de cod [R](https://www.r-project.org/);
- [Jupyter](https://jupyter.org/), dezvoltat din fostul IPython ("*Interactive Python*"), care actualmente suportă multe limbaje pe lîngă cele 3 pentru care a fost creat (*JUlia, PYThon, R*), implementate cu ajutorul așa-numitelor *kernel-uri* speciale.

În cursul de față, ne vom ocupa în special de Jupyter, cu kernel-ul standard, de Python.
**Studenții sînt, însă, încurajați să experimenteze și cu celelalte limbaje și sisteme, pe care le pot chiar folosi pentru a rezolva sarcinile de laborator.**

## Jupyter
Proiectul [Jupyter](https://jupyter.org/) a evoluat, așa cum am spus, din IPython și
actualmente, este una dintre cele mai folosite platforme pentru a scrie și distribui
cod interactiv. Bazat inițial pe Python, Jupyter a evoluat și suportă nativ limbajele
de programare [Julia](https://julialang.org/), utilizat în special în fizica computațională,
Python și R (utilizat în special pentru statistică). Însă actualmente, comunitatea
a dezvoltat mai multe nuclee (*kernels*), pentru a putea scrie cod interactiv
și în alte limbaje. O listă completă este disponibilă [aici](https://github.com/jupyter/jupyter/wiki/Jupyter-kernels),
însă ghidurile de instalare diferă masiv de la un limbaj la altul și trebuie
consultate individual.

În ansamblu, un proiect Jupyter (numit "caiet Jupyter", *Jupyter Notebook*) este
alcătuit din *blocuri*, care sînt "executate" (i.e. *interpretate*, în termeni tehnici)
prin apăsarea tastelur `Shift + Enter` după editare. În urma acestei acțiuni
poate rezulta fie text formatat, dacă blocul este de tip text, cu sintaxa [Markdown](https://www.markdownguide.org/)
(de fapt, o variantă îmbogățită, care suportă și text matematic, vedeți, de exemplu, ghidul
de [aici](https://towardsdatascience.com/write-markdown-latex-in-the-jupyter-notebook-10985edb91fd?gi=a7c1f9017614))
sau datele de ieșire ale unui bloc de cod, dacă este un bloc Python (de exemplu).

O interacțiune minimală de introducere, *fără instalare*, se poate accesa
[aici](https://jupyter.org/try), dînd click pe [Try Classic Notebook](https://mybinder.org/v2/gh/ipython/ipython-in-depth/master?filepath=binder/Index.ipynb)
sau în varianta mai complexă, [Try JupyterLab](https://hub.gke2.mybinder.org/user/jupyterlab-jupyterlab-demo-578d99og/lab/tree/demo).

### Instalare și rulare locală
Pentru a putea dezvolta și scrie carnete Jupyter, este necesară instalarea.
Acesta va rula într-o arhitectură client-server pe `localhost`.

Pentru acest laborator, recomandăm instalarea urmînd ghidul de [aici](https://jupyter.org/install),
în varianta **Classic Jupyter Notebook**. Puteți folosi manager-ul de pachete Python
`pip` sau `conda` (instalate odată cu PyCharm -- **de verificat!**), apoi lansați în terminal
comanda:

```sh
pip install notebook
```

După instalare, navigați în directorul unde vreți să creați carnetele
și lansați comanda `jupyter notebook`. Se va deschide o interfață web
cu navigatorul de fișiere în directorul respectiv, de unde puteți crea o foaie nouă.
Vedeți [aici](https://jupyter.readthedocs.io/en/latest/running.html#running) instrucțiunile
de rulare.

### Distribuire și colaborare
Prin natura lor, foile și carnetele Jupyter au nevoie de un server care să ruleze
kernel-ul specific. Altfel, foile nu pot fi interactive. 

**Pentru acest laborator, puteți distribui carnetele ca simple fișiere `.ipynb`,**
**nu este necesară conectarea la un serviciu de cloud sau colaborare.**

Dacă doriți să utilizați carnetele Jupyter în cloud, [aici](https://www.dataschool.io/cloud-services-for-jupyter-notebook)
sînt discutate opțiuni precum:
- [Binder](https://mybinder.org/), bazat pe un repository GitHub;
- [Google Collaboratory](https://colab.research.google.com/notebooks/intro.ipynb);
- [Kaggle](https://www.kaggle.com/);
- [Microsoft Azure Notebooks](https://notebooks.azure.com/), bazat pe un cont la serviciile Microsoft și care poate interacționa cu Visual Studio Code;
- [CoCalc](https://cocalc.com/), bazat pe un cont specific și foarte limitat în varianta gratis.

Alternativ, puteți crea un [Gist](https://gist.github.com/) sau un repository pe GitHub, pe care să le
înaintați sub formă de link către [nbviewer](https://nbviewer.jupyter.org/).


## Exerciții
Pentru acest curs, de interes sînt exercițiile de [aici](https://github.com/adimanea/fsa-softmat/blob/main/python/exercitii.md#s%C4%83pt%C4%83m%C3%AEna-3-jupyter).

Alte exemple aveți [aici](https://github.com/adimanea/fsa-softmat/tree/main/python/exemple-diverse/proiecte-acs-jupyter) și [aici](https://github.com/adimanea/fsa-softmat/blob/main/python/1-intro/exemple/exemplu-jupyter.ipynb).
Le puteți descărca dînd click pe butonul **Raw**, copiați textul și le salvați cu extensia `.ipynb`. (Alternativ, folosiți `wget` în terminal.)
