package Desafio_Numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

/*
Desenvolva um programa que:
Recebe como parâmetro do usuário o valor de um produto do tipo double.
Instancia um objeto do tipo BigDecimal atribuindo o valor double a ele.
Calcula 10% do valor usando os métodos disponíveis na classe BigDecimal.
Formata o novo valor calculado para o padrão monetário (R$).
Exibe na tela o valor calculado e formatado.
 */
public class Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite algum valor: ");
        double valorDoUsuario = scanner.nextDouble();

        DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");

        BigDecimal bigUsuario = new BigDecimal(valorDoUsuario);
        bigUsuario = bigUsuario.divide(BigDecimal.TEN);

        String valorFormatado = formatador.format(bigUsuario.doubleValue());
        System.out.println("Valor com 10%: " + valorFormatado);

    }
}
