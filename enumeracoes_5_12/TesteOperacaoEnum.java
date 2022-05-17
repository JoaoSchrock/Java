package enumeracoes_5_12;

public class TesteOperacaoEnum {
    public static void main(String[] args) {
        OperacoesAritmetica o1 = OperacoesAritmetica.ADICAO;
        int resultado1 = o1.operacao(5 ,3);
        System.out.println("O resultado Adicao é: " + resultado1);

        OperacoesAritmetica o2 = OperacoesAritmetica.SUBTRACAO;
        int resultado2 = o2.operacao(5,3);
        System.out.println("O resultado Subtracao é: " + resultado2);

    }
}
