package DesafioInterfaceePolimorfismo;

import java.util.Scanner;

public class Imovel implements Seguravel {

    public String nivelBairro = "Exelente";
    public int Valor = (int) 100.000;
    public String Localidade = "Nova Almeida";
    public String Quartos = "5 Quartos";
    public String Banheiros = "5 Banheiros";
    public String Andares = "2 Andares";
    public String Tipo = "Casa";


    @Override
    public void obterDescricao() {
        System.out.println("Tipo: " + Tipo);
        System.out.println("Valor: " + Valor);
        System.out.println("Localidade: " + Localidade);
        System.out.println("Quartos: " + Quartos);
        System.out.println("Banheiro: " + Banheiros);
        System.out.println("Andares: " + Andares);
        System.out.println("Nivel do Bairro: " + nivelBairro);
        calcularValorApolice();
        imprimir();

    }

    @Override
    public void calcularValorApolice() {
        Scanner s  = new Scanner(System.in);
        int Calculo = (int) (Valor + 102.000);
        System.out.println("Calculo Apolice: " + Calculo);

    }
    public void imprimir(){
        System.out.println("==================================");
    }


}
