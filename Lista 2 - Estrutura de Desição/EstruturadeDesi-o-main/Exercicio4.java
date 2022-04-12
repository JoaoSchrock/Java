package com.company.exercicio_Java;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Favor Digite uma letra: ");
        char Letravogal = scanner.next().charAt(0);

        if (
                   Letravogal == 'A'
                || Letravogal == 'a'
                || Letravogal == 'E'
                || Letravogal == 'e'
                || Letravogal == 'I'
                || Letravogal == 'i'
                || Letravogal == 'O'
                || Letravogal == 'o'
                || Letravogal == 'U'
                || Letravogal == 'u'){

            System.out.println("A letra indicada é uma  vogal");
        } else {
            System.out.println("A letra indicada é uma consoante");
        }


    }
}
