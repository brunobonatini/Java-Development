package database;

import entities.Cliente;
import entities.Cupom;
import entities.Pedido;
import entities.Produto;

import java.util.ArrayList;
import java.util.List;

// Classe que simula um banco de dados. Realiza inserções e exclusões da aplicação.
// Não são permitidas atualizações para facilitar o funcionamento da aplicação.
public class BancoDados {

    // Lista para armazenar os produtos (Livros e Cadernos)
    private List<Produto> produtos;

    // Lista para armazenar os pedidos cadastrados
    private List<Pedido> pedidos;

    // Lista que armazena os cupons disponíveis
    private List<Cupom> cupons;

    // Importa cliente cadastrado
    private Cliente cliente;

    // Construtor da classe
    public BancoDados() {
        this.produtos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.cliente = new Cliente();

        this.cupons = new ArrayList<>();
        cupons.add(new Cupom("CUPOM2", 2));
        cupons.add(new Cupom("CUPOM5", 5));
        cupons.add(new Cupom("CUPOM10", 10));
    }

    public Cliente getCliente() {
        return cliente;
    }
    public Cupom[] getCupons() {
        return cupons.toArray(new Cupom[cupons.size()]);
    }
    public Pedido[] getPedidos() {
        return pedidos.toArray(new Pedido[pedidos.size()]);
    }
    public Produto[] getProdutos() {
        return produtos.toArray(new Produto[produtos.size()]);
    }
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    public void removerProduto(int posicao) {
        produtos.remove(posicao);
    }
    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    public void removerPedido(int posicao) {
        pedidos.remove(posicao);
    }
}
