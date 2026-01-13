import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroClientes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== Cadastro de Clientes ===");
            System.out.println("[1] Cadastrar cliente");
            System.out.println("[2] Listar clientes");
            System.out.println("[3] Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    clientes.add(new Cliente(nome, email));
                    System.out.println("Cliente cadastrado com sucesso! ✅");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Clientes ---");
                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        for (Cliente c : clientes) {
                            c.mostrarCliente();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Encerrando sistema... 👋");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        sc.close();
    }
}
