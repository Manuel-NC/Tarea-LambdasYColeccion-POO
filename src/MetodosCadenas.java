import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class MetodosCadenas {

    public static ArrayList<String> metodoFiltroSelectivo(ArrayList<String> palabras, String letra, int longitud) {
        ArrayList<String> palabrasFiltradas = new ArrayList<>(palabras);

        palabrasFiltradas.removeIf(cadena -> cadena.toLowerCase().startsWith(letra) || cadena.length() < longitud);

        return palabrasFiltradas;
    }

    public static ArrayList<String> metodoConversorMayusculas(ArrayList<String> palabras){

        ArrayList<String> palabrasMayusculas =  (ArrayList<String>) palabras.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toCollection(ArrayList<String>::new));

        return palabrasMayusculas;
    }
}
