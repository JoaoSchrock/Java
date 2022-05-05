package acessando_Atributos_de_Objetos.composicaoObjetos;

import com.sun.org.apache.xerces.internal.xni.parser.XMLErrorHandler;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.cor = "Prata";
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Palio";

        meuCarro.dono = new Proprietario();
        meuCarro.dono.nome = "Joao Schrock";
        meuCarro.dono.bairro = "Centro";
    }
}
