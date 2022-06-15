package _6_9_trabalhando_com_numeros;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {
    public static void main(String[] args) {
        DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
        double valorProduto = 13.5;

        System.out.println(valorProduto);
        System.out.println(formatador.format(valorProduto));


        String entrada = "R$ 50,34";//se nao usar o R$ da operaçao invalida.
        try{
            double numero = formatador.parse(entrada).doubleValue();
            System.out.println("Numero: " + numero);
        }catch (ParseException e){
            System.out.println("Entrada Invalida");
        }

        BigDecimal bg = new BigDecimal("5131231231000");
        bg = bg.divide(BigDecimal.TEN);
        System.out.println(bg);
    }
}
