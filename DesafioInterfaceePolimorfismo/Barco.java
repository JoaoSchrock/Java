package DesafioInterfaceePolimorfismo;

import java.util.Scanner;

public class Barco implements Seguravel{

    public String Tipo = "Lancha";
    public String Ano = "2015";
    public String Modelo = "Fibraforte";
    public long Valor = 125000L;



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
        long Calculo = (Valor + 101000L);
        System.out.println("Calculo Apolice: " + Calculo);

    }
    public void imprimir(){
        System.out.println("==================================");
    }
}
