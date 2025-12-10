public class ExemploSwitch {
    public static void main(String[] args) {

        /* SWITCH — RESUMO

         O switch é uma estrutura de controle usada quando precisamos comparar
         uma mesma variável com vários valores diferentes.

         - Cada possível valor é um "case".
         - Quando o valor da variável combina com um case, o código daquele case é executado.
         - O "break" impede que o código continue executando os próximos cases.
         - O "default" funciona como o "else": é executado quando nenhum case corresponde.

         Uso ideal: quando temos muitas opções para a mesma variável e não queremos vários if/else.

         */

        int dia = 5;

        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            default:
                System.out.println("Fim de semana!");
        }
    }
}
