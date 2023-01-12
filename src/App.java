import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        String[] frutas = new String[]{"Morango", "Banana", "Uva", "Maçã", "Maracujá"};
        List<String> outrasFrutas = new ArrayList<>();
        outrasFrutas.add("Morango");
        outrasFrutas.add("Pera");
        outrasFrutas.add("Maracujá");
        outrasFrutas.add("Tamara");
        outrasFrutas.add("Laranja");
        List<String> duplicadas = new ArrayList<>();
        for (int i = 0; i < frutas.length; i++){
            String elementoAtual = frutas[i];
            if (outrasFrutas.contains(elementoAtual)) {
                duplicadas.add(elementoAtual);
            }
        }

        System.out.println(duplicadas);
    }
}
