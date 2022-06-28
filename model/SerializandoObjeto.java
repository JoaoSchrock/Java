package model;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializandoObjeto {

    public static void main(String[] args) throws IOException {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joao silva");
        pessoa.setIdade(25);
        pessoa.setProfissao("Motorista");

        try (ObjectOutput out = new ObjectOutputStream(Files.newOutputStream(Paths.get("João.obj")))){
            out.writeObject(pessoa);
            System.out.println("Objeto salvo com sucesso.");
        }catch (IOException e){
            System.out.println("Erro salvando o Objeto. " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
