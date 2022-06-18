package com.company.orientacao_a_objetos._6_topicos_avancados._6_12_metodos_equals_e_hashCode;

import java.util.Set;

public class TesteSetHashSet2 {

    public static void main(String[] args) {
        Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos();

        //De alguma forma, sorteia o nome de aluno e constrói o objeto Aluno
        Aluno alunoSorteado = new Aluno("Maria");

        if (alunos.contains(alunoSorteado)){
            System.out.println("Parabéns " + alunoSorteado.getNome() + "! Você ganhou um brinde!");
        } else {
            System.out.println("Aluno não cadastrado no banco de dados");
        }
    }
}
