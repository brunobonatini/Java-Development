package bookstore;

import database.BancoDados;
import entities.Produto;

import java.util.Optional;

// Classe para manipulação da Classe Produto
public class ProdutoLivraria {

    private BancoDados bancoDados;

    // Construtor do banco de Dados para armazenar e acessar os produtos
    public ProdutoLivraria(BancoDados bancoDados) {
        this.bancoDados = bancoDados;
    }

    // Salvar um novo produto na livraria. Este novo produto pode ser vendido
    public void salvar(Produto novoProduto) {

        String codigo = "PR%04d";
        codigo = String.format(codigo, bancoDados.getProdutos().length);
        novoProduto.setCodProduto(codigo);

        boolean produtoRepetido = false;
        for (Produto produto : bancoDados.getProdutos()) {
            if (produto.getCodProduto() == novoProduto.getCodProduto()) {
                produtoRepetido = true;
                System.out.println("Produto já cadastrado!");
                break;
            }
        }

        if (!produtoRepetido) {
            this.bancoDados.adicionarProduto(novoProduto);
            System.out.println("Produto cadastrado com sucesso!");
        }
    }

    // Excluir um produto pelo código cadastrado
    public void excluir(String codigo) {

        int produtoExcluir = -1;
        for (int i = 0; i < bancoDados.getProdutos().length; i++) {
            Produto produto = bancoDados.getProdutos()[i];

            if (produto.getCodProduto().equals(codigo)) {
                produtoExcluir = i;
                break;
            }
        }

        if (produtoExcluir != -1) {

            bancoDados.removerProduto(produtoExcluir);
            System.out.println("Produto excluído com sucesso!");
        } else {
            System.out.println("Produto inexistente.");
        }
    }

    // Consultar um produto a partir do seu código
    // Optional indicando a existência ou não do produto
    public Optional<Produto> consultar(String codigo) {

        for (Produto produto : bancoDados.getProdutos()) {
            if (produto.getCodProduto().equalsIgnoreCase(codigo)) {
                return Optional.of(produto);
            }
        }

        return Optional.empty();
    }

    // Listar todos os produtos cadastrados
    public void listarProdutos() {

        if (bancoDados.getProdutos().length == 0) {
            System.out.println("Não existem produtos cadastrados.");
        } else {
            for (Produto produto : bancoDados.getProdutos()) {
                System.out.println(produto.toString());
            }
        }
    }
}
