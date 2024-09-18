public class Administrador extends Usuario {
    private String nivelAcesso;

    public Administrador(int id, String nome, String email, String senha, String dataCriacao, String nivelAcesso) {
        super(id, nome, email, senha, dataCriacao);
        this.nivelAcesso = nivelAcesso;
    }

    public void banirUsuario(int idUsuario) {
        System.out.println("Usuário com ID " + idUsuario + " banido.");
    }

    public void removerPostagem(int idPostagem) {
        System.out.println("Postagem com ID " + idPostagem + " removida por administrador.");
    }

    // Getters e Setters
    public String getNivelAcesso() { return nivelAcesso; }
    public void setNivelAcesso(String nivelAcesso) { this.nivelAcesso = nivelAcesso; }
}
