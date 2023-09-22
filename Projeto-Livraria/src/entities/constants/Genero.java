package entities.constants;

// Classe enum Genero dos livros
public enum Genero {

    DRAMA(15),

    SUSPENSE(10),

    ROMANCE(5);

    private double fator;

    // Construtor para o fator valor que influenciará no cálculo do frete
    Genero(double fator) {
        this.fator = fator / 100;
    }
    public double getFator() {
            return fator;
    }

}
