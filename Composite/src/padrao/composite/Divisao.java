package padrao.composite;

public class Divisao {
    private MembroExercito membro;

    public void setMembro(MembroExercito membro) {
        this.membro = membro;
    }

    public String getMembro() {
        if (this.membro == null) {
            throw new NullPointerException("Divisao sem membro");
        }
        return this.membro.getMembroExercito();
    }
}
