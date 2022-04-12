import java.util.Scanner;

public class Exercicio7 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("DOBRO DA ÁREA DO QUADRADO");

            System.out.println("--------------------------");

            System.out.print("Digite a Area do Quadrado:" + "\n");

            Double Lado = scanner.nextDouble();

            Double area = Lado * Lado;
            int dobro = 2;
            Double areaAoQuadrado = area * dobro;

            System.out.println("--------------------------");

            System.out.print(" O dobro da área foi: " + "\n" + "=" + " " + areaAoQuadrado + "\n");
            scanner.close();

            System.out.println("--------------------------");


        }
    }


