import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

public class MetodosNumeros {

    public static void multiplicador(ArrayList<Integer> numeros, int factor) {

        numeros.replaceAll(n -> n * factor); // Se reemplaza cada numero multiplicandolo por el factor

    }

    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> numeros){

        HashSet<Integer> numerosUnicos = (HashSet<Integer>) numeros.stream()
                .filter(n -> n%2 == 0) // Se filtran solo los numeros pares
                .map(n -> n*n) // Se eleva cada numero al cuadrado
                .collect(Collectors.toSet()); // Se guarda en un Set para evitar duplicados

        return numerosUnicos;
    }
}
