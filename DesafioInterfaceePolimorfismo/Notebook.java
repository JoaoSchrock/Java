package DesafioInterfaceePolimorfismo;

import java.util.Scanner;

public class Notebook implements Seguravel{

    public String Tipo = "Nootebook";
    public String Marca = "DEEL";
    public int Valor = (int) 12.000;
    public String RAM = "4G RAM";



    @Override
    public void obterDescricao() {
        System.out.println("Tipo: " + Tipo);
        System.out.println("Marca: " + Marca);
        System.out.println("Valor: " + Valor);
        System.out.println("RAM: " + RAM);
        calcularValorApolice();

    }

    @Override
    public void calcularValorApolice() {
        Scanner s  = new Scanner(System.in);
        int Calculo = (int) (Valor + 103.000);
        System.out.println("Calculo Apolice: " + Calculo);

    }
}
