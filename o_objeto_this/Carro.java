package com.company.orientacao_a_objetos_parte1.o_objeto_this;

import com.company.orientacao_a_objetos_parte1.composicao_objetos.Proprietario;

public class Carro {
    String fabricante;
    String modelo;
    String  cor;
    int anoDeFabricacao;
    boolean biCombustivel;
    Proprietario dono;
    void alterarModelo(String modelo, Carro carro){
        if (modelo != null) {
            carro.modelo = modelo;
        }
    }

    void ligar() {
        if (modelo != null) {
            System.out.println("ligando o carro: " + modelo);
        }
    }
}
