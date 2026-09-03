Opgave 1.1.i
Vi tilføjede de tre cases "min", "max" og "==" på linje 91-93 i filen Intro2.fs. 

Opgave 1.1.ii
Vi lavede 5 example expressions, som kan findes på linje 37-45 in Intro2.fs filen.

Opgave 1.1.iii
For at gøre funktionen mere skalerbar evaluerer vi først de to udtryk og laver derefter pattern match på operatoren. Det kan ses på linje 84-93 in Intro2.fs filen.

Opgave 1.1.iv
Denne tilføjelse ses på linje 28 i Intro2.fs filen.

Opgave 1.1.v
Vi tilføjede endnu en case i vores pattern matching i eval så den understøtter if-then-else. Det ses på linej 95-97 i Intro2.fs filen.

Opgave 1.2.i
Vi lavede en ny type, aexpr. Ses på linje 31-36 i Intro2.fs filen.

Opgave 1.2.ii
Vi har skrevet repræsentationerne af de expressions som opgaven giver på linje 39-45 i Intro2.fs filen.

Opgave 1.2.iii
Denne format funktion er at finde på linje 116-122 i Intro2.fs filen:).

Opgave 1.2.iv
Simplify funktionen ses på linje 132-149 i Intro2.fs filen.

Opgave 1.4
kode besvarelserne til opgave 1.4 findes i mappen "opgave1.4" (Der er mange filer -- vi lavede opgaven i bluejay, men bare kig på .java filerne).

Opgave 1.4.i
Vi har lavet en abstrakt superklasse, Aexpr. Den har subklasserne CstI, Var, Binop (abstrakt). Binop har subklasserne Sub, Mul, Add. Alle ikke abstrakte klasser har en toString() implementation.

Opgave 1.4.ii
Vi har lavet en test klasse, kaldet Demo.java, hvor vi skriver expressions i abstrakt syntakt og printer det. 

Opgave 1.4.iii
Vi har erklæret den abstrakte metode eval i Aexpr og Binop og implementerer dem i de enkelte underklasser af Aexpr. Vi bruger et hashmap som environment

Opgave 1.4.iv
Vi har erklæret den abstrakte metode simplify i Aexpr og Binop og implementerer dem i de enkelte underklasser af Aexpr. Metoden fjerner overflødige led, fx +0

Opgave 2.1
Vi har ændret Let i expr til nu at bestå af en liste af bindings og en expr, i stedet for to expr
Vi har opdateret Let casen i eval til nu at iterere rekursivt over en liste af bindings. Se linje 57-70 i Intcomp1.fs

Opgave 2.2
Vi rettede ligeledes freevars-funktionen til at iterere over en liste i stedet for kun at evaluere ét udtryk. Se linje 232-238 i Intcomp1.fs

Opgave 2.3
Vi tilpassede 'Let' så den nu kunne modtage en liste af bindings og mappe hver enkelt af dem til den tilsvarende TLet. Se linje 279-286 i Intcomp1.fs


