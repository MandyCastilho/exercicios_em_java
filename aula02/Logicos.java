public class Logicos {
    public static void main(String[] args) {

        /* OPERADORES LÓGICOS 

        (||) == Ou
        (&&) == E

        Exemplo:
        Promoção Amazon
        *Nas compras >= 300 ou idade >= 50
        *Não paga frete
        
        */

       double compra = 100;
       int idade = 50;
       boolean teste = compra >= 300 || idade >= 50;
       // AQUI SÓ PRECISA UMA SER VERDADEIRA
       System.out.println(teste);


       /*Exemplo:
        Promoção Amazon
        *Nas compras >= 300 e idade >= 50
        *Não paga frete

        */

       double com = 300;
       int ida = 30;
       boolean tes = com >= 300 && ida >= 50;
       // AQUI AS DUAS PRECISAM SER IGUAIS
       System.out.println(tes);
    }
}