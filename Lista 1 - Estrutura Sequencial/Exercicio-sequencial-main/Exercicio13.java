import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) throws java.io.IOException {
        Scanner ler = new Scanner(System.in);

        char sexo;
        double altura;

        float peso;

        System.out.println("NOS INFORME SEU SEXO COM (M) ou (F)");
        System.out.printf(" Digite:");
        sexo = (char)System.in.read();

        System.out.println("-------------------------------------");

        System.out.println("PARA COMPLETAR DIGITE SUA ALTURA");
        System.out.printf("Digite: ");
        altura = ler.nextDouble();

        System.out.println("-------------------------------------");


        if      ((sexo == 'M')
                      ||
                (sexo == 'm'))

            peso = (float) ((72.7 * altura) - 58);
        else
            peso = (float) ((62.1 * altura) - 44.7);


        System.out.println("RESULTADO:");

        System.out.printf("\n" + "Peso Ideal = " + peso + "\n");

        System.out.println("-------------------------------------");



    }

}

