package entities;

import java.util.ArrayList;
import java.util.List;

// Classe pedido de compras de um cliente
public class Pedido {

    // Código do pedido
    private String codPedido;

    // Importando a Classe Cliente
    private Cliente cliente;

    // Lista de produtos
    private List<Produto> produtos;

    // Total do pedido
    private double total;

    // Construtor da Classe Pedido
    public Pedido() {
        this.produtos = new ArrayList<>();
    }

    // Métodos getters and setters
    public String getCodPedido() {
        return codPedido;
    }
    public void setCodPedido(String codPedido) {
        this.codPedido = codPedido;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    private String getProdutosComprados() {

        StringBuilder produtos = new StringBuilder();
        produtos.append("[");

        for (Produto produto: getProdutos()) {
            produtos.append(produto.toString());
            produtos.append("Quantidade:");
            produtos.append(produto.getQuantidade());
            produtos.append(" ");
        }
        produtos.append("]");

        return produtos.toString();
    }

    // Sobrescrevendo a Classe Pedido para retornar uma String
    @Override
    public String toString() {
        return "Pedido{" +
                "codigo='" + codPedido + '\'' +
                ", cliente=" + cliente +
                ", produtos=" + getProdutosComprados() +
                ", total=" + total +
                '}';
    }
}
