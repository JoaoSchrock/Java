package Exercicio_Topicos_Avancados;


import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class NumerosParticipante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("         _ MEGA SENA _");
        System.out.println("" +
                "|01|02|03|04|05|06|07|08|09|10|\n" +
                "|11|12|13|14|15|16|17|18|19|20|\n" +
                "|21|22|23|24|25|26|27|28|29|30|\n" +
                "|31|32|33|34|35|36|37|38|39|40|\n" +
                "|41|42|43|44|45|46|47|48|49|50|\n" +
                "|51|52|53|54|55|56|57|58|59|60|");

        System.out.println("Escolha 5 numeros de 1 a 60: ");
        for(int i = 1; i <= 5;i++){
            System.out.println("Numero " + i + ": ");
            double numeros = scanner.nextDouble();
        }
    }
}

