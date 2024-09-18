public class Influenciador extends Usuario {
    private int numeroSeguidores;

    public Influenciador(int id, String nome, String email, String senha, String dataCriacao, int numeroSeguidores) {
        super(id, nome, email, senha, dataCriacao);
        this.numeroSeguidores = numeroSeguidores;
    }

    public void promoverPostagem(int idPostagem) {
        System.out.println("Postagem com ID " + idPostagem + " promovida por influenciador.");
    }

    // Getters e Setters
    public int getNumeroSeguidores() { return numeroSeguidores; }
    public void setNumeroSeguidores(int numeroSeguidores) { this.numeroSeguidores = numeroSeguidores; }
}
