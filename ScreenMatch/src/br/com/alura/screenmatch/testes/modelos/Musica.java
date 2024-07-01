package br.com.alura.screenmatch.testes.modelos;

import java.text.DecimalFormat;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacoes;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    void avaliaMusica(double nota) {
        somaAvaliacoes += nota;
        numAvaliacoes++;
    }

    double retornaMedia() {
        return somaAvaliacoes / numAvaliacoes;
    }

    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Drama";
        minhaMusica.artista = "Aespa";
        minhaMusica.anoLancamento = 2023;

        minhaMusica.exibeFichaTecnica();

        minhaMusica.avaliaMusica(7.5);
        minhaMusica.avaliaMusica(6.5);
        minhaMusica.avaliaMusica(5.5);

        DecimalFormat df = new DecimalFormat("##0.00");

        double mediaAvaliacoes = minhaMusica.retornaMedia();
        System.out.println("Média das avaliações: " + df.format(mediaAvaliacoes));
    }

}
