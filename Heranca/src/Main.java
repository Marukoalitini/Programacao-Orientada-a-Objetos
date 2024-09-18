public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(1, "Alice", "alice@example.com", "senha123", "2024-09-18");
        usuario.login("senha123");
        usuario.logout();
        usuario.atualizarDados("Alice Oliveira", "alice.oliveira@example.com");

        Postagem postagem = new Postagem(1, usuario.getId(), "Olá mundo!", "2024-09-18");
        postagem.editarConteudo("Olá, mundo atualizado!");
        postagem.removerPostagem();

        Administrador admin = new Administrador(2, "Bob", "bob@example.com", "admin123", "2024-09-18", "superadmin");
        admin.banirUsuario(usuario.getId());
        admin.removerPostagem(postagem.getId());

        Influenciador influenciador = new Influenciador(3, "Carol", "carol@example.com", "influencer123", "2024-09-18", 10000);
        influenciador.promoverPostagem(postagem.getId());
    }
}
