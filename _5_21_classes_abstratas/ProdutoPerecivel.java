package _5_21_classes_abstratas;

public class ProdutoPerecivel extends Produto{
   String dataValidade;

    @Override //Sobre_Escrita
    public void imprimirDescricao() {
        System.out.println("Descrição: " + super.getDescricao() + ",Vencendo em: " + dataValidade);
    }
}
