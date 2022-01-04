package test;

import org.junit.jupiter.api.Test;
import padrao.composite.Divisao;
import padrao.composite.Esquadrao;
import padrao.composite.MembroExercito;
import padrao.composite.Soldado;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class DivisaoTest {

    @Test
    void deveRetornarEmentaDisciplina() {
        Soldado soldado1 = new Soldado("Soldado", "Ryan");
        Soldado soldado2 = new Soldado("Cabo", "Arthur");

        Esquadrao esquadrao12 = new Esquadrao("Delta");
        esquadrao12.addMembroExercito(soldado1);
        esquadrao12.addMembroExercito(soldado2);

        Soldado soldado3 = new Soldado("Soldado", "James");
        Soldado soldado4 = new Soldado("Major", "Jack");

        Esquadrao esquadrao34 = new Esquadrao("Beta");
        esquadrao34.addMembroExercito(soldado3);
        esquadrao34.addMembroExercito(soldado4);

        Esquadrao esquadraoSniper = new Esquadrao("SniperSquad");
        esquadraoSniper.addMembroExercito(esquadrao12);
        esquadraoSniper.addMembroExercito(esquadrao34);

        Divisao divisao = new Divisao();
        divisao.setMembro(esquadraoSniper);

        assertEquals("Esquadrao: SniperSquad\n" +
                "Esquadrao: Delta\n" +
                "Soldado: Ryan - patente: Soldado\n" +
                "Soldado: Arthur - patente: Cabo\n" +
                "Esquadrao: Beta\n" +
                "Soldado: James - patente: Soldado\n" +
                "Soldado: Jack - patente: Major\n", divisao.getMembro());
    }

    @Test
    void deveRetornarExecacaoDivisaoSemMembro() {
        try {
            Divisao divisao = new Divisao();
            divisao.getMembro();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Divisao sem membro", e.getMessage());
        }
    }
}
