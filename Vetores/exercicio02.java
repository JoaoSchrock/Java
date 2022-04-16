package com.company.Vetores;

import java.util.Scanner;

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
public class exercicio02 {
    static final Integer DIA = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[] primeiraSemana = new Double[]{1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0};
        Double[] segundaSemana = new Double[]{1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0};
        Double[] terceiraSemana = new Double[]{1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0};
        Double[] quartaSemana = new Double[]{2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0};

        Double semana1 = 1000.0 + 1500.0 + 1250.0 + 2100.0 + 1350.0 + 970.0 + 0.0;
        Double semana2 = 1050.0 + 2500.0 + 3250.0 + 1100.0 + 1430.0 + 900.0 + 0.0;
        Double semana3 = 1700.0 + 1300.0 + 1450.0 + 2000.0 + 1390.0 + 800.0 + 0.0;
        Double semana4 = 2100.0 + 1600.0 + 1850.0 + 2100.0 + 1220.0 + 998.0 + 0.0;

        Double[][] mes = new Double[][]{primeiraSemana, segundaSemana, terceiraSemana, quartaSemana};
        Double[] Dia = new Double[]{semana1, semana2, semana3, semana4};

                boolean A = (semana1 > semana2 & semana1 > semana3 & semana1 > semana4);
                boolean B = (semana2 > semana3 & semana2 > semana4 & semana2 > semana1);
                boolean C = (semana3 > semana1 & semana3 > semana2 & semana3 > semana4);
                boolean D = (semana4 > semana3 & semana4 > semana2 & semana4 > semana1);
                if (A) {
                    System.out.println("Semana 1\nCom um faturamento de: " + "\n" + semana1 + "$");
                } else if (B) {
                    System.out.println("Semana 2\nCom um faturamento de: " + "\n" + semana2 + "$");
                } else if (C) {
                    System.out.println("Semana 3\nCom um faturamento de: " + "\n" + semana3 + " Reais");
                } else if (D) {
                    System.out.println("Semana 3\nCom um faturamento de: " + "\n" + semana4 + " Reais");


                }

            }
        }


















