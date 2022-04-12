import java.util.Scanner;

public class Exercicio10 {
        public static void main(String[] args) {

            System.out.println(" CELSIUS PARA FAHRENHEIT");
            Scanner sc = new Scanner(System.in);

            System.out.println(" Digite um numero em Celsius: ");

            double Celsius = sc.nextDouble();

            double Fahrenheit = ( Celsius * 9/5) + 32;

            System.out.println("-------------------------------");

            System.out.println(" Sua conversão foi:" +" \n " + " = "  + " " + Fahrenheit + " °F ");

            sc.close();

            System.out.println("-------------------------------");
        }
    }

