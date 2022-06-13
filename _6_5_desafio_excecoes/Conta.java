package com.company.orientacao_a_objetos._6_topicos_avancados._6_5_desafio_excecoes;

public abstract class Conta {
    protected SituacaoConta situacaoConta;
    private  String descricao;
    private Double valor;
    private String dataVencimento;

    public Conta() {
        this.situacaoConta = SituacaoConta.PENDENTE;
    }

    public abstract void exibirDetalhes();

    public  void cancelar() throws OperacaoContaException {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())){
            throw new OperacaoContaException("Não pode cancelar uma conta que já foi paga: " + this.getDescricao() + ".");
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            throw new OperacaoContaException("Não pode cancelar uma conta que já foi cancelada: " + this.getDescricao() + ".");
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
