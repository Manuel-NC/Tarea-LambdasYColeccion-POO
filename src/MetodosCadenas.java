import java.util.*;
import java.util.stream.Collectors;

public class MetodosCadenas {

    public static void filtroPorPrimeraLetraYLongitud(ArrayList<String> palabras, String letra, int longitud) {

        palabras.removeIf(cadena -> cadena.toLowerCase().startsWith(letra) || cadena.length() < longitud); // Se elimina si empieza con la letra o es mas corta que longitud

    }

    public static ArrayList<String> conversorMayusculas(ArrayList<String> palabras){

        ArrayList<String> palabrasMayusculas =  (ArrayList<String>) palabras.stream() // Se convierte palabras a stream()
                .filter(Objects::nonNull) // Evita que el metodo se rompa con valores nulos
                .map(n -> n.toUpperCase()) // Se convierte cada palabra a mayusculas
                .collect(Collectors.toCollection(ArrayList<String>::new)); // Se guarda en un nuevo ArrayList

        return palabrasMayusculas;
    }

    public static HashMap<String, Integer> mapaLongitudes(ArrayList<String> palabras){

        HashMap<String, Integer> palabrasLongitud = palabras.stream() // Se convierte palabras a stream()
                .collect(Collectors.toMap(
                        cadena -> cadena, // La palabra se usa como llave
                        cadena -> cadena.length(), // La longitud se usa como valor
                        (existente, nuevo) -> existente, // Si se repite, se queda la existente
                        HashMap::new // Se genera como un HashMap
                ));

        return palabrasLongitud;
    }

    public static HashMap<String, Integer> contadorFrecuencias(ArrayList<String> palabras){
        HashMap<String, Integer> mapaFrecuencias = new HashMap<>();

        for (String p : palabras){ // Es un forEach que recorre el ArrayList
            mapaFrecuencias.merge(p,1,(valorViejo,valorNuevo) -> valorViejo + valorNuevo); // Se inserta 1 o se suma al valor si la palabra ya existe
        }

        return mapaFrecuencias;
    }

    public static ArrayList<String> eliminadorPalabrasMenoresAN(HashMap<String, Integer> mapa, int minFrecuencia){

        ArrayList<String> listaClasificada = mapa.entrySet().stream() // Se convierte el mapa a stream() con llave + valor
                .filter(entrada -> entrada.getValue() >= minFrecuencia) // Se filtra por el valor dado
                .map(entrada -> entrada.getKey()) // Se obtiene la llave (la palabra)
                .collect(Collectors.toCollection(ArrayList::new)); //Se guarda en ArrayList

        return listaClasificada;
    }

    public static HashSet<String> obtenerPalabrasUnicasFiltradas(String frase, int n){

        String[] palabrasSeparadas = frase.split("[\\s,.;:!¡?¿]+"); //Se divide por espacios o signos de puntuacion y se filtran vacios

        HashSet<String> palabrasValidas = (HashSet<String>) Arrays.stream(palabrasSeparadas)
                .filter(cadena -> !cadena.isEmpty()) // Se eliminan posibles cadenas vacias
                .filter(cadena -> cadena.length() >= n) // Se filtran palabras con longitud minima n
                .map(cadena -> cadena.toLowerCase()) // Se convierten todas a minusculas
                .collect(Collectors.toSet()); // Se guardan en un Set para eliminar duplicados

        return palabrasValidas;
    }

    public static void limitarFrecuencias(HashMap<String, Integer> mapa, int n){
        mapa.replaceAll((palabra, frecuencia) -> frecuencia > n ? n : frecuencia); // Se fija el valor en n si la frecuencia es mayor al limite, si no, se conserva el valor
    }

}
