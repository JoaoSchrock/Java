package OrientacaoAobjetoParte2;

public class Pessoa {

    String nome;
    int idade;
    String cpf;


    public Pessoa(String nome) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade) {
        this(nome);
        this.idade = idade;
    }

    public Pessoa(String nome, int idade , String cpf) {
        this.cpf = cpf;
    }
}
