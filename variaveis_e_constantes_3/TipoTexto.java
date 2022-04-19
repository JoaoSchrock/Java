package com.company.variaveis_e_constantes_3;

import java.util.Scanner;

public class TipoTexto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();

        System.out.println(" Ol[a " + nome + "!");

        scanner.close();

        Character variavelChar = 'A';
    }
}
