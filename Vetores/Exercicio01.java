/*
Crie um vetor chamado tarefas;
Pedir ao usuário para inserir as tarefas do dia;
O sistema deverá imprimir as tarefas que foram salvas no vetor.
 */
package com.company.vetores;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tarefas = new String[5];
        System.out.println("Nos informe suas (5) taferas diarias");

        for(int i = 0; i < tarefas.length; i++){
            System.out.println("Tarefa " + i + ": ");
            tarefas[i] = scanner.nextLine();

        }
        System.out.println("Essas sao suas tarefas:");
        for(int i = 0; i < tarefas.length; i++){
            System.out.println( i + ": " + tarefas[i]);
        }



    }
}
