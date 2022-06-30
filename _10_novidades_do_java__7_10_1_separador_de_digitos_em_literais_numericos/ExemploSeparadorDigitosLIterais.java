package _10_novidades_do_java__7_10_1_separador_de_digitos_em_literais_numericos;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class ExemploSeparadorDigitosLIterais {
    public static void main(String[] args) {
        long populacaoSaoPaulo = 11_000_000L;
        long populacaoGrandeSaoPaulo = 11_000_000 + 9_000_000;

        System.out.printf("População São Paulo: %d\n", populacaoSaoPaulo);
        System.out.printf("Populacao Grande São Paulo: %d\n",populacaoGrandeSaoPaulo);

        double precoVeiculo = 200_000_99_1d;
        System.out.printf("Preco veiculo: %.3f\n",precoVeiculo);

        //Evitar usar assim:
        int x = 1___2___3;
        int y = 1_2_3;
        System.out.printf("São iguais: %b\n", (x == y));
    }
}
