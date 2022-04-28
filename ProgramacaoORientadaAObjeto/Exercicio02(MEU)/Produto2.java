package ProgramacaoOrientadaAObjeto.Exercicio2;

public class Produto2 {
    static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;// Essa não é uma variável e sim, uma constante.
    String nome;
    Integer quantidadeEstoque;

    Boolean eNecessarioReporEstoque() {
        if (quantidadeEstoque < Produto2.QUANTIDADE_MINIMA_ESTOQUE) {
            return true;
        }
        return false;
    }

