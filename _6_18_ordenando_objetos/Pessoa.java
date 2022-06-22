package _6_18_ordenando_objetos;

import java.util.Objects;
public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {// construtor: Cria o Objeto
        this.nome = nome;
        this.idade = idade;
    }


    @Override
    public boolean equals(Object o) {// Ele compara Objetos
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return nome.compareTo(pessoa.getNome());
    }

    @Override
    public String toString() {// to String converte o objeto em cadeia
        return "Pessoa {" +
                "nome ='" + nome + '\'' +
                ", idade =" + idade +
                '}';
    }
}


