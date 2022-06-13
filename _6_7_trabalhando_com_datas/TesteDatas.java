package _6_7_trabalhando_com_datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDatas {
    public static void main(String[] args) {

        Date hoje = new Date();// Bom, mas visualmente e melhor o de baixo.
        System.out.println(hoje);

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");//Formatados oque queremos ver no Resultado.
        System.out.println(formatador.format(hoje));

        String dataAniversario = "01/08/2004";
        DateFormat formatador2 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date aniversario = formatador2.parse(dataAniversario);
            System.out.println(formatador2.format(aniversario));
        }catch (ParseException e){
            System.out.println("Formato de data inválido");
        }
    }
}
