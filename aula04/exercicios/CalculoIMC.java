import java.util.Scanner;

public class CalculoIMC {

    // Função que calcula o IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Cálculo de IMC ===");

        System.out.print("Digite seu peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = sc.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.printf("\nSeu IMC é: %.2f\n", imc);

        // Classificação básica
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }

        sc.close();
        System.out.println("\nCálculo finalizado com sucesso");
    }
}
