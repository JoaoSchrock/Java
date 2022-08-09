package _11_8_api_de_Data.exemplos;

import _11_8_api_de_Data.model.Cliente;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CadastroCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Joao Schrock", LocalDate.of(2004, Month.AUGUST, 01));

        int idade = Period.between(cliente.getDataDeNascimento(), LocalDate.now()).getYears();

        if (idade >= 18){
            System.out.printf("ok, pode ser cadastrado. Sua idade é: %d",idade);
        }else{
            System.out.printf("Sua idade é: %d. Entao nao pode ter carteira.", idade);
        }


        

    }
}
