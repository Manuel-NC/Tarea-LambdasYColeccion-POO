import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

public class MetodosNumeros {

    public static void metodoMultiplicador(int factor) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0 ; i < 5 ; i++) {
            numeros.add(i);
        }

        System.out.println("Numeros antes de ser cambiados: " + numeros);
        numeros.replaceAll(n -> n * factor);
        System.out.println("Numeros despues de ser cambiados: " + numeros);
    }

    public static void metodoCuadradosUnicos(){
        ArrayList<Integer> numeros = new ArrayList<>();

        Collections.addAll(numeros,1,1,2,3,4,5,5,6,4,3,2,8,7,7,9,10);

        System.out.println("Numeros antes de ser cambiados: " + numeros);

        HashSet<Integer> numerosUnicos = (HashSet<Integer>) numeros.stream()
                .filter(n -> n%2 == 0)
                .map(n -> n*n)
                .collect(Collectors.toSet());

        System.out.println("Numeros despues de ser cambiados: " + numerosUnicos);
    }
}
