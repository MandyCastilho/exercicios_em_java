public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.nome = "Amanda";
        aluno.idade = 22;
        aluno.curso = "Análise e Desenvolvimento de Sistemas";

        aluno.apresentar(); // método herdado
        aluno.estudar();    // método próprio


        System.out.println("------------------");


        Professor professor = new Professor();
        professor.nome = "Carlos";
        professor.idade = 40;
        professor.disciplina = "Java";

        professor.apresentar(); // método herdado
        professor.ensinar();    // método próprio
    }
}
