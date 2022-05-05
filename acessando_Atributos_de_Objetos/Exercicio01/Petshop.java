/*
instanciando e acessando atributos do objeto
Utilizando o Eclipse, vamos fazer este primeiro exercícios sobre Orientação a Objetos. Fique a vontade para criar outro
projeto ou utilizar um existente.
Um pet shop te chamou para ajudar no controle dos animais que eles cuidam. Eles irão precisar de muitos serviços, o
primeiro é mapear qual o nome, raça, sexo (macho ou fêmea) e idade.
1. Crie uma classe chamada "Cachorro" e adicione os atributos para nome, raça, sexo e idade.
public class Cachorro {
	String nome;
	String raca;
	char sexo;
	int idade;
}
2. Crie uma outra classe chamada "PetShop" para testarmos nossa classe "Cachorro". Adicione o método "main".
public class PetShop {
	public static void main(String[] args) {
	}
}
3. Agora vamos instanciar um objeto do tipo "Cachorro". Dentro do método "main" utilize a palavra-chave "new" para
criar o objeto.
...
Cachorro cachorro = new Cachorro();
4. Agora que temos um objeto do tipo "Cachorro", vamos definir os atributos dele.
...
cachorro.nome = "Bidu";
cachorro.idade = 1;
cachorro.raca = "Boxer";
cachorro.sexo = 'M';
5. Para mostrar na saída os valores deste objeto, vamos utilizar o código abaixo.
System.out.println("Nome: " + cachorro.nome);
System.out.println("Idade: " + cachorro.idade);
System.out.println("Raça: " + cachorro.raca);
System.out.println("Sexo: " + cachorro.sexo);
6. Execute o programa e veja o resultado na saída do console. Arrisque um pouco, crie outro objeto do tipo "Cachorro" e
tente perceber que são objetos diferentes criados a partir de uma única classe.
 */
package acessando_Atributos_de_Objetos.Exercicio01;

import java.util.Scanner;

public class Petshop {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.nomeDoDog = "Schrock";
        cachorro.idadeDoDog = "6 Anos";
        cachorro.racaDoDog = "Pitbull de Raça";
        cachorro.sexoDoDog = "Macho";


        System.out.println("_INDENTIDADE CANINA DO MEU DOG_");
        imprimirLinha();
        System.out.println("Nome: " + cachorro.nomeDoDog);
        System.out.println("Idade: " + cachorro.idadeDoDog);
        System.out.println("Raça: " + cachorro.racaDoDog);
        System.out.println("Sexo: " + cachorro.sexoDoDog);
        imprimirLinha();
        TituloDoUsuario();
        Usuario();


    }

    static void imprimirLinha() {
        System.out.println("--------------------------");
    }

    static void Usuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome: ");
        String nomeDoDogUsuario = scanner.next();
        System.out.println("Raça: ");
        String racaDoDogUsuario = scanner.next();
        System.out.println("Sexo: ");
        String sexoDoDogUsuario = scanner.next();
        System.out.println("Idade: ");
        String idadeDoDogUsuario = scanner.next();
        imprimirLinha();
        fimDeDadosCanino();
        imprimirLinha();
        System.out.println("Nome: " + nomeDoDogUsuario);
        System.out.println("Raça: " + racaDoDogUsuario);
        System.out.println("Sexo: " + sexoDoDogUsuario);
        System.out.println("idade: " + idadeDoDogUsuario);
        pequenoDetalhe();

    }

    static void TituloDoUsuario() {
        System.out.println("AGORA NOS DIGA SOBRE O SEU DOG");
        imprimirLinha();
    }

    static void fimDeDadosCanino() {
        System.out.println("INFORMAÇOES DO SEU DOG");
    }
    static void pequenoDetalhe(){
        System.err.println("MEU CÃO É MAIS BONITO!");
    }
}

