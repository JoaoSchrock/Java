package _6_4_tratando_e_lancando_excecoes;

public class TesteExcecoesChecadas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(100);

        try {
            cc.sacar(60);
        }catch (SaldoInsuficienteException e){
            System.out.println("Desculpe, saldo insuficiente.");
        }
        System.out.println("Saldo: " + cc.getSaldo());

    try {
        cc.sacar(50);
    }catch (SaldoInsuficienteException e){
        System.out.println("Desculpe, saldo insuficiente");
    }
    finally {
        System.out.println("obrigado por utilizar nosso sistema!");
    }
        System.out.println("Saldo agora: " + cc.getSaldo());

    }
}
