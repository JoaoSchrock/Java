import java.util.Scanner;

public class Exercicio01Calculadora {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        double primeiroNumero = scanner.nextDouble();
        System.out.println("Escolha sua operacão Matemática:");
        System.out.println("[ - |  + ] " +
                "         \n[ * |  / ]");

        char operacao = scanner.next().charAt(0);

        System.out.println("Digite o segundo numero");
        double segundoNumero = scanner.nextDouble();

        Double resultado = null;

        if(operacao == '-'){
            resultado = primeiroNumero - segundoNumero;
        }
        if(operacao == '+'){
            resultado = primeiroNumero + segundoNumero;
        }
        if(operacao == '*'){
            resultado = primeiroNumero * segundoNumero;
        }
        if(operacao == '/'){
            resultado = primeiroNumero / segundoNumero;
        }
        System.out.println("Seu resulado foi:" + resultado);
        scanner.close();

    }
}
