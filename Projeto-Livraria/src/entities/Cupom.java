package entities;

// Classe Cupom. Pode ser utilizado no fechamento do pedido caso tenha um cupom de desconto
public class Cupom {

    // Código do cupom
    private String codCupom;

    // Valor do desconto
    private int desconto;

    // Construtor do cupom recebe o código e a porcentagem de desconto
    public Cupom(String codCupom, int desconto) {
        this.codCupom = codCupom;
        this.desconto = desconto;
    }

    // Métodos getters and setters
    public String getCodCupom() {
        return codCupom;
    }
    public void setCodCupom(String codCupom) {
        this.codCupom = codCupom;
    }
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }
}
