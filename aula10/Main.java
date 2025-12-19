public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Amanda", "12345-6");

        conta.mostrarDados();

        conta.depositar(500);
        conta.sacar(200);
        conta.depositar(150);

        conta.mostrarDados();
        conta.mostrarHistorico();
    }
}
