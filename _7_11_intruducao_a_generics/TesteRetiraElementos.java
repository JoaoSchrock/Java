package _7_11_intruducao_a_generics;

import java.util.ArrayList;
import java.util.List;

public class TesteRetiraElementos {

    public static void main(String[] args) {
        List<Funcionario> nomes = new ArrayList<>();
        nomes.add(new Funcionario("Joao Schrock"));


        Funcionario f = RetiraElementos.recuperarPrimeiro(nomes);
        System.out.println(f.getNome());
    }
}
