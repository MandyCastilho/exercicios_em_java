import java.util.Scanner;

public class ValidadorSenha {

    // Função que valida a senha
    public static boolean validarSenha(String senha) {
        return senha.length() >= 6;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Validador de Senha ===");
        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        if (validarSenha(senha)) {
            System.out.println("\nSenha válida! ");
        } else {
            System.out.println("\nSenha inválida! ");
            System.out.println("A senha deve conter pelo menos 6 caracteres.");
        }

        sc.close();
        System.out.println("\nProcesso finalizado");
    }
}
