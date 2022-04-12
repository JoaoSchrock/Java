//Faça um Programa que leia um número e exiba o dia correspondente da semana.
// (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.

import java.util.Scanner;

public class EXERCICIO13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DADOS CORRESPONDENTES:" +
                "\n(1)-Domingo     (2)-Segunda    " +
                "(7)-Sabado  \n(3)-Terça       " +
                "(4)-Quarta  \n(5)-Quinta      " +
                "(6)-Sexta");
        System.out.println("COM OS DADOS ACIMA DIGITE O NUMERO DESEJADO:");
        double numeroDiaSemana = scanner.nextDouble();

        if (numeroDiaSemana == 1) {
            System.out.println("O numero corresponde á Domingo.");
        } else if (numeroDiaSemana == 2) {
            System.out.println("O numero corresponde á Segunda.");
        } else if (numeroDiaSemana == 3) {
            System.out.println("O numero corresponde á Terça.");
        } else if (numeroDiaSemana == 4) {
            System.out.println("O numero corresponde á Quarta.");
        } else if (numeroDiaSemana == 5) {
            System.out.println("O numero corresponde á Quinta.");
        } else if (numeroDiaSemana == 6) {
            System.out.println("O numero corresponde á Sexta.");
        } else if (numeroDiaSemana == 7) {
            System.out.println("O numero corresponde á Sábado.");
        } else {


        }
    }
}
