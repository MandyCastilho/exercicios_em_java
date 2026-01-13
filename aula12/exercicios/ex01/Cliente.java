public class Cliente {

    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void mostrarCliente() {
        System.out.println("Nome: " + nome + " | Email: " + email);
    }
}
