package acessando_Atributos_de_Objetos.composicaoObjetos.array;

import java.util.Scanner;

public class Estoque {

    Produto[] produtos;

    void listarProdutos() {
        for (int i = 0; i < produtos.length; i++) {
            produtos[i].descrever();

        }
    }
}
