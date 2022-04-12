package Exercicio22;

import jdk.swing.interop.SwingInterOpUtils;

import java.awt.*;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" IDENTIFICAÇÃO DO USUÁRIO ");

        System.out.println(" Favor Digite seu Nome");

        String nome = scanner.nextLine();

        System.out.println("Favor Digite seu Sobrenome");

        String sobrenome = scanner.nextLine();



        System.out.println(" Favor Digite sua Idade");

        double idade = Double.parseDouble((scanner.nextLine()));



        System.out.println("CALCULO DO SEU IMC");

        System.out.print("Digite seu peso (em Kg): ");

        Double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em metros): ");

        Double altura = scanner.nextDouble();

        Double alturaAoQuadrado = altura * altura;

        Double indiceMassaCorporal = peso / alturaAoQuadrado;

        System.out.println("Seu IMC é: " + indiceMassaCorporal);



        System.out.println(" CALCULO LITROS DE AGUA P/ DIA");

        System.out.println(" Digite seu PESO ( em KG):");

        byte PESO = scanner.nextByte();

        int consumo = -PESO ;Object multiplicaçao;

        int total = ( PESO * (35));


        System.out.println(" Deve-se Beber: " + total);

        System.out.println(" Voçê se Chama:" + nome + " " + sobrenome);

        System.out.println(" Tem:" + idade);

        System.out.println(" Seu IMC é:" + indiceMassaCorporal);

        scanner.close();












    }




}
