package _6_4_tratando_e_lancando_excecoes;

public class ContaCorrente {

    private double saldo;

    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }
    public void depositar(double deposito){
        if(deposito <= 0){
            throw  new IllegalArgumentException("O valor nao pode ser menor que zero");
        }
        saldo += deposito;
    }
    public void sacar(double quantidade) throws  SaldoInsuficienteException{
        double saldotemp = saldo - quantidade;
        if(saldotemp < 0){
            throw new SaldoInsuficienteException("Voce nao possui saldo suficiente");
        }
        saldo -= quantidade;
    }

    public double getSaldo(){return saldo;}

    }

