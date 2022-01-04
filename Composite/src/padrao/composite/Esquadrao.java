package padrao.composite;

import java.util.ArrayList;
import java.util.List;

public class Esquadrao extends MembroExercito{
    private List<MembroExercito> membrosExercito;

    public Esquadrao(String descricao) {
        super(descricao);
        this.membrosExercito = new ArrayList<MembroExercito>();
    }

    public void addMembroExercito(MembroExercito membroExercito) {
        this.membrosExercito.add(membroExercito);
    }

    public String getMembroExercito() {
        String saida = "";
        saida = "Esquadrao: " + this.getDescricao() + "\n";
        for (MembroExercito membroExercito : membrosExercito) {
            saida += membroExercito.getMembroExercito();
        }
        return saida;
    }
}
