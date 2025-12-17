public class TesteCalculadora {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(2, 3));        // 5
        System.out.println(calc.somar(2, 3, 4));     // 9
        System.out.println(calc.somar(2.5, 1.5));    // 4.0
    }
}
