package entities;

// Classe abstrata dos produtos que serão vendidos na livraria
public abstract class Produto {

    // Código do produto
    private String codProduto;

    // Valor unitário do produto
    private double preco;

    // Quantidade de compra do produto
    private int quantidade;

    // Construtor da Classe Produto
    public Produto() {
    }

    // Métodos getters and setters
    public String getCodProduto() {
        return codProduto;
    }
    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /* Método para colcular o valor do frete para os produtos comprados.
    O cálculo pode variar de acordo com o produto. */
    public abstract double calcularFrete();
}
