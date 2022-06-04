package DesafioInterfaceePolimorfismo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CorretoraSeguros corretoraSeguros = new CorretoraSeguros();
        corretoraSeguros.fazerPropostaSeguro(corretoraSeguros);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja ver nossos Produtos?\n1 - SIM\n2 - NAO");
        System.out.print("-> ");
        int desejoDoUsuario = scanner.nextInt();

        if(desejoDoUsuario == 1){
            System.out.println("___ SCHROCK ___");
            Carro carro = new Carro();
            System.out.println("( INFORMACOES DO CARRO )\n");
            carro.obterDescricao();

            Imovel imovel = new Imovel();
            System.out.println("( INFORMAÇOES DA CASA )\n");
            imovel.obterDescricao();

            Barco barco = new Barco();
            System.out.println("( INFORMACOES DO BARCO )\n");
            barco.obterDescricao();

            Notebook notebook = new Notebook();
            System.out.println("( INFORMACOES DO NOTEBOOK )\n");
            notebook.obterDescricao();

        }
        else if(desejoDoUsuario == 2){
            System.out.println("Obrigado Por sua resposta! Até mais.");
        }
    }

}
