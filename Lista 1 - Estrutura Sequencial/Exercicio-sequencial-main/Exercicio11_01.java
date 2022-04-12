package com;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Digite o Primeiro N° inteiro: ");
        int primeiroNumero = scanner.nextInt();
        System.out.print(" Digite o Segundo N° inteiro: ");
        int segundoNumero = scanner.nextInt();;
        System.out.print(" Digite um N° real: ");
        float terceiroNumero = scanner.nextFloat();
        float terceiroNumeroAoCubo = terceiroNumero * terceiroNumero * terceiroNumero;
        System.out.println("Resultado do terceiro ao cubo: " + terceiroNumeroAoCubo);
        float dobroDoPrimeiro = primeiroNumero * 2;
        float metadeDoSegundo = segundoNumero / 2;
        System.out.println("Resultado do primeiro com o Segundo: " + dobroDoPrimeiro * metadeDoSegundo);
        float triploDoPrimeiroComOTerceiro = (primeiroNumero * 3) + terceiroNumero;
        System.out.println("Triplo do primeiro com o terceiro: " + triploDoPrimeiroComOTerceiro);
        scanner.close();
    }
}