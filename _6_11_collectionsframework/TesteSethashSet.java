package _6_11_collectionsframework;

import java.util.HashSet;
import java.util.Set;

public class TesteSethashSet {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("joão");
        Aluno a2 = new Aluno("Maria");
        Aluno a3  = new Aluno("jose");
        Aluno a4 = new Aluno("Pedro");


        Set<Aluno> alunos = new HashSet<>();

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a4);//ja aqui roda o codigo, mas nao e bom colocar dois iguais.

        imprimirAlunos(alunos);

    }

    private static void imprimirAlunos(Set<Aluno> alunos) {
        for(Aluno a : alunos){
            System.out.println("Nome: " + a.getNome());
        }
    }
}
