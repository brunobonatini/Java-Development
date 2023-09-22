package entities.constants;

// Classe enum Quantidade de matérias do caderno
public enum Materia {

    M2(2),

    M5(5),

    M10(10);

    private double fator;

    // Construtor para o fator valor que influenciará no cálculo do frete
    Materia(double fator) {
        this.fator = fator / 10;
    }
    public double getFator() {
        return fator;
    }
}
