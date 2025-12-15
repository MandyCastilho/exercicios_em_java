import java.util.Scanner;

public class TesteProduto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Cadastro de Produto ===");

        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Preço do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Estoque inicial: ");
        int estoque = sc.nextInt();

        Produto produto = new Produto(nome, preco, estoque);

        produto.mostrarProduto();

        System.out.print("\nAdicionar unidades ao estoque: ");
        int add = sc.nextInt();
        produto.adicionarEstoque(add);

        produto.mostrarProduto();

        System.out.print("\nRemover unidades do estoque: ");
        int rem = sc.nextInt();
        produto.removerEstoque(rem);

        produto.mostrarProduto();

        sc.close();
    }
}
