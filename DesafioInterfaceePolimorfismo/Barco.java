package DesafioInterfaceePolimorfismo;

import java.util.Scanner;

public class Barco implements Seguravel{

    public String Tipo = "Lancha";
    public String Ano = "2015";
    public String Modelo = "Fibraforte";
    public int Valor = (int) 125.000;



    @Override
    public void obterDescricao() {
        System.out.println("Tipo: " + Tipo);
        System.out.println("Ano: " + Ano);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Valor: " + Valor);
        calcularValorApolice();
        imprimir();

    }

    @Override
    public void calcularValorApolice() {
        Scanner s  = new Scanner(System.in);
        int Calculo = (int) (Valor + 101.000);
        System.out.println("Calculo Apolice: " + Calculo);

    }
    public void imprimir(){
        System.out.println("==================================");
    }
}
