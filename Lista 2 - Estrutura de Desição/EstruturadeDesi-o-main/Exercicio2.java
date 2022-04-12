package com.company.exercicio_Java;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Diga-me um valor:");
        double valor = scanner.nextDouble();


        if (valor < 0){
            System.out.println("Seu valor é negativo:" + valor);
        }else{
            System.out.println("Seu valor é Positivo:" + valor);

            scanner.close();
        }
    }
}
