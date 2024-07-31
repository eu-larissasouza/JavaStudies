package br.com.alura.screenmatch.testes.modelos;

public class ContaBancaria {
    public String titular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria() {
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
