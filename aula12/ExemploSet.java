import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {

        Set<String> nomes = new HashSet<>();

        nomes.add("Amanda");
        nomes.add("Thomas");
        nomes.add("Ana");
        nomes.add("Amanda"); // não repete

        System.out.println("=== Set ===");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
