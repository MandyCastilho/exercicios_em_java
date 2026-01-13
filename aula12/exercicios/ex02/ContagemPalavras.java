import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemPalavras {
    public static void main(String[] args) {
        // Scanner para ler a entrada do usuário
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a frase que deseja analisar:");
        String texto = leitor.nextLine(); // Lê a linha inteira digitada

        // Tratamento básico: converter para minúsculas e dividir por espaços
        String[] palavras = texto.toLowerCase().split("\\s+");
        
        Map<String, Integer> mapaContagem = new HashMap<>();

        for (String p : palavras) {
            // Remove pontuações simples (opcional, mas ajuda na contagem)
            p = p.replaceAll("[.,!?]", "");
            
            if (!p.isEmpty()) {
                mapaContagem.put(p, mapaContagem.getOrDefault(p, 0) + 1);
            }
        }

        System.out.println("\n--- Resultado da Contagem ---");
        mapaContagem.forEach((palavra, contagem) -> {
            System.out.println(palavra + ": " + contagem);
        });

        leitor.close(); // Fecha o scanner
    }
}

