import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sistema de Notas ===");

        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.printf("\nMédia final: %.2f\n", media);

        if (media >= 7) {
            System.out.println("Status: Aprovado(a)! Arrasou!");
        } else if (media >= 5) {
            System.out.println("Status: Recuperação! Bora estudar um pouquinho mais.");
        } else {
            System.out.println("Status: Reprovado(a)! Não desanima, o próximo semestre é seu!");
        }

        sc.close();
        System.out.println("\nProcesso finalizado com sucesso ");
    }
}
