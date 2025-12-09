public class Operadores {
    public static void main(String[] args) {

        /* OPERADORES BÁSICOS 

        (+) == Somar
        (-) == Subtrair
        (*) == Multiplicar
        (/) == Dividir
        (%) == Resto da divisão
        
        */

       int qtdProduto1 = 20;
       int qtdProduto2 = 40;
       int totalSoma = qtdProduto1 + qtdProduto2;
       System.out.println("O total de produtos é de: " + totalSoma);
       //System.out.println("O total de produtos é de: " + (qtdProduto1 + qtdProduto2));

       int n1 = 20;
       int n2 = 40;
       int totalSubtração = n1 - n2;
       System.out.println("Total = " + totalSubtração); 

       int mt1 = 5;
       int mt2 = 7;
       int totalMulti = mt1 * mt2;
       System.out.println("O total da multi é: " + totalMulti);

       int dv1 = 100;
       int dv2 = 25;
       int totalDiv = dv1 / dv2;
       System.out.println("O total da div é: " + totalDiv);

       int res1 = 250;
       int res2 = 37;
       int totalRes = res1 % res2;
       System.out.println("O total de resto é: " + totalRes);

      // PRECEDÊNCIA
       int nu1 = 20;
       int nu2 = 40;
       int totalNu = (nu1 + nu2) * nu1;
       //int totalNu = nu1 + nu2 * nu1;
       System.out.println("O total é: " + totalNu);

    }
}