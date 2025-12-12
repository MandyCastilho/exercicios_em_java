public class Cachorro {

    // Atributos
    String nome;
    int idade;
    String raca;

    // Métodos
    void latir() {
        System.out.println(nome + " está latindo: Au au!");
    }

    void apresentar() {
        System.out.println("Olá! Eu sou " + nome + ", tenho " + idade + " anos e sou da raça " + raca + ".");
    }

    public static void main(String[] args) {
        
        // Instanciando objeto
        Cachorro dog = new Cachorro();

        // Definindo valores
        dog.nome = "Thor";
        dog.idade = 3;
        dog.raca = "Labrador";

        // Chamando métodos
        dog.apresentar();
        dog.latir();
    }
}
