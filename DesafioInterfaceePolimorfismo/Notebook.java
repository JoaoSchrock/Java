package DesafioInterfaceePolimorfismo;

public class Notebook implements Seguravel{

    public String Tipo = "Nootebook";
    public String Marca = "DEEL";
    public String Valor = "12.000";
    public String RAM = "4G RAM";



    @Override
    public void obterDescricao() {
        System.out.println("Tipo: " + Tipo);
        System.out.println("Marca: " + Marca);
        System.out.println("Valor: " + Valor);
        System.out.println("RAM: " + RAM);

    }

    @Override
    public void calcularValorApolice() {
        int calculo = Integer.parseInt(Valor + 520);

    }
}
