package litrosPorDia;

import jdk.swing.interop.SwingInterOpUtils;

import java.awt.*;
import java.util.Scanner;

public class LitrosPorDia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" CALCULO LITROS DE AGUA P/ DIA");

        System.out.println(" Digite seu PESO ( em KG):");

        byte PESO = scanner.nextByte();

        int consumo = -PESO ;Object multiplicaçao;

        int total = ( PESO * (35));

        System.out.println(" Deve-se Beber: " + total);


        scanner.close();












    }




}
