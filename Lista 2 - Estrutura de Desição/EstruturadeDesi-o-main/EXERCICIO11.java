//As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
//Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
//salários até R$ 280,00 (incluindo) : aumento de 20%
//salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
//salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
//salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
//o salário antes do reajuste;
//o percentual de aumento aplicado;
//o valor do aumento;
//o novo salário, após o aumento.

import java.util.Scanner;

public class EXERCICIO11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CARO COlABORADOR");
        System.out.println("Digite seu salario mensal");
        double salarioMensal = scanner.nextDouble();

        if (salarioMensal == 280) {
            System.out.println("salario antes do reajuste: " + salarioMensal);
            System.out.println("Um aumento de 20%");
            float aumentode20 = (float) ((salarioMensal * 20) / 100);
            System.out.println("O aumento foi de: " + aumentode20);
            System.out.println("Salário depois do aumento: " + salarioMensal + aumentode20);
        }


            if (salarioMensal >= 280 & salarioMensal <= 700) {
                System.out.println("salario antes do reajuste: " + salarioMensal);
                System.out.println("Um aumento de 15%");
                float aumentode15 = (float) ((salarioMensal * 15) / 100);
                System.out.println("O aumento foi de: " + aumentode15);
                System.out.println("Salário depois do aumento: " + salarioMensal + aumentode15);
            }

                if (salarioMensal >= 700 & salarioMensal <= 1500) {
                    System.out.println("salario antes do reajuste: " + salarioMensal);
                    System.out.println("Um aumento de 10%");
                    float aumentode10 = (float) ((salarioMensal * 10) / 100);
                    System.out.println("O aumento foi de: " + aumentode10);
                    System.out.println("Salário depois do aumento: " + salarioMensal + aumentode10);
                }

                    if (salarioMensal >= 1500) {
                        System.out.println("salario antes do reajuste: " + salarioMensal);
                        System.out.println("Um aumento de 5%");
                        float aumentode5 = (float) ((salarioMensal * 5) / 100);
                        System.out.println("O aumento foi de: " + aumentode5);
                        System.out.println("Salário depois do aumento: " + salarioMensal + aumentode5);

                    }
                    scanner.close();





    }
}