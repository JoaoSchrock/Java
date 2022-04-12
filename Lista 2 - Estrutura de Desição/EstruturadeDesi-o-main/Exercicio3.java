package com.company.exercicio_Java;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("F-(Feminino) M-(Masculino)");
        System.out.println("Escolha dentre as duas siglas acima:");
        char sexo = scanner.next().charAt(0);



        if (sexo == 'M' || sexo == 'm') {
            System.out.println("RESULTADO:" + "\n" + "Masculino(♂)");
        } else if (sexo == 'F' || sexo == 'f') {
            System.out.println("RESULTADO:" + "\n" + "Feminino(♀)");
        } else {
            System.out.println("SEXO DESCONHECIDO!?!?!" + "\n" + "Digite Apenas:" + "\n" + "(F)-Feminino" + "\n" + "(M)-Masculino");
        }


        }
        }


