import java.util.ArrayList;
import java.util.List;

public class Historico {

    private List<String> operacoes;

    public Historico() {
        this.operacoes = new ArrayList<>();
    }

    public void adicionarOperacao(String descricao) {
        operacoes.add(descricao);
    }

    public void mostrarHistorico() {
        System.out.println("\n Histórico de Operações:");
        if (operacoes.isEmpty()) {
            System.out.println("Nenhuma operação realizada.");
        } else {
            for (String op : operacoes) {
                System.out.println("- " + op);
            }
        }
    }
}
