
    //Faça um Programa que leia três números e mostre-os em ordem decrescente.

import java.util.Scanner;

    public class Exercicio9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Digite o primeiro numero");
            double primeiroNumero = scanner.nextDouble();
            System.out.println("Digite o segundo numero");
            double segundoNumero = scanner.nextDouble();
            System.out.println("Digite o terceiro numero");
            double terceiroNumero = scanner.nextDouble();

            System.out.println("A ORDEM DECRESCENTE É:");
            if (primeiroNumero < segundoNumero & primeiroNumero < terceiroNumero) {
                System.out.println( + terceiroNumero);

            } else if (segundoNumero < primeiroNumero & segundoNumero < terceiroNumero) ;
            System.out.println(+ segundoNumero);
            System.out.println( + primeiroNumero);



            }

        }






