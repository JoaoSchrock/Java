package _9_2_enviando_objetos_na_rede;

import javax.swing.*;
import java.io.*;
import java.net.Socket;
import java.time.format.DateTimeFormatter;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192,168,0,1",3333);

        OutputStream saida = socket.getOutputStream();
        ObjectOutput objectOutput = new ObjectOutputStream(saida);


        Pedido pedido = new Pedido();
        pedido.setCodigo(2L);
        pedido.setDescricao("pasta de dente");
        pedido.setQuantidade(2);

        objectOutput.writeObject(pedido);

        InputStream entrada = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(entrada);
        System.out.println("Recebeu ao Servidor: " + dataInputStream.readUTF());

        socket.close();

    }
}
