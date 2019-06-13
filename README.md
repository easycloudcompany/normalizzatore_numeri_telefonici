# Normalizzatore numeri telefonici
### Normalizzatore numeri telefonici per l'Italia +39

Se avete una lista di numeri telefonici da normalizzare, questo e' il programmino che fa per voi.

Nulla di speciale, prende in ingresso un file txt con l'elenco dei numeri e genera in output i numeri normalizzati con il prefisso internazionale +39.

```
INPUT file.txt
329702xxxx
339/399xxxx
339/295xxxx
349531-xxxx
347795xxxx

347010xxxx28987
347010xxxx
349250xxxx
349250xxxx
335740xxxx854711
328533xxxx
328533xxxx

OUTPUT
Enter the file name with extension : /home/andrea/Desktop/asdf.txt
NUMERI ERRATI: 3
ERROR - Empty row 
ERROR 347010xxxx28987
ERROR 335740xxxx854711


NUMERI DUPLICATI: 2
+39349250xxxx
+39328533xxxx


NUMERI OK: 8
+39329702xxxx
+39339399xxxx
+39339295xxxx
+39349531xxxx
+39347795xxxx
+39347010xxxx
+39349250xxxx
+39328533xxxx


--------------------------
NUMERI ERRATI: 3
NUMERI DUPLICATI: 2
NUMERI OK: 8
--------------------------
```