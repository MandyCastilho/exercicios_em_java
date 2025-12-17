public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        Funcionario g = new Gerente();

        System.out.println(f.calcularSalario()); // 2000
        System.out.println(g.calcularSalario()); // 4000
    }
}
