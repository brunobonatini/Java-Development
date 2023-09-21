package pesquisa.livros;

public class Main {

    public static void main(String[] args) {

        // Criando uma instancia do catalogo de livros
        CatalogoLivro catalogoLivro = new CatalogoLivro();

        // Adicionando livros ao catalogo
        catalogoLivro.adicionarLivro("Java - Como Programar", "D Heitel", 2019);
        catalogoLivro.adicionarLivro("Java - Guia do Programador", "Peter Junior", 2021);
        catalogoLivro.adicionarLivro("Código Limpo", "Robert Martin", 2009);
        catalogoLivro.adicionarLivro("O codificador limpo", "Robert Martin", 2012);

        // Exibindo livros pelo mesmo Autor
        System.out.println(catalogoLivro.pesquisaPorAutor("Robert Martin"));

        // Exibindo livros pelo mesmo Autor (caso não haja autor específicado)
        System.out.println(catalogoLivro.pesquisaPorAutor("Autor inexistente."));

        // Exibindo libros dentro de um intervalo de anos
        System.out.println(catalogoLivro.pesquisaPorAnos(2009, 2020));

        // Exibindo livros por nome do livro
        System.out.println(catalogoLivro.pesquisaPorNome("Java - Guia do Programador"));

        // Exibindo livros por nome do livro (caso não haja um nome especificado)
        System.out.println(catalogoLivro.pesquisaPorNome("Nome inexistente."));
    }
}
