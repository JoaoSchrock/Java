import org.codehaus.groovy.transform.SourceURIASTTransformation;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SEU PESO IDEAL");

        System.out.println("-----------------------");

        System.out.println(" Digite sua Altura:");

        double altura = sc.nextDouble();

        int peso = (int) (( 72.7 * altura) - 58);

        System.out.println("-----------------------");

        System.out.println("Seu peso ideal é:" + " \n " + " = " + peso + " Kg ");

        System.out.println("-----------------------");

        sc.close();
    }
}
