package _6_topcos_avancados_6_2_classe_java_lang__math;

import static  java.lang.Math.PI;
import static java.lang.Math.max;

public class TesteClasseMath {
    public static void main(String[] args) {
         int raio = 4;
         double comprimento = 2 * raio * PI;
        System.out.println("comprimento: " + comprimento);

        //Maximo e Minimo
        double[] precoProdutoA = {30,20,25.49};
        double maioPreco = max(precoProdutoA[0], precoProdutoA[1]);
        System.out.println("Maior Preço: " + maioPreco);
        System.out.println("Menor Preço: " + Math.min(precoProdutoA[0], precoProdutoA[1]));

        //Potência
        System.out.println("2³: " + Math.pow(2, 3));

        //Raiz Quadrada
        System.out.println("Raiz de √9: " + Math.sqrt(9));


        //Arredondamento ceil, floor e round
        double n = 5.4;
        System.out.println("Menor Inteiro: " + Math.floor(n));
        System.out.println("Maior inteiro: " + Math.ceil(n));
        System.out.println("Arredondamento: " + Math.round(n));

        //Trigonometria
        System.out.println("Seno: " + Math.sin(40));

        //Numeros Randomicos
        double numeroAleatorio = Math.random() * 100;
        System.out.println("Numero Aleatorio: " + numeroAleatorio);

        //
    }
}
