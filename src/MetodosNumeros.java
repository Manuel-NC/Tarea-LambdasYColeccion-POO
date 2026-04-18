import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

public class MetodosNumeros {

    public static ArrayList<Integer> multiplicador(ArrayList<Integer> numeros, int factor) {
        ArrayList<Integer> numerosMultiplicados = new ArrayList<>(numeros);

        numerosMultiplicados.replaceAll(n -> n * factor);

        return numerosMultiplicados;
    }

    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> numeros){

        HashSet<Integer> numerosUnicos = (HashSet<Integer>) numeros.stream()
                .filter(n -> n%2 == 0)
                .map(n -> n*n)
                .collect(Collectors.toSet());

        return numerosUnicos;
    }
}
