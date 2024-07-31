package br.com.alura.screenmatch.testes;

import br.com.alura.screenmatch.testes.modelos.Livro;

public class TesteLivro {
    public static void main(String[] args) {
        // Criando instâncias dos livros
        Livro livro1 = new Livro("Lógica de Programação", "Paulo Silveira");
        Livro livro2 = new Livro("A lógica do jogo", "Marcus Becker");

        // Exibindo os detalhes dos livros
        exibeDetalhesLivro(livro1, 1);
        exibeDetalhesLivro(livro2, 2);
    }

    // Método auxiliar para exibir os detalhes dos livros
    private static void exibeDetalhesLivro(Livro livro, int numeroLivro) {
        System.out.println("\nLivro " + numeroLivro + " ===================");
        livro.exibeDetalhes();
    }
}
