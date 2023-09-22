package entities;

import entities.constants.Genero;

// Classe Livro será herança da Classe Produto
public class Livro extends Produto {

    // Nome do livro
    private String nomeLivro;

    // Tipo do livro por gênero
    private Genero genero;

    // Métodos getters and setters
    public String getNomeLivro() {
        return nomeLivro;
    }
    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    // Sobrescrevendo o método para calcular o frete por gênero do produto
    @Override
    public double calcularFrete() {
        return (getPreco() * getQuantidade()) * (1 + genero.getFator());
    }

    // Sobrescrevendo a Classe Livro para retornar uma String
    @Override
    public String toString() {
        return "Livro{" +
                " nome='" + nomeLivro + '\'' +
                ", genero=" + genero + '\'' +
                ", codigo='" + getCodProduto() + '\'' +
                ", preço='" + getPreco() + '\'' +
                '}';
    }
}

