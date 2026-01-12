import java.util.Scanner;

public class SistemaNotasArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas notas deseja informar? ");
        int quantidade = sc.nextInt();

        double[] notas = new double[quantidade];
        double soma = 0;

        System.out.println("\n=== Cadastro de Notas ===");

        // Preenchendo o array
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.printf("\nMédia final: %.2f\n", media);

        // Resultado final
        if (media >= 7) {
            System.out.println("Status: Aprovado(a)");
        } else if (media >= 5) {
            System.out.println("Status: Recuperação");
        } else {
            System.out.println("Status: Reprovado(a)");
        }

        sc.close();
        System.out.println("\nSistema finalizado");
    }
}
