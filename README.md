# Tarea de Lambdas y Clases de Colección POO (Tarea-LambdasYColeccion-POO)

## Descripcion del Proyecto
Esta tarea consiste en la creacion de 10 metodos estaticos, los cuales se encuentran divididos en 2 clases (`MetodosNumeros` y `MetodosCadenas`) que demuestran el correcto uso de **Expresiones Lambda**, **Streams**, y metodos de Java (como `merge`, `replaceAll` y `removeIf`). El objetivo es procesar colecciones de datos de forma eficiente y limpia.

## Lista de Metodos

### Operaciones con Numeros (MetodosNumeros)
1. **multiplicadorPorFactor**: Multiplica cada elemento de un `ArrayList` por un factor entero usando `replaceAll` (Modificacion in-place).
2. **elementosParesCuadradosUnicos**: Filtra pares, eleva al cuadrado y elimina duplicados usando `Stream` y `HashSet`.
3. **imprimirCatalogoConDescuento**: Recorre un `HashMap` de productos y precios para imprimir el costo con un 10% de descuento sin modificar el mapa original.

### Procesamiento de Textos (MetodosCadenas)
4. **filtroPorPrimeraLetraYLongitud**: Elimina cadenas de un `ArrayList` basandose en su inicial o una longitud minima usando `removeIf`.
5. **conversorMayusculas**: Transforma una lista de palabras a mayusculas manejando valores nulos mediante `filter` y `map`.
6. **mapaLongitudes**: Crea un `HashMap` donde las llaves son palabras y los valores su longitud, gestionando colisiones de llaves.
7. **contadorFrecuencias**: Genera un mapa de frecuencias contando repeticiones de palabras en una lista usando `merge`.
8. **eliminadorPalabrasMenoresAN**: Filtra un mapa de frecuencias para extraer solo las palabras que superan un umbral determinado.
9. **obtenerPalabrasUnicasFiltradas**: Limpia una frase de signos de puntuacion, filtra por longitud y elimina duplicados.
10. **limitarFrecuencias**: Establece un tope maximo para los valores de un mapa de frecuencias usando `replaceAll` (Modificacion in-place).

## Compilacion
1. Descarga una copia de los archivos a tu equipo local:
   ```
   git clone https://github.com/Manuel-NC/Tarea-LambdasYColeccion-POO.git
   ```

2. Use el siguiente comando para dirigirse a la carpeta src (contiene todos los archivos .java):
   ```
   cd Tarea-LambdasYColeccion-POO/src
   ```
   o por separado:
   ```
   cd Tarea-LambdasYColeccion-POO
   cd src
   ```
   
3. Genera los archivos ejecutables .class a partir del codigo fuente:
   ```
   javac *.java
   ```
   
## Ejecucion
4. Corre la clase principal para mostrar los resultados de los 10 metodos:
   ```
   java Main
   ```

Nota: Se requiere tener instalado el JDK 8 o superior. Tambien puedes abrir la carpeta directamente en un IDE (como IntelliJ) y ejecutar el archivo Main.java.

## Ejemplo de salida
Al ejecutar el programa, se visualizara un ejemplo de cada metodo:
```
1. EL MULTIPLICADOR:
1. multiplicadorPorFactor (in-place):
Antes: [1, 2, -3, 0, 5]
Despues (Factor 10): [10, 20, -30, 0, 50]
---
2. EL FILTRO SELECTIVO :
2. filtroPorPrimeraLetraYLongitud (in-place):
Antes: [Amigo, Avion, Sol, Luna, A, Cielo]
Despues (Sin inicial 'a' y min 4 letras): [Luna, Cielo]
---
3. CONVERSOR DE MAYUSCULAS
3. conversorMayusculas (Retorna nueva lista):
Original: [java, null, pYtHon, ]
Nueva lista (Manejando nulos): [JAVA, PYTHON, ]
---
4. CUADRADOS UNICOS
4. elementosParesCuadradosUnicos (HashSet):
Entrada (con negativos y duplicados): [2, -2, 3, 4, 2, 6, 8, 8]
Resultado (Pares al cuadrado unicos): [16, 64, 4, 36]
---
5. MAPA DE LONGITUDES
5. mapaLongitudes (HashMap):
Lista con duplicados: [Ana, Pedro, Ana, Marta]
Resultado Mapa (Clave unica): {Marta=5, Ana=3, Pedro=5}
---
6. MODIFICADOR DE INVENTARIO
6. imprimirCatalogoConDescuento (Solo impresion):
Mapa original antes de imprimir:
{Laptop=1000.5, Mouse=50.3, Computadora=5422.33, Refrigerador=753.67}
Catalogo con 10% de descuento:
Producto: Laptop | Precio con descuento: $900.45
Producto: Mouse | Precio con descuento: $45.269999999999996
Producto: Computadora | Precio con descuento: $4880.097
Producto: Refrigerador | Precio con descuento: $678.303
---
7. CONTADOR DE FRECUENCIAS
7. contadorFrecuencias (merge):
Lista: [sol, luna, sol, estrella, sol, luna]
Resultado Frecuencias: {sol=3, estrella=1, luna=2}
---
8. CLASIFICADOR DE PALABRAS
8. eliminadorPalabrasMenoresAN (Filtra por n):
Mapa: {Java=10, C=2, Python=15}
Palabras con frecuencia >= 5: [Java, Python]
---
9. DEDUPLICACION DE PALABRAS
9. obtenerPalabrasUnicasFiltradas (Deduplicacion):
Frase: Hola, hola; el mundo es verde, el mundo es grande.
Unicas (>= 3 letras y sin signos): [mundo, verde, hola, grande]
---
10. EL TOPE DE FRECUENCIAS
10. limitarFrecuencias (in-place):
Antes: {A=100, B=5, C=50}
Despues (Tope de 20): {A=20, B=5, C=20}
---
CASO EXTREMO: LISTA VACIA
Lista (para confirmar que esta vacia: []
CASO EXTREMO: (mapaLongitudes): {}
---
```
