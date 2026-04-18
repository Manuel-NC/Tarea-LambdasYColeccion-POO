public static void main(String[] args) {

    ArrayList<Integer> numeros = new ArrayList<>();
    for (int i = 0 ; i < 5 ; i++) {
        numeros.add(i);
    }

    ArrayList<Integer> numerosParaCuadrados = new ArrayList<>();
    Collections.addAll(numerosParaCuadrados,1,1,2,3,4,5,5,6,4,3,2,8,7,7,9,10);

    ArrayList<String> palabras = new ArrayList<>();
    Collections.addAll(palabras,"Jose","Luis","Manuel","Jorge","Javier","Luisa","Pepe","Manuel");


    System.out.println("1. El Multiplicador:");
    System.out.println("Numeros antes de ser cambiados: " + numeros);
    MetodosNumeros.multiplicador(numeros,5);
    System.out.println("Numeros despues de ser multiplicados: " + numeros);

    System.out.println("\n");

    System.out.println("2. El Filtro Selectivo:");
    System.out.println("Palabras antes de ser modificadas: " + palabras);
    MetodosCadenas.filtroPorPrimeraLetraYLongitud(palabras,"j", 5);
    System.out.println("Palabras despues de ser filtradas: " + palabras);

    System.out.println("\n");

    System.out.println("3. Conversor de Mayusculas:");
    System.out.println("Palabras antes de ser modificadas: " + palabras);
    ArrayList<String> palabrasMayusculas = MetodosCadenas.conversorMayusculas(palabras);
    System.out.println("Palabras despues de volverse mayusculas: " + palabrasMayusculas);

    System.out.println("\n");

    System.out.println("4. Cuadrados Unicos:");
    System.out.println("Numeros antes de ser cambiados: " + numerosParaCuadrados);
    HashSet<Integer> numerosCuadradosUnicos = MetodosNumeros.cuadradosUnicos(numerosParaCuadrados);
    System.out.println("Numeros despues de volverse cuadrados unicos: " + numerosCuadradosUnicos);

    System.out.println("\n");

    System.out.println("5. Mapa de Longitudes:");
    System.out.println("Palabras antes de ser modificadas: " + palabras);
    HashMap<String, Integer> palabrasLongitud = MetodosCadenas.mapaLongitudes(palabras);
    System.out.println("Palabras despues de volverse HashMap con la palabra y su longitud: " + palabrasLongitud);

    System.out.println("\n");

    System.out.println("6. Modificador de Inventario:");
    HashMap<String, Double> productos = new HashMap<>();
    productos.put("Computadora", 5430.10);
    productos.put("Celular", 2520.45);
    productos.put("Refrigerador", 1869.402);

    System.out.println("Productos sin descuento (antes del metodo):");
    System.out.println(productos);
    System.out.println("\n");
    MetodosCadenas.imprimirCatalogoConDescuento(productos);

    System.out.println("\n");

    System.out.println("7. Contador de Frecuencuas");
    System.out.println("Palabras antes de ser modificadas: " + palabras);
    HashMap<String, Integer> mapaFrecuencias = MetodosCadenas.contadorFrecuencias(palabras);
    System.out.println("Palabras despues de ser contadas: " + mapaFrecuencias);

    System.out.println("\n");

    System.out.println("8. Clasificador de Palabras:");
    HashMap<String, Integer> clasificadorEj1 = new HashMap<>();
    clasificadorEj1.put("Jose",5);
    clasificadorEj1.put("Luis",2);
    clasificadorEj1.put("Daniel",7);
    clasificadorEj1.put("Dana",1);
    clasificadorEj1.put("Pablo",4);
    clasificadorEj1.put("Jorge",3);

    System.out.println("Palabras antes de ser modificadas: " + clasificadorEj1);
    ArrayList<String> palabrasClasificadas = MetodosCadenas.clasificadorPalabras(clasificadorEj1, 4);
    System.out.println("Palabras despues de ser clasificadas: " + palabrasClasificadas);

    System.out.println("\n");

    }
