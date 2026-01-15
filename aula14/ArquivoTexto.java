import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArquivoTexto {

    public static void main(String[] args) {

        String nomeArquivo = "dados.txt";
        Scanner sc = new Scanner(System.in);

        // ESCREVER NO ARQUIVO
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {

            System.out.print("Digite um texto para salvar no arquivo: ");
            String texto = sc.nextLine();

            writer.write(texto);
            writer.newLine();
            writer.write("Arquivo criado com sucesso!");

            System.out.println("\nTexto salvo no arquivo.");

        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo.");
        }

        // LER O ARQUIVO
        System.out.println("\nConteúdo do arquivo:");

        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {

            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo.");
        }

        sc.close();
    }
}
