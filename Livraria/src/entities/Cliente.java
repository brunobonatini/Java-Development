package entities;

public class Cliente {

    // Nome completo do cliente
    private String nome;

    // Número do CPF do cliente
    private String cpf;

    // Construtor recebendo o nome e o cpf
    public Cliente() {
        this.nome = "Bruno";
        this.cpf = "12345678901";
    }

    // Criando os métodos getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Sobrescrevendo a Classe Cliente para retornar uma String
    @Override
    public String toString() {
        return "Cliente{nome = '" + nome + "'}";
    }
}


