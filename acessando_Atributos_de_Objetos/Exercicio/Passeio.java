package acessando_Atributos_de_Objetos.composicaoObjetos.Exercicio;

public class Passeio {
    public static void main(String[] args) {
        DadosDoIndividuo aDadosPessoais = new DadosDoIndividuo();
        aDadosPessoais.nomePessoa = "Carla";
        aDadosPessoais.nomeCachorro = "Dog";

        System.out.println(aDadosPessoais.nomePessoa + " Estava passeando com " + aDadosPessoais.nomeCachorro);
    }
}
