public class Gerente extends Funcionario {

    private String departamento;

    // Construtor
    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario); // chama o construtor da classe pai
        this.departamento = departamento;
    }

    // Sobrescrevendo método
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Departamento: " + departamento);
    }
}
