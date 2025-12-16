package padroescomportamentais.command;

import java.util.ArrayList;
import java.util.List;

public class Treinador {

    private List<Teste> testes = new ArrayList<Teste>();

    public void executarTeste(Teste teste) {
        this.testes.add(teste);
        teste.executar();
    }

    public void cancelarUltimoTeste() {
        if (testes.size() != 0) {
            Teste teste = this.testes.get(this.testes.size() - 1);
            teste.cancelar();
            this.testes.remove(this.testes.size() - 1);
        }
    }

}
