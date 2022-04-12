package com.company.exercicio_Java;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int PrimeiroNumero, SegundoNumero;



        System.out.println("Digite o Primeiro numero:");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo numero:");
        int num2 = sc.nextInt();

        int maiorNumero = sc.nextInt();

        if (num1 > num2){
            System.out.println(" Seu maior numero é:" + num1);
            } else {
            System.out.println(" Seu maior numero é:" + num2);

            sc.close();

        }



     }
     }




