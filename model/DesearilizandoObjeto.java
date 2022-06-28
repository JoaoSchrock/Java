package model;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DesearilizandoObjeto {
    public static void main(String[] args) {
        try (ObjectInput in = new ObjectInputStream(Files.newInputStream(Paths.get("Joao.obj")))) {
            Pessoa p = (Pessoa) in.readObject();
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
            System.out.println("Profissão: " + p.getProfissao());

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("Erro convertendo para classe Pessoa ");
            e.printStackTrace();
            throw new RuntimeException(e);

        }
    }
}
