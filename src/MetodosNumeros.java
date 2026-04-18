import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class MetodosNumeros {

    public static void multiplicadorPorFactor(ArrayList<Integer> numeros, int factor) {

        numeros.replaceAll(n -> n * factor); // Se reemplaza cada numero multiplicandolo por el factor

    }

    public static HashSet<Integer> elementosParesCuadradosUnicos(ArrayList<Integer> numeros){

        HashSet<Integer> numerosUnicos = (HashSet<Integer>) numeros.stream()
                .filter(n -> n%2 == 0) // Se filtran solo los numeros pares
                .map(n -> n*n) // Se eleva cada numero al cuadrado
                .collect(Collectors.toSet()); // Se guarda en un Set para evitar duplicados

        return numerosUnicos;
    }

    public static void imprimirCatalogoConDescuento(HashMap<String, Double> inventario){
        System.out.println("Catalogo con 10% de descuento:");

        inventario.forEach((cadena, v) ->{ // Se recorre llave (producto) y valor (precio)
                    double precioConDescuento = v * 0.90; // Se calcula el precio con el 10% menos
                    System.out.println("Producto: " + cadena + " | Precio con descuento: $" + precioConDescuento); // Se imprime el resultado
                }
        );
    }

}
