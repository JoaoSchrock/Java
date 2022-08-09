package _11_8_api_de_Data.exemplos;

import _11_8_api_de_Data.model.Aluguel;
import _11_8_api_de_Data.model.Carro;
import _11_8_api_de_Data.model.Cliente;

import java.time.*;

public class Devolucaocarro {
    public static void main(String[] args) {
        Aluguel aluguel = recuperarAluguel();

        LocalDateTime dataEHoraRealDaDevolucao = LocalDateTime.of(LocalDate.now().plusDays(5), LocalTime.now());
        aluguel.setDataeHoraRealDadevolucao(dataEHoraRealDaDevolucao);
        aluguel.imprimirFatura();
    }

    private static Aluguel recuperarAluguel() { Cliente cliente =  new Cliente("joao Silva", LocalDate.of(1985,
            Month.FEBRUARY,8));
        Carro carro = new Carro("Gol",90.0, Year.of(2012));

        LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(),
                LocalTime.of(LocalTime.now().getHour(), 0));
        LocalDateTime dataEHoraPrevistaParaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);

        Aluguel aluguel = new Aluguel(cliente, carro ,dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);
        return aluguel;
    }


}

