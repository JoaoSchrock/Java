package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_19_exercicio_sobrecarga;

public class MaquinaCafe {
    int acucarDisponivel;

    void fazerCafe() {
        fazerCafe(10);
    }

    void fazerCafe(int quantidadeAcucar){
        if (acucarDisponivel < quantidadeAcucar){
            System.out.println("Não há açucar suficiente para fazer seu café.");
        } else {
            acucarDisponivel -= quantidadeAcucar;
            System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de açucar.");
        }
    }
}
