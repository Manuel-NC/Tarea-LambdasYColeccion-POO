public static void main(String[] args) {

    ArrayList<Integer> numeros = new ArrayList<>();
    for (int i = 0 ; i < 5 ; i++) {
        numeros.add(i);
    }

    Collections.addAll(numeros,1,1,2,3,4,5,5,6,4,3,2,8,7,7,9,10);

    ArrayList<String> palabras = new ArrayList<>();
    Collections.addAll(palabras,"Jose","Luis","Manuel","Jorge","Javier","Luisa","Pepe");


    System.out.println("1. El Multiplicador:");
    System.out.println("Numeros antes de ser cambiados: " + numeros);
    ArrayList<Integer> numerosMultiplicador = MetodosNumeros.multiplicador(numeros,5);
    System.out.println("Numeros despues de ser multiplicados: " + numerosMultiplicador);

    System.out.println("\n");

    System.out.println("2. El Filtro Selectivo:");
    System.out.println("Palabras antes de ser modificadas: " + palabras);
    ArrayList<String> palabrasFiltro = MetodosCadenas.filtroSelectivo(palabras,"j", 5);
    System.out.println("Palabras despues de ser filtradas: " + palabrasFiltro);

    System.out.println("\n");

    System.out.println("3. Conversor de Mayusculas:");
    System.out.println("Palabras antes de ser modificadas: " + palabras);
    ArrayList<String> palabrasMayusculas = MetodosCadenas.conversorMayusculas(palabras);
    System.out.println("Palabras despues de volverse mayusculas: " + palabrasMayusculas);

    System.out.println("\n");

    System.out.println("4. Cuadrados Unicos:");
    System.out.println("Numeros antes de ser cambiados: " + numeros);
    HashSet<Integer> numerosCuadradosUnicos = MetodosNumeros.cuadradosUnicos(numeros);
    System.out.println("Numeros despues de volverse cuadrados unicos: " + numerosCuadradosUnicos);

    System.out.println("\n");

    System.out.println("5. Mapa de Longitudes:");
    System.out.println("Palabras antes de ser modificadas: " + palabras);
    HashMap<String, Integer> palabrasLongitud = MetodosCadenas.mapaLongitudes(palabras);
    System.out.println("Palabras despues de volverse HashMap con la palabra y su longitud: " + palabrasLongitud);

    System.out.println("\n");


    }
