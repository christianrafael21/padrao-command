package padroescomportamentais.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreinadorTest {

    Treinador treinador;
    Jogador jogador;

    @BeforeEach
    void setUp() {
        treinador = new Treinador();
        jogador = new Jogador("LeBron James");
    }

    @Test
    void deveRealizarTesteArremesso() {
        Teste testeArremesso = new TesteArremesso(jogador);
        treinador.executarTeste(testeArremesso);

        assertEquals("Teste de arremesso realizado", jogador.getStatusTeste());
    }

    @Test
    void deveRealizarTesteDrible() {
        Teste testeDrible = new TesteDrible(jogador);
        treinador.executarTeste(testeDrible);

        assertEquals("Teste de drible realizado", jogador.getStatusTeste());
    }

    @Test
    void deveCancelarTesteDrible() {
        Teste testeArremesso = new TesteArremesso(jogador);
        Teste testeDrible = new TesteDrible(jogador);

        treinador.executarTeste(testeArremesso);
        treinador.executarTeste(testeDrible);

        treinador.cancelarUltimoTeste();

        assertEquals("Teste de drible cancelado", jogador.getStatusTeste());
    }

}
