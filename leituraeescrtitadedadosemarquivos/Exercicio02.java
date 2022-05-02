package leituraeescrtitadedadosemarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/*
Mostre a lista de tarefas para o usuário
 */
public class Exercicio02 {
    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get("C:\\Users\\aluno.LABCETEC\\Desktop\\Tarefas.txt");
        List<String> Lista = Files.readAllLines(arquivo);
        for(int i = 0; i< Lista.size(); i++){
            String nome = Lista.get(i);
            System.out.println("Tarefas: " + nome);
        }
    }
}
