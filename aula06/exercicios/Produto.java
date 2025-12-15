public class Produto {

    // Atributos
    private String nome;
    private double preco;
    private int estoque;

    // Construtor
    public Produto(String nome, double preco, int estoqueInicial) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoqueInicial;
    }

    // Método para adicionar ao estoque
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            estoque += quantidade;
            System.out.println("Estoque atualizado com sucesso!");
        } else {
            System.out.println("Quantidade inválida!");
        }
    }

    // Método para remover do estoque
    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println("Estoque reduzido com sucesso!");
        } else {
            System.out.println("Quantidade inválida ou estoque insuficiente!");
        }
    }

    // Método para mostrar dados do produto
    public void mostrarProduto() {
        System.out.println("\nProduto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + estoque + " unidades");
    }
}
