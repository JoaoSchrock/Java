import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" digite o primeiro numero");
        double PrimeiroNumero = sc.nextDouble();
        System.out.println(" Digite o segundo numero");
        double SegundoNumero = sc.nextDouble();
        System.out.println(" Seus numeros são:" + "\n" + PrimeiroNumero + "\n" + SegundoNumero);

        int soma = (int) (PrimeiroNumero + SegundoNumero);
        System.out.println(" Seu resultado foi:" + " " + soma);
    }
}
