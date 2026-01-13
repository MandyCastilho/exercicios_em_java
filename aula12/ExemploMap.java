import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {

        Map<Integer, String> alunos = new HashMap<>();

        alunos.put(1, "Amanda");
        alunos.put(2, "Thomas");
        alunos.put(3, "Ana");

        System.out.println("=== Map ===");

        // Iterando com for-each
        for (Map.Entry<Integer, String> entry : alunos.entrySet()) {
            System.out.println("Matrícula: " + entry.getKey() +
                               " | Nome: " + entry.getValue());
        }
    }
}
