package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_24_exercicio_interface_e_polimorfismo;
/*
Seu tio tem uma corretora de seguros e precisa de um sistema para calcular o valores de apólices para facilitar o processo de venda de seguros.

No momento, a corretora trabalha apenas com seguros de carros e imóveis, mas em breve serão adicionados outros tipos de contratos de seguros. Essa informação é muito importante, pois o software deve ter a capacidade de receber novos tipos de seguros facilmente, como por exemplo, notebook, barcos, aeronaves, etc.

Cada tipo de apólice possui uma fórmula diferente para calcular seu valor. Uma apólice de imóvel é calculada diferente de uma de um carro.

Usando interfaces e polimorfismo, precisamos desenvolver algo simples e inteligente para resolver o problema do tiozão.

1. Vamos criar uma interface chamada Seguravel.
A interface Seguravel deve ser implementada por classes que representam objetos que podem ser assegurados. Essas classes devem implementar os métodos da interface.

2. Agora criamos a classe Carro, que implementa a interface Seguravel, pois a corretora está apta a vender seguros para carros.

3. Se Carro diz que implementa a interface Seguravel, ela deve implementar todos os métodos especificados na interface, pois uma interface é um contrato, ou seja, a classe deve garantir que faz o que ela pede.
No código, incluímos os métodos obterDescricao() e calcularValorApolice(), além de dois atributos e um construtor. Os atributos são usados pelos métodos para calcular o valor da apólice e retornar a descrição do carro.

4. Criamos a classe Imovel e implementamos os métodos da interface. Veja que a fórmula do cálculo do seguro é diferente, além de essa classe possuir atributos também diferentes.
As fórmulas para calcular os valores das apólices são meramente fictícias. Claro que, na realidade, as fórmulas são totalmente diferentes e mais complexas.

5. Agora que já temos as classes que implementam a interface Seguravel, vamos criar uma outra classe chamada CorretoraSeguros. Ela será responsável por fazer a proposta de seguro do bem segurável e mostrar na tela.
Veja que o método fazerPropostaSeguro() recebe como parâmetro um objeto do tipo Seguravel, ou seja, pode ser um Carro ou um Imovel, mas no futuro poderia receber também uma Aeronave ou Barco, desde que essas classes implementem a interface Seguravel.

6. Para testar tudo que foi feito, vamos criar uma classe chamada Principal, que possui o método main().
No método main(), instanciamos uma corretora de seguros, um carro e um imóvel, depois chamamos o método fazerPropostaSeguro() da corretora passando como parâmetro o carro e depois o imóvel.

7. Compile tudo e execute a classe Principal.

8. Quando tudo estiver funcionando, crie uma classe chamada Barco e outra chamada Notebook. As duas classes devem implementar a interface Seguravel. Implemente os métodos da interface e adicione algumas linhas na classe Principal para testar as novas classes.

 */
public class Principal {

    public static void main(String[] args) {
        CorretoraSeguros corretora = new CorretoraSeguros();
        Carro meuCarro = new Carro(45000d, 2012);
        Imovel minhaCasa = new Imovel(920000, 320);
        corretora.fazerPropostaSeguro(meuCarro);
        corretora.fazerPropostaSeguro(minhaCasa);
    }

}
