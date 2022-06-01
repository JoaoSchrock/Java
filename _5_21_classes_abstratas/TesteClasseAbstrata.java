package _5_21_classes_abstratas;

public class TesteClasseAbstrata {
    public static void main(String[] args) {
        Produto p = new ProdutoPerecivel();
        p.descricao = "Caixa de Leite";
        ProdutoPerecivel pp  = (ProdutoPerecivel) p;
        pp.dataValidade = "10/07/22";
        p.imprimirDescricao();
    }
}
