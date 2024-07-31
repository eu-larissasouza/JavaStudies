package br.com.alura.screenmatch.testes;

import br.com.alura.screenmatch.testes.modelos.Pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        // Criando uma instância de Pessoa
        Pessoa pessoa = new Pessoa("Rachel", 21);

        // Exibindo os detalhes da pessoa
        exibeDetalhesPessoa(pessoa);
    }

    // Método auxiliar para exibir os detalhes da pessoa
    private static void exibeDetalhesPessoa(Pessoa pessoa) {
        System.out.println("\nPessoa ===================");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        pessoa.verificarIdade();
    }
}
