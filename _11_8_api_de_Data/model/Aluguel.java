package _11_8_api_de_Data.model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Aluguel {

    private Cliente cliente;
    private Carro  carro;
    private LocalDateTime dataEHoraDaRetirada;
    private LocalDateTime dataeHoraPrevistaParaDevolucao;
    private LocalDateTime dataeHoraRealDadevolucao;

    public Aluguel(Cliente cliente, Carro carro, LocalDateTime dataEHoraDaRetirada, LocalDateTime dataeHoraPrevistaParaDevolucao) {
        this.cliente = cliente;
        this.carro = carro;
        this.dataEHoraDaRetirada = dataEHoraDaRetirada;
        this.dataeHoraPrevistaParaDevolucao = dataeHoraPrevistaParaDevolucao;
        this.dataeHoraRealDadevolucao = dataeHoraRealDadevolucao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public LocalDateTime getDataEHoraDaRetirada() {
        return dataEHoraDaRetirada;
    }

    public void setDataEHoraDaRetirada(LocalDateTime dataEHoraDaRetirada) {
        this.dataEHoraDaRetirada = dataEHoraDaRetirada;
    }

    public LocalDateTime getDataeHoraPrevistaParaDevolucao() {
        return dataeHoraPrevistaParaDevolucao;
    }

    public void setDataeHoraPrevistaParaDevolucao(LocalDateTime dataeHoraPrevistaParaDevolucao) {
        this.dataeHoraPrevistaParaDevolucao = dataeHoraPrevistaParaDevolucao;
    }

    public LocalDateTime getDataeHoraRealDadevolucao() {
        return dataeHoraRealDadevolucao;
    }

    public void setDataeHoraRealDadevolucao(LocalDateTime dataeHoraRealDadevolucao) {
        this.dataeHoraRealDadevolucao = dataeHoraRealDadevolucao;
    }

    public void imprimirFatura(){
        Duration duration = Duration.between(dataeHoraPrevistaParaDevolucao,dataeHoraRealDadevolucao);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Fatura >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        if (!duration.isNegative()){
            double multa = duration.toHours() * carro.getValorDiaria() * 0.1;
            System.out.printf("Valor Da multa: R$ %.2f. Pois você atrasou %d dias.", multa,duration.toHours());
        }else {
            System.out.println("Obrigado. Voce foi pontual");
        }
    }

}
