public class Funcionario {

    // Atributos
    protected String nome;
    protected double salario;

    // Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método para mostrar dados
    public void mostrarDados() {
        System.out.println("\nNome: " + nome);
        System.out.println("Salário: R$ " + salario);
    }
}
