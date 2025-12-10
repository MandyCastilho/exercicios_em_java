public class Condicionais {
    public static void main(String[] args) {

       /* CONTROLE DE FLUXO — RESUMO

       Estruturas condicionais permitem que um programa tome decisões.

       IF: Executa um bloco de código quando a condição é verdadeira.
       ELSE IF: Testa novas condições caso as anteriores tenham sido falsas.
       ELSE: Executa um bloco de código quando nenhuma condição anterior é atendida.

       */

      int idade = 34;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else if (idade >= 12) {
            System.out.println("Você é adolescente.");
        } else {
            System.out.println("Você é criança.");
        }

    }
}