// Classe "filha" que herda de Pessoa
public class Aluno extends Pessoa {

    String curso;

    // Método específico do aluno
    public void estudar() {
        System.out.println(nome + " está estudando o curso de " + curso);
    }
}
