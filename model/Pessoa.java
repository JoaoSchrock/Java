package model;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private static final long serialVersionID = 1L;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    private String nome;
    private int Idade;
    private String profissao;



}
