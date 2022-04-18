/*
Repare nos vetores abaixo:
Double[] semanaUm = new Double[]{ 1000,0, 1500,0, 1250,0, 2100,0, 1350,0, 970,0, 0,0 };
Double[] semanaDois = new Double[]{ 1050,0, 2500,0, 3250,0, 1100,0, 1430,0, 900,0, 0,0 };
Double[] semanaTres = new Double[]{ 1700,0, 1300,0, 1450,0, 2000,0, 1390,0, 800,0, 0,0 };
Double[] semanaQuatro = new Double[]{ 2100,0, 1600,0, 1850,0, 2100,0, 1220,0, 998,0, 0,0 };
Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };
Os quatro primeiros vetores estão guardando o faturamento de cada semana e o último
vetor, que é de 2 dimensões,
guarda o faturamento mensal separado por semanas.
Crie um achado que encontrou qual semana teve o maior faturamento.
No final mostre qual foi essa semana e de quanto
foi esse faturamento.
*/
package com.company.vetores;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double[] primeiraSemana = new Double[]{1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0};
        Double[] segundaSemana = new Double[]{1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0};
        Double[] terceiraSemana = new Double[]{1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0};
        Double[] quartaSemana = new Double[]{2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0};
        Double[][] mes = new Double[][]{primeiraSemana, segundaSemana, terceiraSemana, quartaSemana};

        Double oMaiorFaturamento = 0.0;
        Integer semanaGanhadora = null;
        for (int i = 0; i < mes.length; i++) { //[i] aqui seleciona um vetor de uma dimensão(cada semana por vez)
            Double[] semana = mes[i];
            Double faturamentoDaSemana = 0.0;
            for (int y = 0; y < semana.length; y++) {
                faturamentoDaSemana += semana[y]; //aqui soma os valores da semanas.
            }
            Boolean semanaComMaiorFaturamento = faturamentoDaSemana > oMaiorFaturamento;
            if (semanaComMaiorFaturamento) {
                oMaiorFaturamento = faturamentoDaSemana;
                semanaGanhadora = i + 1;
            }
        }
        System.out.println("A " + semanaGanhadora +"°" + " semana ganhou!" + "\n" + "Com um faturamento de: " + oMaiorFaturamento + "$");



    }
}





