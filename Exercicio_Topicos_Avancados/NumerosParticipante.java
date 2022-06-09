package Exercicio_Topicos_Avancados;

import java.util.Scanner;

public class NumerosParticipante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("        _ MEGA SENA _");
        System.out.println("" +
                "|01|02|03|04|05|06|07|08|09|10|\n" +
                "|11|12|13|14|15|16|17|18|19|20|\n" +
                "|21|22|23|24|25|26|27|28|29|30|\n" +
                "|31|32|33|34|35|36|37|38|39|40|\n" +
                "|41|42|43|44|45|46|47|48|49|50|\n" +
                "|51|52|53|54|55|56|57|58|59|60|");

        System.out.println("Quantos Jogos você deseja Jogar?");
        int quantidadeJogos = scanner.nextInt();

        for (int K = 1; K <= quantidadeJogos; K++) {
            System.out.println("_ JOGO " + K + " _");

            double numeroAleatorio1 = Math.random() * 60;
            double numeroAleatorio2 = Math.random() * 60;
            double numeroAleatorio3 = Math.random() * 60;
            double numeroAleatorio4 = Math.random() * 60;
            double numeroAleatorio5 = Math.random() * 60;
            double numeroAleatorio6 = Math.random() * 60;



            System.out.println("Nº: " + Math.round(numeroAleatorio1));
            System.out.println("Nº: " + Math.round(numeroAleatorio2));
            System.out.println("Nº: " + Math.round(numeroAleatorio3));
            System.out.println("Nº: " + Math.round(numeroAleatorio4));
            System.out.println("Nº: " + Math.round(numeroAleatorio5));
            System.out.println("Nº: " + Math.round(numeroAleatorio6));

        }

    }


}







