//Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
// Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      char matutino = ( 'M' | 'm');
      char vespertino = ( 'V' | 'v');
      char noturno = ( 'N' | 'n');

      System.out.println("Qual turno você estuda?");
        System.out.println(" (M) Matutino \n (V) vespetino \n (N) noturno");
        System.out.println("DIGITE:");
        char turno = scanner.next().charAt(0);


        if (turno == matutino ){
            System.out.println("Bom dia!!!");

        } else if (turno == vespertino){
            System.out.println("Boa tarde!!!");

        } else if (turno == noturno) {
            System.out.println("Boa noite!!!");

        } else {
            System.out.println("valor invalido!");
        }


        }
    }

