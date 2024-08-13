package br.com.alura.screenmatch.testes;

import br.com.alura.screenmatch.testes.modelos.Cachorro;
import br.com.alura.screenmatch.testes.modelos.Gato;

public class TesteAnimal{
    public static void main(String[] args) {
        Cachorro floquinho = new Cachorro();
        floquinho.defineNome("Floquinho");
        floquinho.exibirDetalhes();
        floquinho.emitirSom();
        floquinho.abanarRabo();

        Gato felix = new Gato();
        felix.defineNome("Felix");
        felix.exibirDetalhes();
        felix.emitirSom();
        felix.arranharMoveis();
    }
}