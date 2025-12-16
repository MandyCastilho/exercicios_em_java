public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Amanda", 2500.00);
        Gerente g1 = new Gerente("Amanda", 4500.00, "Tecnologia");

        System.out.println("=== Funcionário ===");
        f1.mostrarDados();

        System.out.println("\n=== Gerente ===");
        g1.mostrarDados();
    }
}
