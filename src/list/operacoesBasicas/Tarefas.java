package list.operacoesBasicas;

public class Tarefas {
    private String descricao;

    public Tarefas(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override //qnd pedirmos para imprimir um objeto do tipo Tarefas, vai aparecer isso aqui:
    public String toString() {
        return "Tarefas{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
