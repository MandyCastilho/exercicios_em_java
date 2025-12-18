public class TesteMathPro {
    public static void main(String[] args) {

        System.out.println("Soma: " + MathPro.somar(10, 5));
        System.out.println("Subtração: " + MathPro.subtrair(10, 5));
        System.out.println("Multiplicação: " + MathPro.multiplicar(10, 5));
        System.out.println("Divisão: " + MathPro.dividir(10, 5));
        System.out.println("Potência: " + MathPro.potencia(2, 3));

        int numero = 8;
        System.out.println("O número " + numero + " é par? " + MathPro.ehPar(numero));
    }
}
