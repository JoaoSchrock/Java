/*
Crie uma pequena calculadora de subtração e adição.
Crie um programa que peça dois números do usuário

e também qual a operação ele deseja fazer - adição ou subtração.

 Para cada operação, você deve construir um método que realize a mesma, ou seja, teremos um método para adição,
 que vai receber dois números como parâmetros e retornar o resultado da soma entre eles, e outro método para subtração.

Fique a vontade para implementar multiplicação e divisão também.
 */
package com.company.Metodo;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para a sua operacao");
        double primeiroNumero = scanner.nextDouble();
        System.out.println("digite outro numero");
        double segundoNumero = scanner.nextDouble();


        String[] operacao = new String[]{"" +
                "(+)Adicao",
                "(-)Subtraçao",
                "(*)Multiplicacao",
                "(/)Divisão}"};
        System.out.println("Escolha uma das operacoes matematicas abaixo:");
        char operacoesMatematicas = scanner.next().charAt(0);
       for(int i = 0; i < operacao.length; i++ ){
        System.out.println("[" + i + "] " + operacao[i]);


       if(operacoesMatematicas == '+'){
            System.out.println("Voce escolheu a soma:" + (primeiroNumero + segundoNumero));
        }else if(operacoesMatematicas == '-'){
            System.out.println("Voce escolheu a Subtracao:" + (primeiroNumero - segundoNumero));
        }else if(operacoesMatematicas == '*'){
            System.out.println("Voce escolheu a Multiplicacao" + (primeiroNumero * segundoNumero));
        }else if(operacoesMatematicas == '/'){
            System.out.println("Voce escolheu a Divisao" + (primeiroNumero / segundoNumero));
        }else{
            terminarProgramaComOperacaoInvalida();
        }

        }

        static void terminarProgramaComOperacaoInvalida(){
        System.err.println("Operacao Invalida!!!");
            System.exit(1);
        }


    }
}

