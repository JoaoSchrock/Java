/*
Refatore este código alterando o método estático para um método de instância.
 */
package ProgramacaoOrientadaAObjeto.Exercicio2;

/*
Refatore este código alterando o método estático para um método de instância.
 */

public class Exercicio02 {
    public static void main(String[] args) {
        Produto2 produto2 = new Produto2();
        produto2.nome = "Xiaome Earbuds Airdots S";
        produto2.quantidadeEstoque = 10;
        System.out.println("Há necessidade de ressarcir o estoque do produto " + produto2.nome + "? " + produto2.eNecessarioReporEstoque());
    }

}


