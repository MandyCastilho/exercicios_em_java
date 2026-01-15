import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SistemaNotas {

    private static final String ARQUIVO = "notas.txt";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE NOTAS ===");
            System.out.println("1 - Adicionar nota");
            System.out.println("2 - Listar notas");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    adicionarNota(sc);
                    break;
                case 2:
                    listarNotas();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }

    // Adiciona nota no arquivo
    private static void adicionarNota(Scanner sc) {

        System.out.print("Digite a nota: ");
        String nota = sc.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO, true))) {
            writer.write(nota);
            writer.newLine();
            System.out.println("Nota salva com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar a nota.");
        }
    }

    // Lista notas do arquivo
    private static void listarNotas() {

        System.out.println("\n--- NOTAS SALVAS ---");

        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))) {

            String linha;
            int contador = 1;

            while ((linha = reader.readLine()) != null) {
                System.out.println(contador + " - " + linha);
                contador++;
            }

        } catch (IOException e) {
            System.out.println("Nenhuma nota encontrada.");
        }
    }
}
