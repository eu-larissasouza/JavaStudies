package br.com.alura.screenmatch.testes.modelos;

public class Produto {
    private String nome;
    private double precoOriginal;
    private double precoComDesconto;

    public Produto(){

    }

    public Produto(String nome, double precoOriginal) {
        this.nome = nome;
        this.precoOriginal = precoOriginal;
        this.precoComDesconto = precoOriginal;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoOriginal() {
        return precoOriginal;
    }

    public double getPrecoComDesconto() {
        return precoComDesconto;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            double desconto = precoOriginal * (percentual / 100);
            this.precoComDesconto = precoOriginal - desconto;
        }
    }
}
