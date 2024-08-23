public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private String senha;
    private final int id;

    public Cliente(String nome, String cpf, String endereco, String telefone, String email, String senha, int id){
        this.nome = StringUtils.capitalizeFirstLetter(nome);
        this.cpf = cpf;
        this.endereco = StringUtils.capitalizeFirstLetter(endereco);
        this.telefone = telefone;
        this.email = email.toLowerCase();
        this.senha = senha;
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }
}
