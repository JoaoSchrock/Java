package com.company.Metodo;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EuamoJava(0,"Eu amo Java");
    }

    static void EuamoJava(Integer repedidos, String palavra) {
        if (++repedidos <= 10) {
            System.out.println((repedidos) + " Eu amo Java");
            EuamoJava(repedidos, palavra);
        }
    }
}

