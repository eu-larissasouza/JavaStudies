package br.com.alura.screenmatch.explicacao.poo;

public class Caiaque extends Barco {
    private int quantidadeLugares;

    public void rema() {
        System.out.println("Remando...");
    }

    @Override
    public void flutua() {
        System.out.println("O caiaque está flutuando de uma forma diferente...");
    }
}
