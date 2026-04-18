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
    ArrayList<Integer> numerosMultiplicador = MetodosNumeros.metodoMultiplicador(numeros,5);
    System.out.println("Numeros despues de ser cambiados: " + numerosMultiplicador);

    System.out.println("\n");

    System.out.println("2. El Filtro Selectivo:");
    System.out.println("Palabras antes de ser modificadas: " + palabras);
    ArrayList<String> palabrasFiltro = MetodosCadenas.metodoFiltroSelectivo(palabras,"j", 5);
    System.out.println("Palabras despues de ser modificadas: " + palabrasFiltro);

    System.out.println("\n");

    System.out.println("3. Conversor de Mayusculas:");
    System.out.println("Palabras antes de ser modificadas: " + palabras);
    ArrayList<String> palabrasMayusculas = MetodosCadenas.metodoConversorMayusculas(palabras);
    System.out.println("Palabras despues de ser modificadas: " + palabrasMayusculas);

    System.out.println("\n");

    System.out.println("4. Cuadrados Unicos:");
    System.out.println("Numeros antes de ser cambiados: " + numeros);
    HashSet<Integer> numerosCuadradosUnicos = MetodosNumeros.metodoCuadradosUnicos(numeros);
    System.out.println("Numeros despues de ser cambiados: " + numerosCuadradosUnicos);

    System.out.println("\n");
    }
