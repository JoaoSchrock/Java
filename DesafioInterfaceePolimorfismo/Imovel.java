package DesafioInterfaceePolimorfismo;

public class Imovel implements Seguravel {

    public String nivelBairro = "Exelente";
    public String Valor = "100,000";
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
        imprimir();

    }

    @Override
    public void calcularValorApolice() {
        int calculo = Integer.parseInt(Valor + 320);

    }
    public void imprimir(){
        System.out.println("==================================");
    }


}
