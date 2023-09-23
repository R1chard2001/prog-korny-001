# Java gyakorlás 01

## 1. feladat

Készítsünk programot, amely a billentyűzetről kéri be a felhasználó nevét, majd üdvözli! 

## 2. feladat

Készítsünk programot, amely a felhasználónevet parancssori argumentumként kapja, majd üdvözli a felhasználót!

### Segítség

Hogy működjön rendesen a parancssorból való argumentumok beolvasása, azt a következőképpen oldhatjuk meg:
Új *artifact* létrehozása: **File > Project structure > Artifacts**, itt a **+** jelre kattintva létrehozhatunk egy újat.

Létrehozáskor a következőre kell menni: **JAR > From modules with dependencies...**. Ebben a modulban ki kell választanunk a modulunkat (ha több is van),
ezen kívül még a fő osztályunkat is ki kell választani, melyet a program futtatásakor szeretnénk elindítani.

Hogy létrehozzuk az *artofact*-ünket, ahhoz a **build > build artifacts** menüpontra kattintva kiválaszthatjuk, melyiket szerenténk létrehozni.

A build-elés után létrejön egy új mappa a projektünkben (*out*), ebben fog szerepelni majd a .jar fájlunk.
A fájlra jobb klikkel kattintva, majd **open in > terminal** menüpontra kattintva megjelenik előttünk a parancssor.
Itt a *java -jar ./<fájlnév> [argumentumok]* parancs segítségével futtatni is tudjuk.

## 3. feladat

Készítsünk egy olyan programok, mely kiírja 1-től 4-ig a számok felét.

## 4. feladat

Készítsünk programot, amely bekér két egész számot, és kiírja a köztük lévő egész számok felét. 

## 5. feladat

Készítsünk egy programot, amely kiszámolja két egész szám összegét, különbségét, szorzatát, hányadosát, és az osztási maradékot is megadja!
Figyeljen a nullával való osztásra (ez esetben ne végezze el az osztást)! A két számot parancssori paraméterként kell megadni.
Vizsgáljuk meg azt is, hogy megfelelő számú parancssori paramétert adtunk–e át!

## 6. feladat

Írjuk meg az *n* faktoriálisát kiszámoló programot. Az *n* értékét parancssorból kérjük be a felhasználótól.