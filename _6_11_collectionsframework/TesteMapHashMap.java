package _6_11_collectionsframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TesteMapHashMap {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("joão");
        Aluno a2 = new Aluno("Maria");
        Aluno a3  = new Aluno("jose");
        Aluno a4 = new Aluno("Pedro");

        Map<String,Aluno> alunos = new HashMap<>();

        alunos.put("1", a1);
        alunos.put("2", a2);
        alunos.put("3", a3);
        alunos.put("4", a4);
        alunos.put("5", a4);//Aqui ja pode repetir

        imprimirAlunos(alunos);

        Aluno alunoRecuperado = alunos.get("3");
        System.out.println("Aluno de chave 3: " + alunoRecuperado.getNome());

    }

    private static void imprimirAlunos(Map<String, Aluno> alunos) {
        for(Aluno a : alunos.values()){
            System.out.println("Nome: " + a.getNome());
        }
    }
}
