package com.company.variaveis_e_constantes_3;

/*
* Crie um programa que lê, do console, o nome e o sobrenome de uma pessoa e depois imprime o nome completo.
* Para isso, você vai precisar de duas variáveis: a primeira você pode chamar de "nome" e a segunda de
* "sobrenome". Por último, você vai juntar o nome e o sobrenome em uma única impressão.
* */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Olá " + nome + " " + sobrenome + "!");

        scanner.close();
    }
}
