package ordenar.pessoa;

public class Main {

    public static void main (String[] args) {

        // Criando uma instancia da classe OrdenarPessoa
        OrdenarPessoa ordenarPessoa = new OrdenarPessoa();

        // Adicionando pessoas para lista
        ordenarPessoa.adicionarPessoa("Bruno", 36, 1.70);
        ordenarPessoa.adicionarPessoa("Leticia", 33, 1.80);
        ordenarPessoa.adicionarPessoa("Laura", 10, 1.75);
        ordenarPessoa.adicionarPessoa("Ozzy", 5,0.50);

        // Exibindo a lista de pessoas
        System.out.println(ordenarPessoa.pessoaList);

        // Ordenando e exibindo por idade
        System.out.println(ordenarPessoa.ordenarPorIdade());

        // Ordenando e exibindo por altura
        System.out.println(ordenarPessoa.ordenarPorAltura());
    }
}
