package pesquisa.livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    // Atributo
    private List<Livro> livroList;

    // Construtor
    public CatalogoLivro() {
        this.livroList = new ArrayList<>();
    }

    // Métodos
    public void adicionarLivro(String nome, String autor, int anoPublicacao) {
        livroList.add(new Livro(nome, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
            return livrosPorAutor;
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public List<Livro> pesquisaPorAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorAnos.add(l);
                }
            }
            return livrosPorAnos;
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public Livro pesquisaPorNome(String nome) {
        Livro livroPorNome = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getNome().equalsIgnoreCase(nome)) {
                    livroPorNome = l;
                    break;
                }
            }
            return livroPorNome;
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }
}