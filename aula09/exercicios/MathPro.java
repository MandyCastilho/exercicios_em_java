public class MathPro {

    // Soma dois números
    public static double somar(double a, double b) {
        return a + b;
    }

    // Subtrai dois números
    public static double subtrair(double a, double b) {
        return a - b;
    }

    // Multiplica dois números
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Divide dois números
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return a / b;
    }

    // Calcula potência
    public static double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    // Verifica se número é par
    public static boolean ehPar(int num) {
        return num % 2 == 0;
    }
}
