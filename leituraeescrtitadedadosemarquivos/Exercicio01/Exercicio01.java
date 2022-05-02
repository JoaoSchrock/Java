package leituraeescrtitadedadosemarquivos;
/*
Crie uma lista de tarefas e salve a lista em um arquivo
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            System.out.print("Tarefa " + i + ": ");
            String nome = scanner.nextLine();
            lista.add(nome);
        }
        Path arquivos = Paths.get("C:\\Users\\aluno.LABCETEC\\Desktop\\Tarefas.txt");
        Files.write(arquivos, lista);

        scanner.close();
        System.out.println("fim");
    }
}

