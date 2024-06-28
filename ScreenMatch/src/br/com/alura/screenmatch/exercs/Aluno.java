package br.com.alura.screenmatch.exercs;

public class Aluno {
    String nome;
    int idade;

    void exibeInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        Aluno meuAluno = new Aluno();
        meuAluno.nome = "Akemi";
        meuAluno.idade = 18;

        meuAluno.exibeInformacoes();
    }
}