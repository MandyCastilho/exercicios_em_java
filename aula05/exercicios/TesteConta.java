import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sistema Bancário Simples ===");
        System.out.print("Nome do titular: ");
        String nome = sc.nextLine();

        ContaBancaria conta = new ContaBancaria(nome, 0);

        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("[1] Depositar");
            System.out.println("[2] Sacar");
            System.out.println("[3] Mostrar saldo");
            System.out.println("[4] Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para depósito: ");
                    double dep = sc.nextDouble();
                    conta.depositar(dep);
                    break;

                case 2:
                    System.out.print("Valor para saque: ");
                    double saq = sc.nextDouble();
                    conta.sacar(saq);
                    break;

                case 3:
                    conta.mostrarSaldo();
                    break;

                case 4:
                    System.out.println("Saindo... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        sc.close();
    }
}
