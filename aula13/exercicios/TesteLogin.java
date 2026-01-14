import java.util.Scanner;

public class TesteLogin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UsuarioService service = new UsuarioService();

        try {
            System.out.print("Usuário: ");
            String usuario = sc.nextLine();

            System.out.print("Senha: ");
            String senha = sc.nextLine();

            service.validarUsuario(usuario, senha);

        } catch (UsuarioInvalidoException e) {
            System.out.println("Erro de validação: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Erro inesperado.");

        } finally {
            sc.close();
        }
    }
}
