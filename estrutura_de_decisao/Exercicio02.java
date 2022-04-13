package com.company.estrutura_de_decisao;

/*

Pense em uma empresa fictícia que todo o mês de Janeiro premia seus funcionários com um bônus, caso a meta seja alcançada.

Crie um programa que receba 3 parâmetros. O primeiro será a meta de faturamento anual da empresa para o ano que passou.
Depois, receba o parâmetro referente ao faturamento real da empresa no ultimo ano. Por último, receba a média salarial
do funcionário(a) para o ano anterior (não precisa fazer cálculo de média salarial, já que estamos trabalhando com um
algoritmo fictício - na hora de informar esse parâmetro, invente um valor qualquer para representar essa média salarial).

Nessa empresa fictícia, se o faturamento real for igual ou maior que a meta de faturamento anual, então os funcionários
ganharam um bônus que será igual a média salarial deles no último ano. Caso o faturamento seja menor que a meta, mas,
seja maior ou igual a 80% do valor da meta, então eles receberão também 80% de sua média salarial.

No final, mostre de quanto será o prêmio desse funcionário(a).

 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a meta de faturamento para esse ano: ");
        Double meta = scanner.nextDouble();
        System.out.print("Digite o faturamento: ");
        Double faturamento = scanner.nextDouble();
        System.out.print("Digite a média salarial dos últimos 12 meses: ");
        Double mediaSalarial = scanner.nextDouble();
        Double oitentaPorCentoDaMeta = (meta * 80) / 100;
        Boolean bateuAMeta = faturamento >= meta;
        Boolean faturouPeloMenosOitentaPorCento = faturamento >= oitentaPorCentoDaMeta;
        if (bateuAMeta) {
            System.out.println("Você vai ganhar um bônus de 100%! Ele será de: " + mediaSalarial);
        } else if (faturouPeloMenosOitentaPorCento) {
            Double oitentaPorCentoDaMediaSalarial = (mediaSalarial * 80) / 100; // Esse cálculo só precisa ser feito se a meta NÃO tiver sido batida e, por isso, ele ficou aqui.
            System.out.println("Você vai ganhar um bônus de 80%! Ele será de: " + oitentaPorCentoDaMediaSalarial);
        } else {
            System.out.println("Infelizmente, esse ano não tem bônus!");
        }
        scanner.close();
    }
}
