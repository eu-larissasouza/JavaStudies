package br.com.alura.screenmatch.testes.modelos;

public class Animal {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void defineNome(String nome) {
        this.nome = nome;
    }

    public void exibirDetalhes(){
        System.out.println("Nome do animal: " + nome);
        System.out.println("Tipo de animal: " + this.getClass().getSimpleName());
    }

    public void emitirSom() {
        System.out.println("O animal está emitindo um som.");
    }
}
