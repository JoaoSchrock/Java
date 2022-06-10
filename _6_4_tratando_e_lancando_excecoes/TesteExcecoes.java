package _6_4_tratando_e_lancando_excecoes;

public class TesteExcecoes {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(100);

        try {
            cc.depositar(-10);
        }catch (IllegalArgumentException e){
            System.out.println("Voce executou uma operecao ilegal: " + e.getMessage());
        }
    }
}
