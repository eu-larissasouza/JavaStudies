package br.com.alura.screenmatch.testes;

import br.com.alura.screenmatch.testes.modelos.Produto;

import java.text.DecimalFormat;

public class TesteProduto {
    // Formatação para exibir o preço com duas casas decimais
    static DecimalFormat df = new DecimalFormat("R$ ##0.00");

    public static void main(String[] args) {
        // Criando uma instância de Produto e configurando seus atributos
        Produto produto = new Produto("Ventilador Mondial", 320.00);

        // Aplicando um desconto ao produto
        produto.aplicarDesconto(15);

        // Exibindo os detalhes do produto
        exibeDetalhesProduto(produto);
    }

    // Método auxiliar para exibir os detalhes do produto
    private static void exibeDetalhesProduto(Produto produto) {
        System.out.println("\nProduto ===================");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço original: " + df.format(produto.getPrecoOriginal()));
        System.out.println("Preço com desconto: " + df.format(produto.getPrecoComDesconto()));
    }
}
