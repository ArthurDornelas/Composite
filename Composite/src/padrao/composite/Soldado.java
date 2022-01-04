package padrao.composite;

public class Soldado extends MembroExercito{
    private String nome;

    public Soldado(String descricao, String nome) {
        super(descricao);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMembroExercito() {
        return "Soldado: " + this.getNome() + " - patente: " + this.getDescricao() + "\n";
    }
}
