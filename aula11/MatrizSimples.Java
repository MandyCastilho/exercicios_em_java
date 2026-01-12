import java.util.Scanner;

public class MatrizSimples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[2][3];

        System.out.println("=== Matriz Simples 2x3 ===");

        // Preenchendo a matriz
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Digite o valor [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }

        // Exibindo a matriz
        System.out.println("\nMatriz digitada:");
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
