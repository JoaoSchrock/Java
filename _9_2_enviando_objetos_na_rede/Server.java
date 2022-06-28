package _9_2_enviando_objetos_na_rede;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket server = new ServerSocket(3333);

        System.out.println("Aguardando conexao....");
        Socket socket = server.accept();
        System.out.println("Conectado a: " + socket.getRemoteSocketAddress());

        InputStream entrada = socket.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(entrada);

        Pedido pedido = (Pedido) objectInputStream.readObject();
        System.out.println("codigo: " + pedido.getCodigo());
        System.out.println("Descricao: " + pedido.getDescricao());
        System.out.println("Quantidade: " + pedido.getQuantidade());

        OutputStream saida = socket.getOutputStream();
        DataOutputStream dataOutput = new DataOutputStream(saida);
        dataOutput.writeUTF("Recebido com sucesso!");

        server.close();
    }

}