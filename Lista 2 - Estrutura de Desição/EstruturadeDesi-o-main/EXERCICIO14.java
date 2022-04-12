//Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre,
// e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
   //     Média de Aproveitamento  Conceito
        //Entre 9.0 e 10.0        A
        //Entre 7.5 e 9.0         B
        //Entre 6.0 e 7.5         C
        //Entre 4.0 e 6.0         D
        //Entre 4.0 e zero        E

import java.util.Scanner;

public class EXERCICIO14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite a primeira nota do aluno:");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota do ALuno:");
        double nota2 = scanner.nextDouble();

        double mediadoAluno = (nota1 + nota2) /4;

        if(mediadoAluno >= 9.0 & mediadoAluno <= 10.0){
            System.out.println("PARABENS ALUNO!!! Você tirou um A");
        }else if(mediadoAluno >= 7.5 & mediadoAluno <= 9.0){
            System.out.println("PARABENS ALUNO!!! Você tirou um B");
        }else if(mediadoAluno >= 6.0 & mediadoAluno <= 7.5){
            System.out.println("PARABENS ALUNO!!! Você tirou um C");
        }else if(mediadoAluno >= 4.0 & mediadoAluno <= 6.0){
            System.out.println("PARABENS ALUNO!!! Você tirou um D");
        }else if(mediadoAluno >= 0.0 & mediadoAluno <= 4.0){
            System.out.println("PARABENS ALUNO!!! Você tirou um E");
        }
    }
}
