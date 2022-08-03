package _11_8_api_de_data.exemplos;

import _11_8_api_de_data.model.Cliente;

import java.time.LocalDate;
import java.time.Month;

public class CadastroCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Joao Schrock", LocalDate.of(2004, Month.AUGUST,01));

        

    }
}
