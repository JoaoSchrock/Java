package com.company.orientacao_a_objetos_parte1.composicao_objetos.exercicio;

public class Passeio {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "José";
        p1.cachorro = new Cachorro();

        p1.cachorro.nome = "Bidu";
        p1.cachorro.idade = 3;
        p1.cachorro.raça = "Boxer";
        p1.cachorro.sexo = 'M';

        Caminhada c = new Caminhada();
        c.andar(p1);
    }
}
