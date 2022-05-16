package Desafio_Static_e_Final;

public class MatematicaUtil {
    public static final double PI = 3.14;

    public static int calcularFibonacci(int posicao) {
        if (posicao < 2) {
            return posicao;
        }
        return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
    }

    public static double calcularAreaDoCirculo(double raio) {
        raio = raio * raio * MatematicaUtil.PI;
        return raio;
    }
}

