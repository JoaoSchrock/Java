import java.util.Scanner;

public class Exercicio8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("No mês quantas horas você trabalha?: ");
            double horasDeTrabalho = scanner.nextDouble();

            System.out.println("-----------------------------------");

            System.out.print("Quanto você recebe por hora?: ");
            double salariorecebidoPorHora = scanner.nextDouble();

            System.out.println("-----------------------------------");

            byte salario = (byte) (horasDeTrabalho * salariorecebidoPorHora);
            System.out.print("Seu salario é de: " + salario + " Reais " + "\n");
            scanner.close();
        }


    }



