package com.company.teste;

import java.util.Scanner;

public class Exercicio17 {
    static double litrosDoGalao = 3.6;
    static double litrosDeCadaLata = 18;
    static double precoDeCadaGalao = 25;
    static double precoDeCadaLata = 80;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDIGITE O TAMANHO DA ÁREA A SER PINTADA(em m²): ");
        double areaDaParede = scanner.nextDouble();
        double litrosNecessarios = areaDaParede / 6;
        double lataPossiveis = (litrosNecessarios / litrosDeCadaLata);
        double galoesPossiveis = (litrosNecessarios / litrosDoGalao);
        double latasPossiveisParaMenorCusto = lataPossiveis;
        System.out.printf("\nAGORA VOCÊ FARÁ UMA OPERAÇÃO ARREDONDANDO VALORES, PRESTE MUITA ATENÇÃO!!! \n -----------------CASO O NÚMERO SEJA INTEIRO, SÓ O REPITA-----------------\n");
        System.out.println("\nQuantidade: " + lataPossiveis);
        System.out.print("Arredonde quantidade para CIMA[ex.: 1.34 = 2]: ");
        lataPossiveis = scanner.nextDouble();
        double precoSoDaLata = lataPossiveis * precoDeCadaLata;
        System.out.println("\nQUANTIDADE: " + galoesPossiveis);
        System.out.print("Arredonde QUANTIDADE para CIMA[ex.: 1.34 = 2]: ");
        galoesPossiveis = scanner.nextDouble();
        double precoSoDoGalao = galoesPossiveis * precoDeCadaGalao;
        System.out.println("\nQUANTIDADE: " + latasPossiveisParaMenorCusto);
        System.out.print("Arredonde QUANTIDADE para MENOR[ex.: 1.34 = 2]: ");
        latasPossiveisParaMenorCusto = scanner.nextDouble();
        double quantidadeDeLatasMenorCusto = litrosNecessarios - (litrosDeCadaLata * latasPossiveisParaMenorCusto);
        double quantidadeDeGalaoMenorCusto = quantidadeDeLatasMenorCusto / litrosDoGalao;
        System.out.println("\nQUANTIDADE: " + quantidadeDeGalaoMenorCusto);
        System.out.print("Arredonde QUANTIDADE para MENOR[ex.: 1.34 = 2]: ");
        quantidadeDeGalaoMenorCusto = scanner.nextDouble();
        double valorDoMenorCusto = quantidadeDeGalaoMenorCusto * precoDeCadaGalao + latasPossiveisParaMenorCusto * precoDeCadaLata;
        System.out.print("\n\n----------------QUANTIDADES NECESSÁRIAS----------------");
        System.out.print("\nLITROS: " + litrosNecessarios);
        System.out.print("\nLATA: " + lataPossiveis);
        System.out.print(" -------------- R$ " + precoSoDaLata);
        System.out.print("\nGALÂO: " + galoesPossiveis);
        System.out.print(" ------------ R$ " + precoSoDoGalao);
        System.out.print("\n\n----------------MENOR CUSTO---------------- \nLATA: " + latasPossiveisParaMenorCusto);
        System.out.print(" UNIDADES\nGALÃO: " + quantidadeDeGalaoMenorCusto);
        System.out.println(" UNIDADES\nVALOR: R$ " + valorDoMenorCusto);
        scanner.close();
    }
}