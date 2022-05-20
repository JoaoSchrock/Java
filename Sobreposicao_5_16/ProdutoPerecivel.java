package Sobreposicao_5_16;

import java.util.Date;

public class ProdutoPerecivel extends Produto {
    protected Date dataValidade;
    public void identificar(){
        System.out.println("Minha data de validade e " + dataValidade + ".");
    }

}
