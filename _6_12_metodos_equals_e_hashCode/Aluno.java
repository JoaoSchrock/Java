package com.company.orientacao_a_objetos._6_topicos_avancados._6_12_metodos_equals_e_hashCode;

import java.util.Objects;

public class Aluno {

    private String nome;
    private int idade;

    public Aluno(String nome) {
        this.nome = nome;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno that = (Aluno) o;
        return idade == that.idade && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }
}
