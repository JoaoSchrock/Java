package _11_8_api_de_Data.exemplos;

import _11_8_api_de_Data.model.Aluguel;
import _11_8_api_de_Data.model.Carro;
import _11_8_api_de_Data.model.Cliente;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class NovoAluguel {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Joao Silva", LocalDate.of(2004, Month.AUGUST, 8));
        Carro carro = new Carro("Gol", 90.0, Year.of(2012));

        LocalDateTime dataEHoraDaretirada = LocalDateTime.of(LocalDate.now(),
                LocalTime.of(LocalTime.now().getHour(), 0));

        LocalDateTime dataEHoraPrevistaParaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);

        Aluguel aluguel = new Aluguel(cliente, carro, dataEHoraDaretirada, dataEHoraPrevistaParaDevolucao);

        imprimirRecibo(aluguel);
    }

    private static void imprimirRecibo(Aluguel aluguel) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> RECIBO <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("Carro: " + aluguel.getCarro().getModelo());
        System.out.println("Cliente: " + aluguel.getCliente().getNome());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Data e Hora da Retirada: " + aluguel.getDataEHoraDaRetirada().format(formatter));
        System.out.println("Data e hora prevista para devolucao: " + aluguel.getDataeHoraPrevistaParaDevolucao().format(formatter));
    }
}
