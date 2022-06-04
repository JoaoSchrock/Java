package DesafioInterfaceePolimorfismo;

public class Barco implements Seguravel{

    public String Tipo = "Lancha";
    public String Ano = "2015";
    public String Modelo = "Fibraforte";
    public String Valor = "R$ 12.000.000.000.00";



    @Override
    public void obterDescricao() {
        System.out.println("Tipo: " + Tipo);
        System.out.println("Ano: " + Ano);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Valor: " + Valor);
        imprimir();

    }

    @Override
    public void calcularValorApolice() {
        int calculo = Integer.parseInt(Valor + 200);

    }
    public void imprimir(){
        System.out.println("==================================");
    }
}
