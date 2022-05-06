package com.company.orientacao_a_objetos_parte1.arrays.exercicio;

/*

Uma pequena empresa atacadista com sede na cidade de Uberlândia precisa conferir seu estoque de produtos, para isso, surgiu a ideia de desenvolver um programa para os estoquistas digitarem os nomes dos produtos e as quantidades.

Ao final da contagem, o programa deve mostrar na tela uma lista com todos os produtos digitados, assim os usuários podem enviar o resultado para uma impressora ou gravar em algum arquivo, como quiserem.

Você, programador que está ficando bem conhecido no país pelas habilidades em Java, foi chamado para desenvolver esse software.

1. A primeira classe que vem em nossa cabeça no domínio desse problema é a classe Produto, por isso vamos começar criando ela:
Além dos atributos "descricao" e "quantidade" na classe Produto, temos também um método "descrever", que quando chamado, exibirá na tela a descrição e quantidade de itens do produto em questão.

2. Agora que já temos uma classe Produto, precisamos pensar em algo para armazenar a lista de todos os produtos informados. Isso parece muito com um estoque, não é? Então criamos a classe Estoque com um atributo do tipo array de produtos.
Além do atributo "produtos", criamos também um método "listarProdutos", que percorrerá o array de produtos e mostrará na tela item por item.

3. Já temos as classes Produto e Estoque e parece que estamos no caminho certo, mas ainda não temos nenhuma classe para pegar a entrada do teclado do usuário, instanciar produtos e adiciona-los ao array. Vamos criar uma classe chamada Principal que faz isso.
Pronto! Mais um cliente satisfeito. Se quiser melhorar ainda mais o programa e fazer uma graça para o cliente, calcule a quantidade total de produtos no estoque e mostre no final da execução


 */

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos produtos?");
        int quantidadeProdutos = scanner.nextInt();
        scanner.nextLine();
        Estoque estoque = new Estoque();
        estoque.produtos = new Produto[quantidadeProdutos];
        for (int i = 0; i < estoque.produtos.length; i++) {
            estoque.produtos[i] = new Produto();
            System.out.println("\nProduto " + i);
            System.out.println("--------------");
            System.out.println("Descricao");
            estoque.produtos[i].descricao = scanner.nextLine();
            System.out.println("Quantidade de itens:");
            estoque.produtos[i].quantidade = scanner.nextInt();
            scanner.nextLine();
        }
        estoque.listarProdutos();
    }
}









