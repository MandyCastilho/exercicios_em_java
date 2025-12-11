public class ExplicacaoGeral {

    //  ESCOPOS DE VARIÁVEIS
    
    // Escopo de classe (campo de instância) → cada objeto tem a sua cópia 
    private String nome;

    // Escopo de classe (campo estático) → existe uma cópia para a classe inteira
    private static int totalObjetos = 0;

    
    //  CONSTRUTOR (também é um método)
    public ExplicacaoGeral(String nome) {
        this.nome = nome;     // "this" acessa o campo da instância
        totalObjetos++;       // altera o campo estático da classe
    }

    
    //  MÉTODO COM PARÂMETROS E RETORNO
    public int somar(int a, int b) {
        int resultado = a + b;   // escopo local (só existe dentro do método)
        return resultado;        // retorno do método
    }

    
    //  MÉTODO QUE MODIFICA OBJETO (parâmetro por valor da referência)
    public void alterarMensagem(StringBuilder texto) {
        // Aqui modificamos o OBJETO, não a referência
        texto.append(" — mensagem alterada!");
    }

    
    //  MÉTODO ESTÁTICO (não precisa de objeto para ser chamado)
    public static int getTotalObjetos() {
        return totalObjetos;
    }


    //  MÉTODO SEM RETORNO (void)
    public void mostrarNome() {
        System.out.println("Nome armazenado: " + this.nome);
    }

    
    //  MAIN PARA TESTAR TUDO
    public static void main(String[] args) {

        // Criando objetos da classe (aciona o construtor)
        ExplicacaoGeral obj = new ExplicacaoGeral("Amanda");
        ExplicacaoGeral obj2 = new ExplicacaoGeral("Java Lover");

        // Chamando método com retorno
        int soma = obj.somar(10, 20);
        System.out.println("Resultado da soma: " + soma);

        // Testando escopo local
        // System.out.println(resultado); → Daria erro! "resultado" só existe dentro do método somar()

        // Testando método que altera objetos
        StringBuilder frase = new StringBuilder("Texto original");
        obj.alterarMensagem(frase);
        System.out.println(frase); // objeto realmente foi alterado

        // Testando método sem retorno
        obj.mostrarNome();

        // Chamando método estático
        System.out.println("Total de objetos criados: " + ExplicacaoGeral.getTotalObjetos());
    }
}
