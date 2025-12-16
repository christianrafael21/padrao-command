package padroescomportamentais.command;

public class TesteDrible implements Teste {

    private Jogador jogador;

    public TesteDrible(Jogador jogador) {
        this.jogador = jogador;
    }

    public void executar() {
        this.jogador.realizarTesteDrible();
    }

    public void cancelar() {
        this.jogador.cancelarTesteDrible();
    }
}
