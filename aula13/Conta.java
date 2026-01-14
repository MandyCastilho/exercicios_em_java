public class Conta {

    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // throws → avisa que o método pode lançar exceção
    public void sacar(double valor) throws SaldoInsuficienteException {

        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para saque.");
        }

        if (valor > saldo) {
            // throw → lança a exceção personalizada
            throw new SaldoInsuficienteException("Saldo insuficiente. Saldo atual: R$ " + saldo);
        }

        saldo -= valor;
        System.out.println("Saque realizado com sucesso!");
    }

    public double getSaldo() {
        return saldo;
    }
}
