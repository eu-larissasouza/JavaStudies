package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoLancamento;
    private boolean incluidoPLano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoMinutos;

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Duração em minutos: " + duracaoMinutos);
    }

    public void avaliaFilme(double nota) {
        totalAvaliacoes++;
        somaAvaliacoes += nota;
    }

    public double retornaMedia() {
        return somaAvaliacoes / totalAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoPLano(boolean incluidoPLano) {
        this.incluidoPLano = incluidoPLano;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }
}