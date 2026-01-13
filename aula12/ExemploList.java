import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Amanda");
        nomes.add("Thomas");
        nomes.add("Ana");
        nomes.add("Amanda"); // aceita repetido

        System.out.println("=== List / ArrayList ===");

        // for tradicional
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        // for-each
        System.out.println("\nFor-each:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
