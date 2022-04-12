package com.company.exercicio_Java;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double segundoNumero = scanner.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        double terceiroNumero = scanner.nextDouble();

        if (segundoNumero < primeiroNumero) {
            if (primeiroNumero > terceiroNumero) {
                System.out.println("1º Numero é o Maior");
            } else if (terceiroNumero > primeiroNumero) {
                System.out.println("3º Numero é o Maior");
            }
        } else if (segundoNumero > primeiroNumero 
                                && 
                   segundoNumero > terceiroNumero) {
            System.out.println("2º Numero é o Maior");
        } else if (terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero) {
            System.out.println("3º Numero é o Maior");
        }

    }
}
