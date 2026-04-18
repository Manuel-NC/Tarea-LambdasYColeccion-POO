import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

public class MetodosCadenas {

    public static void filtroPorPrimeraLetraYLongitud(ArrayList<String> palabras, String letra, int longitud) {

        palabras.removeIf(cadena -> cadena.toLowerCase().startsWith(letra) || cadena.length() < longitud); // Se elimina si empieza con la letra o es mas corta que longitud

    }

    public static ArrayList<String> conversorMayusculas(ArrayList<String> palabras){

        ArrayList<String> palabrasMayusculas =  (ArrayList<String>) palabras.stream() // Se convierte palabras a stream()
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

    public static void imprimirCatalogoConDescuento(HashMap<String, Double> inventario){
        System.out.println("Catalogo con 10% de descuento:");

        inventario.forEach((cadena, v) ->{ // Se recorre llave (producto) y valor (precio)
            double precioConDescuento = v * 0.90; // Se calcula el precio con el 10% menos
                    System.out.println("Producto: " + cadena + " | Precio con descuento: $" + precioConDescuento); // Se imprime el resultado
                }
                );
    }

    public static HashMap<String, Integer> contadorFrecuencias(ArrayList<String> palabras){
        HashMap<String, Integer> mapaFrecuencias = new HashMap<>();

        for (String p : palabras){ // Es un forEach que recorre el ArrayList
            mapaFrecuencias.merge(p,1,(valorViejo,valorNuevo) -> valorViejo + valorNuevo); // Se inserta 1 o se suma al valor si la palabra ya existe
        }

        return mapaFrecuencias;
    }

    public static ArrayList<String> clasificadorPalabras(HashMap<String, Integer> mapa, int minFrecuencia){

        ArrayList<String> listaClasificada = mapa.entrySet().stream() // Se convierte el mapa a stream() con llave + valor
                .filter(entrada -> entrada.getValue() >= minFrecuencia) // Se filtra por el valor dado
                .map(entrada -> entrada.getKey()) // Se obtiene la llave (la palabra)
                .collect(Collectors.toCollection(ArrayList::new)); //Se guarda en ArrayList

        return listaClasificada;
    }
}
