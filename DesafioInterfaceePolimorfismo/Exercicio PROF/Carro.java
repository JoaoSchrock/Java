package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2._5_24_exercicio_interface_e_polimorfismo;

public class Carro implements Seguravel{

    private double valorMercado;

    private int anoFabricacao;

    public Carro(double valorMercado, int anoFabricacao) {
        this.valorMercado = valorMercado;
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String obterDescricao() {
        return "Carro ano " + this.anoFabricacao + " com valor de mercado " + this.valorMercado;
    }

    @Override
    public double calcularValorApolice() {
        double valorApolice = this.valorMercado * 0.04;
        if (anoFabricacao < 2000) {
            valorApolice = valorApolice * 0.90;
        }
        return valorApolice;
    }
}
