import java.util.Scanner;

public class Exercicio9 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("GRAUS FAHRENHEIT PARA CELSIUS");
            System.out.print("Digite seu numero em fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            double celsius = (fahrenheit - 32) * 5/9;

            System.out.println("-------------------------------");

            System.out.print("Sua conversão para celsius foi: " + "\n " + " = " + celsius + " °C " + "\n");
            scanner.close();
            System.out.println("-------------------------------");
        }
    }

