package pesquisa.livros;

public class Livro {
    // Atributos
    private String nome;
    private String autor;
    private int anoPublicacao;

    // Construtor
    public Livro (String nome, String autor, int anoPublicacao) {
        this.nome = nome;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Métodos getters and setters
    public String getNome() {
        return nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}