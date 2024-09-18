public class Postagem {
    private int id;
    private int idUsuario;
    private String conteudo;
    private String dataPostagem;

    public Postagem(int id, int idUsuario, String conteudo, String dataPostagem) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.conteudo = conteudo;
        this.dataPostagem = dataPostagem;
    }

    public void editarConteudo(String novoConteudo) {
        this.conteudo = novoConteudo;
        System.out.println("Conteúdo da postagem atualizado para: " + novoConteudo);
    }

    public void removerPostagem() {
        System.out.println("Postagem com ID " + id + " removida.");
    }

    // Getters e Setters
    public int getId() { return id; }
    public int getIdUsuario() { return idUsuario; }
    public String getConteudo() { return conteudo; }
    public String getDataPostagem() { return dataPostagem; }

    public void setId(int id) { this.id = id; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }
    public void setConteudo(String conteudo) { this.conteudo = conteudo; }
    public void setDataPostagem(String dataPostagem) { this.dataPostagem = dataPostagem; }
}
