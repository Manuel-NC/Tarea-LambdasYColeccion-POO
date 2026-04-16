import java.util.ArrayList;

public class MetodosNumeros {
    static ArrayList<Integer> numeros = new ArrayList<>();


    public static void metodoMultiplicador(int factor) {
        for (int i = 0 ; i < 5 ; i++) {
            numeros.add(i);
        }

        System.out.println("Numeros antes de ser cambiados: " + numeros);
        numeros.replaceAll(n -> n * factor);
        System.out.println("Numeros despues de ser cambiados: " + numeros);

    }
}
