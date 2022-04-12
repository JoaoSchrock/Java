import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.println(" DIGITE ABAIXO DOIS NUMEROS INTEIROS ");

        System.out.println(" Digite o Primeiro N°:");

        int PrimeiroNumero = sc.nextInt();

        System.out.println(" Digite o Segundo N°:");

        int SegundoNumero = sc.nextInt();



        System.out.println("___________________________________________________________________");


        System.out.println(" LOGO ABAIXO DIGITE UM N° REAL:");

        System.out.println(" DIgite o N°:");
        double NumeroReal = sc.nextDouble();
        double quadrado = NumeroReal * NumeroReal * NumeroReal;
        System.out.println(" seu resultado ao quadrado foi: " + "\n"+ " = " + quadrado);





        System.out.println("___________________________________________________________________");


        System.out.println(" O DOBRO DO PRIMERO COM A METADE DO SEGUNDO");

        int Dobro = (int) (PrimeiroNumero * 2);
        int metade = (int) (SegundoNumero / 2);

        System.out.println(" Seu resultado foi:" + " " + Dobro * metade);


        System.out.println("___________________________________________________________________");


        System.out.println(" TRIPLO DO PRIMEIRO COM O TERCEIRO ");

        int Triplo = (int) (PrimeiroNumero * 3);
        System.out.println(" Seu resultado foi: " + Triplo * NumeroReal);




    }
}