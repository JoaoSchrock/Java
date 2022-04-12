package com.company.exercicio_Java;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        float primeiraNota = scanner.nextFloat();

        System.out.print("Digite  sua segunda nota: ");
        float segundaNota = scanner.nextFloat();

        double media = primeiraNota + segundaNota;
        System.out.println("Aluno, Sua média foi de: " + media + " Pontos");

        boolean aprovado = media>=7;

        if  (aprovado){
            System.out.println("PARABÉNS!!! Aluno aprovado(✔)" );
        } else {
            System.out.println("NOTA NÃO ALCANÇADA" + "\n" + "Aluno reprovado(❎)");
        }


    }

}
