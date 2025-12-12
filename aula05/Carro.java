public class Carro {

    //ATRIBUTOS:
    String modelo;
    String marca;
    int ano;
    int vel;

    //MÉTODOS:
    void acelerar(int aceleracao) {
        vel += aceleracao;
    }

    void freiar(int reduzir) {
        vel -= reduzir;
    }

    void buzinar() {
        System.out.println("bibibi");
    }

    public static void main(String[] agrs) {

        Carro c1 = new Carro();

        c1.modelo = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2015;
        c1.vel = 60;

        c1.acelerar(10);
        System.out.println("Velocidade: " + c1.vel + " km/h");

        c1.freiar(30);
        System.out.println("Velocidade: " + c1.vel + " km/h");
    }
}