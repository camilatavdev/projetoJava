package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefas> tarefasList; //tarefasList é uma lista do tipo List<Tarefas>

    public ListaTarefa() {//construtor
        this.tarefasList = new ArrayList<>();//arraylist vazio, para armazenar as tarefas
        //uso do this por ser um construtor
        //a instanciação da lista tarefasList dentro do construtor é pq SÓ DEVE HAVER UMA LISTA. Se vc colocasse
        //na função adicionarTarefa, a lista seria recriada toda vez que vc adicionasse uma nova tarefa, perdendo as
        //tarefas anteriores.
    }

    public void adicionarTarefa(String descricao){
        tarefasList.add(new Tarefas(descricao)); //Cria uma nova instância de Tarefas com a descrição fornecida e a adiciona à tarefasList.
    } // vc tem uma lista chamada tarefasList e nela vc vai adicionar objetos instanciados da classe Tarefas
    //o parametro descricao será substituido por um argumento(a descrição da tarefa) qnd vc instanciar uma tarefa.
    // Ex: ''tarefa 1''

    public void removerTarefa(String descricao){
        List<Tarefas> tarefasParaRemover = new ArrayList<>(); // instanciação da lista com o new
        for(Tarefas t : tarefasList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t); //para cada tarefa t em tarefasList que seja igual a descrição de t
                //coloque em tarefasParaRemover, isso para que remova os duplicados.
            }
        } //a lista tarefasParaRemover é instanciada na função removerTarefa ao invés de no construtor pq
        //seu uso é temporário e só necessário ao chamar a função removerTarefa.
        tarefasList.removeAll(tarefasParaRemover);
    //removeAll pq vc pode acabar tendo elementos repetidos na lista
    }

    public int obterNumeroTotalTarefas(){
        return tarefasList.size(); // vc usa return e não sysout pq retornando esse valor vc usa ele pelo chamador do metodo
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefasList); //uso de sysout e n return pq vc nao precisa usar esse valor dps, só imprimir
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

