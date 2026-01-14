import java.util.Scanner;

public class TesteConta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta(500);

        try {
            System.out.print("Digite o valor para saque: ");
            double valor = sc.nextDouble();

            conta.sacar(valor);

        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Erro inesperado.");

        } finally {
            System.out.println("Saldo final: R$ " + conta.getSaldo());
            sc.close();
        }
    }
}
