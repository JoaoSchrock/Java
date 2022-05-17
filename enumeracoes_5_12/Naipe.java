package enumeracoes_5_12;

public enum Naipe {


    OURO("Vermelha"),

    PAUS("Preta"),

    ESPADA("Preta"),

    COPAS("Vermelha");

    private String cor;

    Naipe(String cor) {
        this.cor = cor;
    }
    public  String getCor(){
        return cor;
    }
}
