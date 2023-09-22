package bookstore;

import database.BancoDados;
import entities.Cliente;

import java.util.Optional;

// Classe para manipular a Classe Cliente
public class ClienteLivraria {

    private BancoDados bancoDados;

    // Construtor Banco de dados para ter acesso aos clientes cadastrados
    public ClienteLivraria(BancoDados bancoDados) {
        this.bancoDados = bancoDados;
    }

    // Consultar o cliente pelo CPF
    public Optional<Cliente> consultar(String cpf) {
        if (bancoDados.getCliente().getCpf().equals(cpf)) {
            return Optional.of(bancoDados.getCliente());
        } else {
            return Optional.empty();
        }
    }
}
