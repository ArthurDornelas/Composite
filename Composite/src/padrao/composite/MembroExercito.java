package padrao.composite;

public abstract class MembroExercito {
    private String descricao;

    public MembroExercito(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getMembroExercito();
}
