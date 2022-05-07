package com.company.orientacao_a_objetos_parte1.o_objeto_this;


public class ExemploThis {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Palio";

        System.out.println("Modelo antes: " + carro.modelo);

        carro.alterarModelo("Civic", carro);

        System.out.println("Modelo depois: " + carro.modelo);
    }





}
