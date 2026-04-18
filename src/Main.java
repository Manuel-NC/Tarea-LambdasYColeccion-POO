public static void main(String[] args) {
    // 1. MULTIPLICADOR POR FACTOR
    System.out.println("1. EL MULTIPLICADOR:");
    System.out.println("1. multiplicadorPorFactor (in-place):");
    ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 2, -3, 0, 5));
    System.out.println("Antes: " + nums1);
    MetodosNumeros.multiplicadorPorFactor(nums1, 10);
    System.out.println("Despues (Factor 10): " + nums1);
    System.out.println("---");

    // 2. FILTRO POR PRIMERA LETRA Y LONGITUD
    System.out.println("2. EL FILTRO SELECTIVO :");
    System.out.println("2. filtroPorPrimeraLetraYLongitud (in-place):");
    ArrayList<String> palabras2 = new ArrayList<>(Arrays.asList("Amigo", "Avion", "Sol", "Luna", "A", "Cielo"));
    System.out.println("Antes: " + palabras2);
    MetodosCadenas.filtroPorPrimeraLetraYLongitud(palabras2, "a", 4);
    System.out.println("Despues (Sin inicial 'a' y min 4 letras): " + palabras2);
    System.out.println("---");

    // 3. CONVERSOR MAYUSCULAS
    System.out.println("3. CONVERSOR DE MAYUSCULAS");
    System.out.println("3. conversorMayusculas (Retorna nueva lista):");
    // Caso extremo: incluye un nulo y una cadena vacia
    ArrayList<String> palabras3 = new ArrayList<>(Arrays.asList("java", null, "pYtHon", ""));
    System.out.println("Original: " + palabras3);
    ArrayList<String> resultado3 = MetodosCadenas.conversorMayusculas(palabras3);
    System.out.println("Nueva lista (Manejando nulos): " + resultado3);
    System.out.println("---");

    // 4. ELEMENTOS PARES CUADRADOS UNICOS
    System.out.println("4. CUADRADOS UNICOS");
    System.out.println("4. elementosParesCuadradosUnicos (HashSet):");
    ArrayList<Integer> nums4 = new ArrayList<>(Arrays.asList(2, -2, 3, 4, 2, 6, 8, 8));
    System.out.println("Entrada (con negativos y duplicados): " + nums4);
    HashSet<Integer> resultado4 = MetodosNumeros.elementosParesCuadradosUnicos(nums4);
    System.out.println("Resultado (Pares al cuadrado unicos): " + resultado4);
    System.out.println("---");

    // 5. MAPA LONGITUDES
    System.out.println("5. MAPA DE LONGITUDES");
    System.out.println("5. mapaLongitudes (HashMap):");
    ArrayList<String> nombres5 = new ArrayList<>(Arrays.asList("Ana", "Pedro", "Ana", "Marta"));
    System.out.println("Lista con duplicados: " + nombres5);
    HashMap<String, Integer> mapa5 = MetodosCadenas.mapaLongitudes(nombres5);
    System.out.println("Resultado Mapa (Clave unica): " + mapa5);
    System.out.println("---");

    // 6. IMPRIMIR CATALOGO CON DESCUENTO
    System.out.println("6. MODIFICADOR DE INVENTARIO");
    System.out.println("6. imprimirCatalogoConDescuento (Solo impresion):");
    HashMap<String, Double> inventario6 = new HashMap<>();
    inventario6.put("Laptop", 1000.5);
    inventario6.put("Mouse", 50.3);
    inventario6.put("Computadora", 5422.33);
    inventario6.put("Refrigerador", 753.67);
    System.out.println("Mapa original antes de imprimir:");
    System.out.println(inventario6);
    MetodosNumeros.imprimirCatalogoConDescuento(inventario6);
    System.out.println("---");

    // 7. CONTADOR FRECUENCIAS
    System.out.println("7. CONTADOR DE FRECUENCIAS");
    System.out.println("7. contadorFrecuencias (merge):");
    ArrayList<String> lista7 = new ArrayList<>(Arrays.asList("sol", "luna", "sol", "estrella", "sol", "luna"));
    System.out.println("Lista: " + lista7);
    HashMap<String, Integer> frec7 = MetodosCadenas.contadorFrecuencias(lista7);
    System.out.println("Resultado Frecuencias: " + frec7);
    System.out.println("---");

    // 8. ELIMINADOR PALABRAS MENORES A N
    System.out.println("8. CLASIFICADOR DE PALABRAS");
    System.out.println("8. eliminadorPalabrasMenoresAN (Filtra por n):");
    HashMap<String, Integer> datos8 = new HashMap<>();
    datos8.put("Java", 10);
    datos8.put("C", 2);
    datos8.put("Python", 15);
    System.out.println("Mapa: " + datos8);
    ArrayList<String> filtradas8 = MetodosCadenas.eliminadorPalabrasMenoresAN(datos8, 5);
    System.out.println("Palabras con frecuencia >= 5: " + filtradas8);
    System.out.println("---");

    // 9. OBTENER PALABRAS UNICAS FILTRADAS
    System.out.println("9. DEDUPLICACION DE PALABRAS");
    System.out.println("9. obtenerPalabrasUnicasFiltradas (Deduplicacion):");
    String frase9 = "Hola, hola; el mundo es verde, el mundo es grande.";
    System.out.println("Frase: " + frase9);
    HashSet<String> set9 = MetodosCadenas.obtenerPalabrasUnicasFiltradas(frase9, 3);
    System.out.println("Unicas (>= 3 letras y sin signos): " + set9);
    System.out.println("---");

    // 10. LIMITAR FRECUENCIAS
    System.out.println("10. EL TOPE DE FRECUENCIAS");
    System.out.println("10. limitarFrecuencias (in-place):");
    HashMap<String, Integer> mapa10 = new HashMap<>();
    mapa10.put("A", 100); mapa10.put("B", 5); mapa10.put("C", 50);
    System.out.println("Antes: " + mapa10);
    MetodosCadenas.limitarFrecuencias(mapa10, 20);
    System.out.println("Despues (Tope de 20): " + mapa10);
    System.out.println("---");

    // Caso Extremo: Lista vacia
    System.out.println("CASO EXTREMO: LISTA VACIA");
    ArrayList<String> vacia = new ArrayList<>();
    System.out.println("Lista (para confirmar que esta vacia: " + vacia);
    System.out.println("CASO EXTREMO: (mapaLongitudes): " + MetodosCadenas.mapaLongitudes(vacia));
    System.out.println("---");

    }
