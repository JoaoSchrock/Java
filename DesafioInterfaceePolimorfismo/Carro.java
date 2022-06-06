package DesafioInterfaceePolimorfismo;

import java.util.Scanner;

public class  Carro implements Seguravel {

    public String Marca = "Porche";
    public String Ano = "2022";
    public String Modelo = "Cayenne";
    public long Valor = 549000L;



    @Override
    public void obterDescricao() {
        System.out.println("Marca: " + Marca);
        System.out.println("Ano: " + Ano);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Valor: " + Valor);
        calcularValorApolice();
        imprimir();
    }

    @Override
    public void calcularValorApolice() {
        Scanner s  = new Scanner(System.in);
        long Calculo = (Valor + 100000L);
        System.out.println("Calculo Apolice: " + Calculo);

    }
    public void imprimir(){
        System.out.println("==================================");
    }

}
