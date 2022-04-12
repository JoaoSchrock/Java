package com.company.exercicio_Java;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do 1º Produto: ");
        double primeiroPreço = scanner.nextDouble();
        System.out.print("Digite o valor do 2º Produto: ");
        double segundoPreço = scanner.nextDouble();
        System.out.print("Digite o valor do 3º Produto: ");
        double terceiroPreço = scanner.nextDouble();

        if     (primeiroPreço < segundoPreço) {
            if (primeiroPreço < terceiroPreço) {
                System.out.println("\nO valor de " + primeiroPreço + " Reais" + " está bem mais Barato!");
            } else if (terceiroPreço < primeiroPreço)
                if    (terceiroPreço < segundoPreço) {
                    System.out.println("\nO valor de " + terceiroPreço + " Reais" + " está bem mais Barato!");
                }
        } else if (segundoPreço < primeiroPreço) {
            if    (segundoPreço < terceiroPreço) {
                System.out.println("\nO valor de " + segundoPreço + " Reais" + " está bem mais Barato!");
            } else if (terceiroPreço < primeiroPreço)
                if    (terceiroPreço < segundoPreço) {
                    System.out.println("\nO valor de " + terceiroPreço + " Reais" + " está bem mais Barato!");
                }
        } else if (terceiroPreço < primeiroPreço)
            if    (terceiroPreço < segundoPreço) {
                System.out.println("\nO valor de " + terceiroPreço + " Reais" + " está bem mais Barato!");
            }
            scanner.close();
    }
}
