// Classe "pai"
public class Pessoa {

    String nome;
    int idade;

    // Método comum a todas as pessoas
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}

/*  Nesta aula aprendi sobre herança em Java, utilizando a palavra-chave "extends",
a herança permite que uma classe filha reaproveite atributos e métodos da classe
pai, tornando o código mais organizado, reutilizável e fácil de manter.
*/