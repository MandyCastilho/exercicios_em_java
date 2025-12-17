public class TesteAnimal {
    public static void main(String[] args) {

        Animal a1 = new Cachorro();
        Animal a2 = new Gato();

        a1.fazerSom(); // O cachorro late
        a2.fazerSom(); // O gato mia
    }
}
