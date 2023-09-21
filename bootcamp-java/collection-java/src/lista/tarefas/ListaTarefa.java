package lista.tarefas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // Atributo
    private List<Tarefa> tarefaList;

// Construtor

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // Criando os métodos
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasRemover = new ArrayList<>();
        if (!tarefaList.isEmpty()) {
            for (Tarefa t : tarefaList) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasRemover.add(t);
                }
            }
            tarefaList.removeAll(tarefasRemover);
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public int obterTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefas() {
        if (!tarefaList.isEmpty()) {
            System.out.println(tarefaList);
        } else {
            System.out.println("A lista está vazia.");
        }
    }
}