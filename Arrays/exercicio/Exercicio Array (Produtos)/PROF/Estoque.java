package com.company.orientacao_a_objetos_parte1.arrays.exercicio;
public class Estoque {
    Produto[] produtos;
    void listarProdutos() {
        System.out.println("\nProdutos em estoque");
        System.out.println("---------------------");
        for (int i = 0 ; i < produtos.length; i++){
            produtos[i].descrever();
        }
    }
}
