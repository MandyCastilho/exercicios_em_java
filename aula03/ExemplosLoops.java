public class ExemplosLoops {
    public static void main(String[] args) {

        /* LAÇOS DE REPETIÇÃO — RESUMO

        FOR:
        Usado quando sabemos exatamente quantas vezes queremos repetir algo.
        Tem três partes: início, condição e incremento.

        WHILE:
        Repete enquanto a condição for verdadeira.
        Ideal quando não sabemos quantas repetições serão necessárias.

        DO...WHILE:
        Parecido com o while, mas garante que o bloco será executado pelo menos uma vez,
        porque a condição é verificada só depois da execução.

        */

        // FOR — conta de 1 a 5
        System.out.println("=== Exemplo FOR ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("For: " + i);
        }

        // WHILE — conta de 1 a 5
        System.out.println("\n=== Exemplo WHILE ===");
        int x = 1;
        while (x <= 5) {
            System.out.println("While: " + x);
            x++;
        }

        // DO...WHILE — conta de 1 a 5
        System.out.println("\n=== Exemplo DO...WHILE ===");
        int y = 1;
        do {
            System.out.println("DoWhile: " + y);
            y++;
        } while (y <= 5);
    }
}
