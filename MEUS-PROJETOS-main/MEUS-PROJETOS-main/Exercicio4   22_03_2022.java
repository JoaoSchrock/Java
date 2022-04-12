import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota1, nota2, nota3, nota4;
        int media, i, contAluno = 0;


        contAluno++;


           System.out.println(" Digite sua 1° nota ");
            nota1 = sc.nextInt();

            System.out.println(" Digite sua 2° nota ");
            nota2 = sc.nextInt();

            System.out.println(" Digite sua 3° nota ");
            nota3 = sc.nextInt();

            System.out.println(" Digite sua 4° nota ");
            nota4 = sc.nextInt();

            media = (nota1 + nota2 + nota3 + nota4 )/4;
            System.out.println(" Sua média Bimestral foi:" + " " + media);
        }
    }

