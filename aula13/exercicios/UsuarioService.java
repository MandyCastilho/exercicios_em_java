public class UsuarioService {

    public void validarUsuario(String usuario, String senha) throws UsuarioInvalidoException {

        if (usuario == null || usuario.isBlank()) {
            throw new UsuarioInvalidoException("Usuário não pode ser vazio.");
        }

        if (senha == null || senha.length() < 6) {
            throw new UsuarioInvalidoException("Senha deve ter no mínimo 6 caracteres.");
        }

        if (!usuario.equals("admin") || !senha.equals("123456")) {
            throw new UsuarioInvalidoException("Usuário ou senha incorretos.");
        }

        System.out.println("Login realizado com sucesso!");
    }
}
