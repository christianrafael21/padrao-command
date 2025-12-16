package padroescomportamentais.command;

public class Jogador {

    private String nome;
    private String statusTeste;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getStatusTeste() {
        return statusTeste;
    }

    public void realizarTesteArremesso() {
        this.statusTeste = "Teste de arremesso realizado";
    }

    public void cancelarTesteArremesso() {
        this.statusTeste = "Teste de arremesso cancelado";
    }

    public void realizarTesteDrible() {
        this.statusTeste = "Teste de drible realizado";
    }

    public void cancelarTesteDrible() {
        this.statusTeste = "Teste de drible cancelado";
    }
}
