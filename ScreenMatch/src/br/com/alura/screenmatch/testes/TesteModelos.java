package br.com.alura.screenmatch.testes;

import br.com.alura.screenmatch.testes.modelos.*;

import java.text.DecimalFormat;

public class TesteModelos {
    static DecimalFormat df = new DecimalFormat("##0.00");

    public static void main(String[] args) {
        exibeContaBancaria();
        exibePessoa();
        exibeProduto();
        exibeAluno();
        exibeLivro();
    }

    public static void exibeContaBancaria() {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Felca";
        conta.setNumeroConta(50425);
        conta.setSaldo(2250.90);

        System.out.println("\nConta Bancária ===================");
        System.out.println("Titular: " + conta.titular);
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: R$" + df.format(conta.getSaldo()));
    }

    public static void exibePessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Rachel");
        pessoa.setIdade(21);

        System.out.println("\nPessoa ===================");
        pessoa.verificarIdade();
    }

    public static void exibeProduto() {
        Produto produto = new Produto();
        produto.setNome("Ventilador Mondial");
        produto.setPreco(320.00);

        System.out.println("\nProduto ===================");
        produto.aplicarDesconto(15);
    }

    public static void exibeAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome("Larissa");
        aluno.setNota1(6.5);
        aluno.setNota2(9.5);
        aluno.setNota3(7.0);

        System.out.println("\nAluno ===================");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Média: " + df.format(aluno.calculaMedia()));
        System.out.println();
    }

    public static void exibeLivro() {
        Livro livro1 = new Livro();
        livro1.setTitulo("Lógica de Programação");
        livro1.setAutor("Paulo Silveira");

        Livro livro2 = new Livro();
        livro2.setTitulo("A lógica do jogo");
        livro2.setAutor("Marcus Becker");

        System.out.println("\nLivro 1 ===================");
        livro1.exibeDetalhes();
        System.out.println("\nLivro 2 ===================");
        livro2.exibeDetalhes();
    }
}
