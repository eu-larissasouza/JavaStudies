package br.com.alura.screenmatch.testes.modelos;

import java.text.DecimalFormat;

public class Carro {
    private String nomeModelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public Carro() {

    }

    public void defineNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public void definePrecosMedios(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public double calculaMaiorPreco() {
        double maiorPreco = precoAno1;
        if (precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        }
        if (precoAno3 > maiorPreco) {
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }

    public double calculaMenorPreco() {
        double menorPreco = precoAno1;
        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        }
        if (precoAno3 < menorPreco) {
            menorPreco = precoAno3;
        }
        return menorPreco;
    }

    public void exibirDetalhes(){
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

        System.out.println("Modelo: "+nomeModelo);
        System.out.println("Maior Preço: " +df.format(calculaMaiorPreco()));
        System.out.println("Menor Preço: " +df.format(calculaMenorPreco()));
    }

}