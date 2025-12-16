package padroescomportamentais.command;

public class TesteArremesso implements Teste {

    private Jogador jogador;

    public TesteArremesso(Jogador jogador) {
        this.jogador = jogador;
    }

    public void executar() {
        this.jogador.realizarTesteArremesso();
    }

    public void cancelar() {
        this.jogador.cancelarTesteArremesso();
    }
}
