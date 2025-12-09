import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora Simples ===");
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("\nEscolha a operação:");
        System.out.println("[1] Soma");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        System.out.print("Opção: ");

        int opcao = sc.nextInt();

        double resultado;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("\nResultado da soma: " + resultado);
                break;

            case 2:
                resultado = num1 - num2;
                System.out.println("\nResultado da subtração: " + resultado);
                break;

            case 3:
                resultado = num1 * num2;
                System.out.println("\nResultado da multiplicação: " + resultado);
                break;

            case 4:
                if (num2 == 0) {
                    System.out.println("\n❌ Erro: divisão por zero");
                } else {
                    resultado = num1 / num2;
                    System.out.println("\nResultado da divisão: " + resultado);
                }
                break;

            default:
                System.out.println("\n❌ Opção inválida!");
        }

        sc.close();
        System.out.println("\nObrigada por usar a calculadora ");
    }
}
