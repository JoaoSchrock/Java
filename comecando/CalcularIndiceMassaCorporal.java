package com.company.comecando;

import java.util.Scanner;

public class CalcularIndiceMassaCorporal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULO DO INDICE DE MASSA CORPORAL");
        System.out.print("Digite seu peso (em Kg): ");
        Double peso = scanner.nextDouble();
        System.out.print("Digite sua altura (em metros): ");
        Double altura = scanner.nextDouble();
        Double alturaAoQuadrado = altura * altura;
        Double indiceMassaCorporal = peso / alturaAoQuadrado;
        System.out.println("Seu IMC e: " + indiceMassaCorporal);
        scanner.close();
    }
}
