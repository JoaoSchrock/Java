package _6_11_collectionsframework;

import java.util.ArrayList;
import java.util.List;

public class TesteListArrayList {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("joão");
        Aluno a2 = new Aluno("Maria");
        Aluno a3  = new Aluno("jose");
        Aluno a4 = new Aluno("Pedro");

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a4);//Aqui podemos utilizar dois iguais

        imprimirAlunos(alunos);


    }

    private static void imprimirAlunos(List<Aluno> alunos) {
        for(Aluno a : alunos){
            System.out.println("Nome: " + a.getNome());
        }
    }
}
