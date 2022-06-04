package DesafioInterfaceePolimorfismo;

public class  Carro implements Seguravel {

    public String Marca = "Porche";
    public String Ano = "2022";
    public String Modelo = "Cayenne";
    public String Valor = "R$ 549.000";



    @Override
    public void obterDescricao() {
        System.out.println("Marca: " + Marca);
        System.out.println("Ano: " + Ano);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Valor: " + Valor);
        imprimir();
    }

    @Override
    public void calcularValorApolice() {
        int calculo = Integer.parseInt(Valor + 100);

    }
    public void imprimir(){
        System.out.println("==================================");
    }

}
