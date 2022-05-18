package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.desafio_pacotes_e_enumeracoes_5_13;

public class ContaPagar {
    String descricao;
    Double valor;
    String dataVencimento;
    Fornecedor fornecedor;
    private SituacaoConta situacaoConta;
    public ContaPagar() {
        this.situacaoConta = SituacaoConta.PENDENTE;
    }
    public ContaPagar(String descricao, Double valor, String dataVencimento, Fornecedor fornecedor) {
        this();
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.fornecedor = fornecedor;
    }
    void pagar() {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())){
            System.out.println("Não pode pagar uma conta que já está paga: "
                + this.getDescricao() + ".");
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode pagar uma conta que está cancelada: "
                + this.getDescricao() + ".");
        } else {
            System.out.println("Pagando conta " + this.getDescricao() +
                    "no valor de " + this.getValor() +
                    "e vencimento em " + this.getDataVencimento() +
                    "do fornecedor " + this.getFornecedor().getNome() + ".");
            this.situacaoConta = SituacaoConta.PAGA;
        }
    }

    public void cancelar(){
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())){
            System.out.println("Não pode cancelar uma conta que já foi paga: "
                + this.getDescricao() + ".");
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode cancelar uma conta que já foi cancelada: "
                + this.getDescricao() + ".");
        } else {
            System.out.println("Cancelando conta " + this.getDescricao() + ".");
            this.situacaoConta = SituacaoConta.CANCELADA;
        }
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
    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }
}
