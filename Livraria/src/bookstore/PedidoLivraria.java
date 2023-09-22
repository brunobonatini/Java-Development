package bookstore;

import database.BancoDados;
import entities.Cupom;
import entities.Pedido;
import entities.Produto;

// import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.List;

// Classe para manipular a Classe Pedido
public class PedidoLivraria {

    private BancoDados bancoDados;

    // Construtor Banco de Dados para armazenar e acessar os pedidos
    public PedidoLivraria(BancoDados bancoDados) {
        this.bancoDados = bancoDados;
    }

    private double calcularTotal(List<Produto> produtos, Cupom cupom) {

        double total = 0.0;

        for (Produto produto: produtos) {
            total += produto.calcularFrete();
        }
        if (cupom != null) {
            return total * (1 - cupom.getDesconto());
        } else {
            return total;
        }
    }

    // Salvar um pedido sem cupom de desconto
    public void salvar(Pedido novoPedido) {
        salvar(novoPedido, null);
    }

    // Salvar um pedido com cupom de desconto
    public void salvar(Pedido novoPedido, Cupom cupom) {
        String codigo = "PE%4d%2d%04d%";
        LocalDate hoje = LocalDate.now();
        codigo = String.format(codigo, hoje.getYear(), hoje.getMonthValue(), bancoDados.getPedidos().length);

        novoPedido.setCodPedido(codigo);
        novoPedido.setCliente(bancoDados.getCliente());
        novoPedido.setTotal(calcularTotal(novoPedido.getProdutos(), cupom));
        bancoDados.adicionarPedido(novoPedido);

        System.out.println("Pedido cadastrado com sucesso!");
    }

    // Excluir um pedido a partir do seu código
    public void pedidoExcluir(String codigo) {

        int pedidoExcluir = -1;
        for (int i = 0; i < bancoDados.getPedidos().length; i++) {

            Pedido pedido = bancoDados.getPedidos()[i];

            if (pedido.getCodPedido().equals(codigo)) {
                pedidoExcluir = i;
                break;
            }
        }

        if (pedidoExcluir != -1) {
            bancoDados.removerPedido(pedidoExcluir);
            System.out.println("Pedido excluído com sucesso.");
        } else {
            System.out.println("Pedido inexistente.");
        }
    }

    // Listar todos os pedidos realizados
    public void listarPedidos() {

        if (bancoDados.getPedidos().length == 0) {
            System.out.println("Não existe pedidos cadastrados.");
        } else {
            for (Pedido pedido: bancoDados.getPedidos()) {
                System.out.println(pedido.toString());
            }
        }
    }
}
