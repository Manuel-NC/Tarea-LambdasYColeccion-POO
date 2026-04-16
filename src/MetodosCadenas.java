import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class MetodosCadenas {
    static ArrayList<String> palabras = new ArrayList<>();

    public static void metodoFiltroSelectivo(String letra, int longitud) {
        Collections.addAll(palabras,"Jose","Luis","Manuel","Jorge","Javier","Luisa","Pepe");

        System.out.println("Palabras antes de ser modificadas: " + palabras);
        palabras.removeIf(n -> n.toLowerCase().startsWith(letra) || n.length() < longitud);
        System.out.println("Palabras despues de ser modificadas: " + palabras);
    }

    public static void metodoConversorMayusculas(){
        Collections.addAll(palabras,"Jose","Luis","Manuel","Jorge","Javier","Luisa","Pepe");

        System.out.println("Palabras antes de ser modificadas: " + palabras);

        ArrayList<String> palabrasMayusculas =  (ArrayList<String>) palabras.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toCollection(ArrayList<String>::new));

        System.out.println("Palabras despues de ser modificadas: " + palabrasMayusculas);
    }
}
