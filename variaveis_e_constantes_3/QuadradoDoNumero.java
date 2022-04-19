package com.company.variaveis_e_constantes_3;

import java.util.Scanner;

public class QuadradoDoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        Integer numero = scanner.nextInt();
        Integer quadrado = numero * numero;
        System.out.println("O quadrado de " + numero + " e " + quadrado + ".");
        scanner.close();
    }
}
