package acessando_Atributos_de_Objetos;

public class Principal {
    public static void main(String[] args) {
         Carro meuCarro = new Carro();
        meuCarro.fabricante = "BMW";
        meuCarro.modelo = "BMW X5";
        meuCarro.anoDeFabricacao = "2006";
        meuCarro.cor = "Branco";

        Carro seuCarro = new Carro();
        seuCarro.fabricante = "Mercedes Bens";
        seuCarro.modelo = "MERCEDES-BENZ A 200.";
        seuCarro.anoDeFabricacao = "2012/2013";
        seuCarro.cor = "Prata";

        System.out.println("Meu carro");
        System.out.println("--------------------------");
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.anoDeFabricacao);

        System.out.println();
        System.out.println("Seu carro");
        System.out.println("--------------------------");
        System.out.println("Modelo: " + seuCarro.modelo);
        System.out.println("Ano: " + seuCarro.anoDeFabricacao);
    }
}
