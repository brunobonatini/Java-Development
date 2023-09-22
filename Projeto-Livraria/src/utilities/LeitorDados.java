package utilities;

import bookstore.ProdutoLivraria;
import database.BancoDados;
import entities.*;
import entities.constants.Genero;
import entities.constants.Materia;

import java.util.Optional;
import java.util.Scanner;

// Classe utilitária que auxilia na leitura das entradas de dados via teclado
public final class LeitorDados {

    // Classe do Java para receber entradas via teclado
    private static Scanner input;

    static{
        input = new Scanner(System.in);
    }

    // Leitura de dados
    public static String lerDados() {
        String dado = input.nextLine();
        return dado;
    }

    // Ler dados para cadastro do livro
    public static Livro lerLivro() {

        System.out.println("Cadastrando livro...");
        Livro livro = new Livro();

        System.out.println("Digite o nome do livro: ");
        String nomeLivro = lerDados();
        livro.setNomeLivro(nomeLivro);

        System.out.println("Digite o gênero: Drama, Suspense, Romance");
        String genero = lerDados();
        livro.setGenero(Genero.valueOf(genero.toUpperCase()));

        System.out.println("Digite o preço (0.00): ");
        String preco = lerDados();
        livro.setPreco(Double.parseDouble(preco));

        return livro;
    }

    // Ler dados para cadastro do caderno
    public static Caderno lerCaderno() {

        System.out.println("Cadastrando caderno...");
        Caderno caderno = new Caderno();

        System.out.println("Digite o tipo do caderno (M2, M5, M10): ");
        String materias = lerDados();
        caderno.setTipo(Materia.valueOf(materias.toUpperCase()));

        System.out.println("Digite o preço (0.00): ");
        String preco = lerDados();
        caderno.setPreco(Double.parseDouble(preco));

        return caderno;
    }

    // Ler os dados do pedido e retorna um objeto. Retornar um pedido a partir dos dados de entrada
    public static Pedido lerPedido(BancoDados bancoDados) {

        ProdutoLivraria produtoLivraria = new ProdutoLivraria(bancoDados);

        System.out.println("Cadastrando pedido...");
        Pedido pedido = new Pedido();

        String opcao = "s";
        do{
            System.out.println("Digite o código do produto (Livro / Caderno): ");
            String codigo = lerDados();

            Optional<Produto> resultado = produtoLivraria.consultar(codigo);

            if (resultado.isPresent()) {

                Produto produto = resultado.get();

                System.out.println("Digite a quantidade: ");
                String quantidade = lerDados();
                produto.setQuantidade(Integer.parseInt(quantidade));
                pedido.getProdutos().add(produto);
            } else {
                System.out.println("Produto inexistente. Escolha um produto válido.");
            }

            System.out.println("Deseja selecionar mais um produto? s/n: ");
            opcao = lerDados();
        } while ("s".equals(opcao));

        return pedido;
    }

    // Ler os dados do cupom e retornar um objeto. Retornar o cupom a partir dos dados de entrada
    public static Optional<Cupom> lerCupom(BancoDados bancoDados) {

        System.out.println("Quer utilizar algum cupom? Escolha: CUPOM2, CUPOM5, CUPOM10. Caso não utilize, deixe em branco.");

        String desconto = lerDados();

        for (Cupom cupom: bancoDados.getCupons()) {
            if (cupom.getCodCupom().equalsIgnoreCase(desconto)) {
                return Optional.of(cupom);
            }
        }

        return Optional.empty();
    }
}
