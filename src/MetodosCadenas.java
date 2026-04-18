import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

public class MetodosCadenas {

    public static ArrayList<String> filtroSelectivo(ArrayList<String> palabras, String letra, int longitud) {
        ArrayList<String> palabrasFiltradas = new ArrayList<>(palabras);

        palabrasFiltradas.removeIf(cadena -> cadena.toLowerCase().startsWith(letra) || cadena.length() < longitud);

        return palabrasFiltradas;
    }

    public static ArrayList<String> conversorMayusculas(ArrayList<String> palabras){

        ArrayList<String> palabrasMayusculas =  (ArrayList<String>) palabras.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toCollection(ArrayList<String>::new));

        return palabrasMayusculas;
    }

    public static HashMap<String, Integer> mapaLongitudes(ArrayList<String> palabras){

        HashMap<String, Integer> palabrasLongitud = palabras.stream()
                .collect(Collectors.toMap(
                        cadena -> cadena,
                        cadena -> cadena.length(),
                        (existente, nuevo) -> existente,
                        HashMap::new
                ));

        return palabrasLongitud;
    }
}
