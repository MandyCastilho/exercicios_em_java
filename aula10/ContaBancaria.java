public class ContaBancaria {

    private String titular;
    private String numeroConta;
    private double saldo;
    private Historico historico;

    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        this.historico = new Historico();
        historico.adicionarOperacao("Conta criada para " + titular);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            historico.adicionarOperacao("Depósito de R$ " + valor);
            System.out.println(" Depósito realizado com sucesso!");
        } else {
            System.out.println(" Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            historico.adicionarOperacao("Saque de R$ " + valor);
            System.out.println(" Saque realizado com sucesso!");
        } else {
            System.out.println(" Saldo insuficiente ou valor inválido.");
        }
    }

    public void mostrarDados() {
        System.out.println("\n Dados da Conta:");
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
    }

    public void mostrarHistorico() {
        historico.mostrarHistorico();
    }
}
