package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_22_desafio_polimorfismo_e_classes_abstratas;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class RelatorioContas {

    public void exibirListagem(Conta[] contas) {
        System.out.println("***********************************");
        System.out.println("RELATÓRIO DE CONTAS A PAGAR RECEBER");
        System.out.println("***********************************");

        for (int i = 0; i < contas.length; i++) {
            contas[i].exibirDetalhes();
        }

        System.out.println("************************************");
    }
}
