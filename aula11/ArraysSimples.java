import java.util.Scanner;

public class ArraysSimples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("=== Array Simples ===");

        // Preenchendo o array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        // Exibindo o array
        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }

        sc.close();
    }
}
