package DesafioCollections;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;

public class Governo {
    // armazena uma lista de políticos por estado da federação
    private Map<String, List<Politico>> partidosPoliticos;

    public Governo() {
        this.partidosPoliticos = new HashMap<String, List<Politico>>();
    }

    public void adicionarPolitico(String partidoPolitico, Politico politico) {
        List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
        if (politicos == null) {
            politicos = new ArrayList<Politico>();
        }
        politicos.add(politico);
        this.partidosPoliticos.put(partidoPolitico, politicos);
    }

    public BigDecimal calcularGastosComSalario(String partidoPolitico) {

    }

    public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
       
    }
}
