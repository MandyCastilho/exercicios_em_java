import java.util.Scanner;

public class MenuSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("=== Menu Principal ===");
        System.out.println("[1] Mostrar saudação");
        System.out.println("[2] Calcular dobro de um número");
        System.out.println("[3] Mostrar mensagem motivacional");
        System.out.println("[4] Sair");
        System.out.print("Escolha uma opção: ");

        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("\nOlá, bem-vindo(a)! ");
                break;

            case 2:
                System.out.print("\nDigite um número: ");
                int num = sc.nextInt();
                System.out.println("O dobro de " + num + " é " + (num * 2));
                break;

            case 3:
                System.out.println("\nVocê é capaz de muito mais do que imagina. Vai com tudo!");
                break;

            case 4:
                System.out.println("\nSaindo do sistema… Até a próxima! ");
                break;

            default:
                System.out.println("\n Opção inválida! Tenta outra.");
        }

        sc.close();
        System.out.println("\nProcesso finalizado!");
    }
}
