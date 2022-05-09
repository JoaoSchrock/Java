package OrientacaoAobjetoParte2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TesteConstrutor {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 22,"199.345.234.23");
        System.out.println("Nome: \"" + p1.nome + "\" tem " + p1.idade + " anos .\nPortador do CPF: " + p1.cpf);

        Pessoa p2 = new Pessoa("Maria", 33,"199.345.234.23");
        System.out.println("Nome: \"" + p2.nome + "\" tem " + p2.idade + " anos.\nPortadora do cpf: " + p2.cpf);


               }
    }


