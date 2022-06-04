package DesafioInterfaceePolimorfismo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja ver nossos Produtos?\n1 - SIM\n2 - NAO");
        String desejoDoUsuario = scanner.nextLine();

        if(desejoDoUsuario == "1"){
            System.out.println("___Corretora Schrock___");
            Carro carro = new Carro();
            System.out.println("( INFORMACOES DO CARRO )");
            carro.obterDescricao();
            carro.calcularValorApolice();

            Imovel imovel = new Imovel();
            System.out.println("( INFORMAÇOES DA CASA )");
            imovel.obterDescricao();
            imovel.calcularValorApolice();

            Barco barco = new Barco();
            System.out.println("( INFORMACOES DO BARCO )");
            barco.obterDescricao();
            barco.calcularValorApolice();

            Notebook notebook = new Notebook();
            System.out.println("( INFORMACOES DO NOTEBOOK )");
            notebook.obterDescricao();
            barco.calcularValorApolice();

            CorretoraSeguros corretoraSeguros = new CorretoraSeguros();
            corretoraSeguros.fazerPropostaSeguro(corretoraSeguros);
        }else if(desejoDoUsuario == "2"){
            System.out.println("Obrigado Por sua resposta! Até mais.");
        }
    }

}
