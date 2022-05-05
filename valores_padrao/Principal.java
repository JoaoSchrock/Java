package com.company.orientacao_a_objetos_parte1.valores_padrao;

public class Principal {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.anoDeFabricacao = 2009;
        meuCarro.cor = "Preto";

        meuCarro.dono.nome = "José Pereira";

    }
}
