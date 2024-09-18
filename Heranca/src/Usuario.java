public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String dataCriacao;

    public Usuario(int id, String nome, String email, String senha, String dataCriacao) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataCriacao = dataCriacao;
    }

    public void login(String senha) {
        if (this.senha.equals(senha)) {
            System.out.println(nome + " logado com sucesso.");
        } else {
            System.out.println("Senha incorreta.");
        }
    }

    public void logout() {
        System.out.println(nome + " deslogado com sucesso.");
    }

    public void atualizarDados(String nome, String email) {
        this.nome = nome;
        this.email = email;
        System.out.println("Dados atualizados: Nome = " + nome + ", Email = " + email);
    }

    // Getters e Setters
    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getSenha() { return senha; }
    public String getDataCriacao() { return dataCriacao; }

    public void setId(int id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setSenha(String senha) { this.senha = senha; }
    public void setDataCriacao(String dataCriacao) { this.dataCriacao = dataCriacao; }
}
