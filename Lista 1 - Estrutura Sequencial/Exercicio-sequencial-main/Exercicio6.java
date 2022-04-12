import java.util.Scanner;

public class Exercicio6 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("DITÂNCIA ENTRE A BORDA DO CIRCULO E SEU CENTRO");


            System.out.println("-----------------------------------------------");


            System.out.print("Digite o raio do Circulo:" + "\n");

            Double raio = scanner.nextDouble();
            Double raioAoQuadrado = raio * raio;
            Double pi = 3.14;
            Double area = raioAoQuadrado * pi;

            System.out.println("-----------------------------------------------");

            System.out.println(" A Área do Circulo foi: " + area + "cm");

            scanner.close();

            System.out.println("-----------------------------------------------");
        }
    }


