package application;

import bookstore.ClienteLivraria;
import bookstore.PedidoLivraria;
import bookstore.ProdutoLivraria;
import database.BancoDados;
import entities.*;
import utilities.LeitorDados;

import java.util.Optional;

// Classe principal que controla a execução da aplicação
public class Main {

    private static Cliente clienteLogin = null;

    private static BancoDados bancoDados = new BancoDados();

    private static ClienteLivraria clienteLivraria = new ClienteLivraria(bancoDados);
    private static PedidoLivraria pedidoLivraria = new PedidoLivraria(bancoDados);
    private static ProdutoLivraria produtoLivraria = new ProdutoLivraria(bancoDados);

    // Método principal para iniciar a aplicação
    public static void main(String[] args) {

        System.out.println("Seja bem vindo à Livraria Online!");

        String opcao = "";

        while (true) {

            if (clienteLogin == null) {

                System.out.println("Digite o CPF: ");

                String cpf = "";
                cpf = LeitorDados.lerDados();

                identificarUsuario(cpf);
            }

            System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Excluir Livro");
            System.out.println("3 - Cadastrar Caderno");
            System.out.println("4 - Excluir Caderno");
            System.out.println("5 - Fazer Pedido");
            System.out.println("6 - Excluir Pedido");
            System.out.println("7 - Listar Produtos");
            System.out.println("8 - Listar Pedidos");
            System.out.println("9 - Logoff");
            System.out.println("0 - Sair");

            opcao = LeitorDados.lerDados();

            switch (opcao) {
                case "1":
                    Livro livro = LeitorDados.lerLivro();
                    produtoLivraria.salvar(livro);
                    break;
                case "2":
                    System.out.println("Digite o código do livro: ");
                    String codigoLivro = LeitorDados.lerDados();
                    produtoLivraria.excluir(codigoLivro);
                    break;
                case "3":
                    Caderno caderno = LeitorDados.lerCaderno();
                    produtoLivraria.salvar(caderno);
                    break;
                case "4":
                    System.out.println("Digite o código do caderno: ");
                    String codigoCaderno = LeitorDados.lerDados();
                    produtoLivraria.excluir(codigoCaderno);
                    break;
                case "5":
                    Pedido pedido = LeitorDados.lerPedido(bancoDados);
                    Optional<Cupom> cupom = LeitorDados.lerCupom(bancoDados);

                    if (cupom.isPresent()) {
                        pedidoLivraria.salvar(pedido, cupom.get());
                    } else {
                        pedidoLivraria.salvar(pedido);
                    }
                    break;
                case "6":
                    System.out.println("Digite o código do pedido: ");
                    String codigoPedido = LeitorDados.lerDados();
                    pedidoLivraria.pedidoExcluir(codigoPedido);
                    break;
                case "7":
                    produtoLivraria.listarProdutos();
                    break;
                case "8":
                    pedidoLivraria.listarPedidos();
                    break;
                case "9":
                    System.out.printf("Volte sempre %s!", clienteLogin.getNome());
                    clienteLogin = null;
                    break;
                case "0":
                    System.out.println("Aplicação encerrada.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    // Procurar o CPF do usuário na base de dados para logar na aplicação
    private static void identificarUsuario(String cpf) {

        Optional<Cliente> resultado = clienteLivraria.consultar(cpf);

        if (resultado.isPresent()) {

            Cliente cliente = resultado.get();
            System.out.printf("Olá %s! Você está logado.", cliente.getNome());
            clienteLogin = cliente;
        } else {
            System.out.println("Usuário não cadastrado.");
            System.exit(0);
        }
    }
}
