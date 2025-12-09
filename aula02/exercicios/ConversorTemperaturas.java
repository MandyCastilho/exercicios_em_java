import java.util.Scanner;

public class ConversorTemperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Conversor de Temperaturas ===");
        System.out.println("Escolha a conversão:");
        System.out.println("[1] Celsius → Fahrenheit");
        System.out.println("[2] Fahrenheit → Celsius");
        System.out.println("[3] Celsius → Kelvin");
        System.out.println("[4] Kelvin → Celsius");
        System.out.print("Opção: ");

        int opcao = sc.nextInt();
        double temp, resultado;

        switch (opcao) {
            case 1:
                System.out.print("\nDigite a temperatura em Celsius: ");
                temp = sc.nextDouble();
                resultado = (temp * 9/5) + 32;
                System.out.println("Resultado: " + resultado + " °F");
                break;

            case 2:
                System.out.print("\nDigite a temperatura em Fahrenheit: ");
                temp = sc.nextDouble();
                resultado = (temp - 32) * 5/9;
                System.out.println("Resultado: " + resultado + " °C");
                break;

            case 3:
                System.out.print("\nDigite a temperatura em Celsius: ");
                temp = sc.nextDouble();
                resultado = temp + 273.15;
                System.out.println("Resultado: " + resultado + " K");
                break;

            case 4:
                System.out.print("\nDigite a temperatura em Kelvin: ");
                temp = sc.nextDouble();
                resultado = temp - 273.15;
                System.out.println("Resultado: " + resultado + " °C");
                break;

            default:
                System.out.println("\n❌ Opção inválida, bebê!");
        }

        sc.close();
        System.out.println("\nConversão finalizada com sucesso ");
    }
}
