package main.java.set.Pesquisa;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){ // td mundo que começa com camila, independente do sobrenome, vou botar nesse set
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){ //equalsIgnorecase: nome igualzinho (nome e sobrenome)
               c.setNumero(novoNumero);
               contatoAtualizado = c;
               break; // break pq se eu ja achei um contato e atualizei o numero, nao preciso mais percorrer o set,
                //ja que nao vai existir outro contato com o mesmo nome
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 1665); // nao adiciona esse pq tem o mesmo nome do anterior
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila DIO", 654983);
        agendaContatos.adicionarContato("Maria silva", 1111111);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        System.out.print("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria silva", 555555));

    }
}

//hashSet adiciona em ordem aleatória

