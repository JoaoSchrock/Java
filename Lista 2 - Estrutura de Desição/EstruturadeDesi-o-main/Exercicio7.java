package com.company.exercicio_Java;


import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1, numero2, numero3;
        System.out.print("Digite o Primeiro numero: ");
        numero1 = scanner.nextDouble();
        System.out.print("Digite o Segundo numero: ");
        numero2 = scanner.nextDouble();
        System.out.print("Digite o Terceiro numero: ");
        numero3 = scanner.nextDouble();

        if (numero1 > numero2) {
            if (numero1 > numero3) {
                System.out.println("\no primeiro numero e o maior");
            } else if (numero3 > numero1) {
                System.out.println("\no terceiro numero e o maior");
            }
        } else if (numero2 > numero1) {
            if    (numero2 > numero3) {
                System.out.println("\no segundo numero e o maior");
            } else if (numero3 > numero1)
                if    (numero3 > numero2) {
                    System.out.println("\no terceiro numero e o maior");
                }
        } else if (numero3 > numero1)
            if    (numero3 > numero2) {
                System.out.println("\no terceiro numero e o maior");
            }
        if (numero1<numero2 && numero1<numero3){
            System.out.println("\no primeiro numero e o menor");
        } else if (numero2 < numero1) {
            if    (numero2 < numero3) {
                System.out.println("\no segundo numero e o menor");
            } else if (numero3 < numero1)
                if    (numero3 < numero2) {
                    System.out.println("\no terceiro numero e o menor");
                }
        } else if (numero3 < numero1)
            if    (numero3 < numero2) {
                System.out.println("\no terceiro numero e o menor");
            }else{
        scanner.close();
    }
}
