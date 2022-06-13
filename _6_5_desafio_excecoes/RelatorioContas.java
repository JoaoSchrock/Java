package com.company.orientacao_a_objetos._6_topicos_avancados._6_5_desafio_excecoes;

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
