package com;

//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
// Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o
// Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
      //  salário bruto.
     //   quanto pagou ao INSS.
      //  quanto pagou ao sindicato.
       // o salário líquido.
        //calcule os descontos e o salário líquido, conforme a tabela abaixo:


import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Digite Quanto você ganha /hora:");
        double QuantidadeGanhaPorHora = sc.nextDouble();

        System.out.println("-----------------------------------------");

        System.out.println(" Digite quanto você trabalha no mês:");
        double horasdetrabalho = sc.nextDouble();

        System.out.println("-----------------------------------------");

        double salariobruto = QuantidadeGanhaPorHora * horasdetrabalho;
        System.out.println("Seu salario bruto é:" + "\n"  + "->" + " "  + salariobruto);

        System.out.println("-----------------------------------------");


        double iNSS = salariobruto * 8 /100;
        System.out.println("Você pagou a o INSS:" + "\n"  + "->" + " " + iNSS);

        System.out.println("-----------------------------------------");


        double Sindicato = salariobruto * 5 /100;
        System.out.println("Você pagou a o Sindicato:" + "\n"  + "->" + " " + Sindicato);

        System.out.println("-----------------------------------------");

        double ImpostodeRenda = salariobruto * 11 /100;
        System.out.println("Seu imposto de renda é:" +"\n"  + "->" + " " + ImpostodeRenda);

        System.out.println("-----------------------------------------");

        double SalarioLiquido = salariobruto - iNSS - Sindicato - ImpostodeRenda;
        System.out.println("Seu salario liquido é de:" + "\n"  + "->" + " " + SalarioLiquido);

        System.out.println("-----------------------------------------");

    }
}
