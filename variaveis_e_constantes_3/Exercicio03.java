package com.company.variaveis_e_constantes_3;

/*
* O seu programa deve receber a nota do aluno pelo console e depois vcoê vai fazer uma operação
* lógica para saber se a nota do aluno é maior que 70. O resultado dessa operação lógica deve
* ser atribuido a uma variável do tipo Boolean.
*
* Por último, você deve utilizar a variável do tipo Boolean com a estrutura de decisão if para imprimir,
* no console, uma mensagem que vai dizer se o aluno passou ou não passou.
*
* */

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua nota: ");
        Double notaDoAluno = scanner.nextDouble();

        Boolean passouDeAno = notaDoAluno >= 70;


        if (passouDeAno) {
            System.out.println("Parabéns! Você passou de ano.");
        } else {
            System.out.println("Infelizmente, ficou de recuperação.");
        }

        scanner.close();
    }

}
