package lista.tarefas;

public class Main {

    public static void main(String[] args) {
        // Criando uma instancia da classe ListaTarefa
        ListaTarefa listaTarefa = new ListaTarefa();

        // Adicionando tarefas para lista
        //listaTarefa.adicionarTarefa("Comprar leite");
        //listaTarefa.adicionarTarefa("Estudar para prova");
        listaTarefa.adicionarTarefa("Trabalhar");

        // Exibindo o número total de tarefas na lista
        System.out.println("Você tem " + listaTarefa.obterTotalTarefas() + " tarefas na lista.");

        // Exibindo as descrições das tarefas na lista
        listaTarefa.obterDescricaoTarefas();

        // Removendo uma tarefa da lista
        listaTarefa.removerTarefa("Trabalhar");

        // Exibindo o total de tarefas na lista após a remoção
        System.out.println("Agora você tem " + listaTarefa.obterTotalTarefas() + " tarefas na lista.");

        // Exibindo as descrições das tarefas atualizadas na lista
        listaTarefa.obterDescricaoTarefas();

        // Removendo uma tarefa da lista quando a mesma esta vazia
        listaTarefa.removerTarefa("Estudar para prova");

        // Exibindo o total de tarefas da lista após tentar remover de uma lista vazia.
        System.out.println("Agora você tem " + listaTarefa.obterTotalTarefas() + " tarefas na lista.");
    }
}
