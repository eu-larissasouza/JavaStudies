package br.com.alura.screenmatch.testes;

import br.com.alura.screenmatch.testes.modelos.ModeloCarro;

public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro fusca = new ModeloCarro();
        fusca.defineNomeModelo("Fusca");
        fusca.definePrecosMedios(10000, 12000, 15000);

        fusca.exibirDetalhes();
    }

}
