//Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo)
// e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos
// os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
//Desconto do IR:
//Salário Bruto até 900 (inclusive) - isento
//Salário Bruto até 1500 (inclusive) - desconto de 5%
//Salário Bruto até 2500 (inclusive) - desconto de 10%
//Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.

//        Salário Bruto: (5 * 220)        : R$ 1100,00
//        (-) IR (5%)                     : R$   55,00
//        (-) INSS ( 10%)                 : R$  110,00
//        FGTS (11%)                      : R$  121,00
//        Total de descontos              : R$  165,00
//        Salário Liquido                 : R$  935,00

import java.util.Scanner;

public class EXERCICIO12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto você recebe no Mês?:");
        double valorRecebidoMes = scanner.nextDouble();
        System.out.println("Quantas horas você trabalha no mês?:");
        double horasTrabalhasMes = scanner.nextDouble();

        double salarioMensal = valorRecebidoMes * horasTrabalhasMes;
        double impostoDeRenda = salarioMensal * 5 / 100;
        double iNSS = salarioMensal * 10 / 100;
        double fGTS = salarioMensal * 11 / 100;
        double descontoTotal = impostoDeRenda + iNSS + fGTS;
        double salarioLiquido = salarioMensal - descontoTotal;

        if (salarioMensal <=900) {
            System.out.println("Dispensado");
            System.out.println("Salario Bruto: " + "R$" + " " + salarioMensal);

        } else if (salarioMensal >=901 & salarioMensal <=1500) {
            System.out.println("Desconto de 5%");
            System.out.println("Salario Bruto: " + "R$" + " " +  salarioMensal);
            System.out.println("(-) IR (5%): " + impostoDeRenda);
            System.out.println("(-) iNSS (10%): " + iNSS );
            System.out.println("FGTS (11%): " + fGTS );
            System.out.println("Total de Descontos: " + Math.ceil(descontoTotal));
            System.out.println("Salario Liquido: " + salarioLiquido);

        } else if (salarioMensal >=1501 & salarioMensal <=2500){
            System.out.println("Desconto de 10%");
            System.out.println("Salario Bruto: " + "R$" + " " + salarioMensal);
            System.out.println("(-) IR (5%): " + impostoDeRenda);
            System.out.println("(-) iNSS (10%): " + iNSS );
            System.out.println("FGTS (11%): " + fGTS );
            System.out.println("Total de Descontos: " + Math.ceil(descontoTotal));
            System.out.println("Salario Liquido: " + salarioLiquido);

        } else if (salarioMensal >2500){
            System.out.println("(Desconto de 20%)");
            System.out.println("Salario Bruto: " + "R$" + " " + salarioMensal);
            System.out.println("(-) IR (5%): " + impostoDeRenda);
            System.out.println("(-) iNSS (10%): " + iNSS );
            System.out.println("FGTS (11%): " + fGTS );
            System.out.println("Total de Descontos: " + Math.ceil(descontoTotal));
            System.out.println("Salario Liquido: " + salarioLiquido);
        }

    }
}
