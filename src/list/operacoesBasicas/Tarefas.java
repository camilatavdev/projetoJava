package list.operacoesBasicas;

public class Tarefas {
    private String descricao; //private pra dps ser acessado pelo metodo publico get

    public Tarefas(String descricao) { //construtor (mesmo nome da classe)
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;//metodo get publico pra acessar a string private descricao
    }

    @Override //qnd pedirmos para imprimir um objeto do tipo Tarefas, vai aparecer isso aqui:
    public String toString() {
        return "Tarefas{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
