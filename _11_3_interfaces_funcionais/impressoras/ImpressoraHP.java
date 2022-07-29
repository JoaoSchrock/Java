package _11_3_interfaces_funcionais.impressoras;

import _11_3_interfaces_funcionais.Compra.Compra;

public class ImpressoraHP implements Impressora {

    @Override
    public void imprimir(Compra c){
        System.out.println("Enviando o comando para a impressora HP -> " + c);
    }

}
