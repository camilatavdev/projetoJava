package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefas> tarefasList;

    public ListaTarefa() {
        this.tarefasList = new ArrayList<>();//arraylist vazio
    }

    public void adicionarTarefa(String descricao){
        tarefasList.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        for(Tarefas t : tarefasList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t); //para cada tarefa t em tarefasList que seja igual a descrição de t
                //coloque em tarefasParaRemover, isso para que remova os duplicados.
            }
        }
        tarefasList.removeAll(tarefasParaRemover);
    //removeAll pq vc pode acabar tendo elementos repetidos na lista
    }

    public int obterNumeroTotalTarefas(){
        return tarefasList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefasList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa(); //instanciando um objeto a partir da classe ListaTarefa
        System.out.println("O número total de elementos da lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        System.out.println("O número total de elementos da lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        System.out.println("O número total de elementos da lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos da lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos da lista é: " + listaTarefa.obterNumeroTotalTarefas());
        //vai ser 0 pq quando tem duplicadas, ele remove todas

        listaTarefa.obterDescricoesTarefas();
    }
}

