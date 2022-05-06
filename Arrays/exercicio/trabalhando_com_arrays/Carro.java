package com.company.orientacao_a_objetos_parte1.arrays.exercicio.trabalhando_com_arrays;

import com.company.orientacao_a_objetos_parte1.composicao_objetos.Proprietario;

public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoDeFabricacao;
    boolean biCombustivel;

    Proprietario dono;

    void ligar() {
        if (modelo != null) {
            System.out.println("Ligando o carro: " + modelo);
        }
    }
}
