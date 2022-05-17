package enumeracoes_5_12;

public class Carta {

    private int numero;
    private Naipe naipe;

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }
    public void imprimircarta(){
        System.out.println("Sou " + numero + " de " + naipe +". E tenho a cor " + naipe.getCor());
    }
}
