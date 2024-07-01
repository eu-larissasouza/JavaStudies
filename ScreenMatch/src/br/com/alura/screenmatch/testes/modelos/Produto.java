package br.com.alura.screenmatch.testes.modelos;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual) {
        System.out.println("Nome: " + nome);
        System.out.println("Preço inicial: " + preco);

        preco = preco * (1 - (percentual / 100));
        System.out.println("Novo Preço: " + preco);
    }
}