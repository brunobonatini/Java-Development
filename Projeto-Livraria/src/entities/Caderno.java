package entities;

import entities.constants.Materia;

// Classe caderno será herança da Classe Produto
public class Caderno extends Produto {

    // Tipo do caderdo por matérias
    private Materia tipo;

    // Métodos getters and setters
    public Materia getTipo() {
        return tipo;
    }
    public void setTipo(Materia tipo) {
        this.tipo = tipo;
    }

    // Sobrescrevendo o método para calcular o frete por tipo do produto
    @Override
    public double calcularFrete() {
        return (getPreco() * getQuantidade()) + tipo.getFator();
    }

    // Sobrescrevendo a Classe Caderno para retornar uma String
    @Override
    public String toString() {
        return "Caderno{" +
                " tipo=" + tipo + '\'' +
                ", codigo='" + getCodProduto() + '\'' +
                ", preço='" + getPreco() + '\'' +
                '}';
    }
}
