package _7_11_intruducao_a_generics;

public class TesteGaveta {

    public static void main(String[] args) {
        //DEFININDO LISTA DO TIPO STRING
        Gaveta<String> gaveta = new Gaveta<>();
        gaveta.colocar("Livro de java");
        System.out.println(gaveta.retirarPrimeiro());

        //DEFININDO LISTA DO TIPO INTEGER
        Gaveta<Integer> gavetaNumeros = new Gaveta<>();
        gavetaNumeros.colocar(8);
        System.out.println(gavetaNumeros.retirarPrimeiro() + 2);

    }
}
