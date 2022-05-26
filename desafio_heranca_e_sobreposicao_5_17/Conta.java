package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.desafio_heranca_e_sobreposicao_5_17;

public class Conta {
    protected SituacaoConta situacaoConta;
    private  String descricao;
    private Double valor;
    private String dataVencimento;

    public Conta() {
        this.situacaoConta = SituacaoConta.PENDENTE;
    }

    public  void cancelar(){
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())){
            System.out.println("Não pode cancelar uma conta que já foi paga: " + this.getDescricao() + ".");
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode cancelar uma conta que já foi cancelada: " + this.getDescricao() + ".");
        } else {
            System.out.println("Cancelando conta " + this.getDescricao() + ".");
            this.situacaoConta = SituacaoConta.CANCELADA;
        }
    }

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
