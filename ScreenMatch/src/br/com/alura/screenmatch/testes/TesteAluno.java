package br.com.alura.screenmatch.testes;

import br.com.alura.screenmatch.testes.modelos.Aluno;
import java.text.DecimalFormat;

public class TesteAluno {
    // Formatação para exibir as notas e a média com duas casas decimais
    static DecimalFormat df = new DecimalFormat("##0.00");

    public static void main(String[] args) {
        // Criando uma instância de Aluno com notas específicas
        Aluno aluno = new Aluno("Larissa", 6.5, 9.5, 7.0);

        // Exibindo os detalhes do aluno
        exibeDetalhesAluno(aluno);
    }

    // Método auxiliar para exibir os detalhes do aluno
    private static void exibeDetalhesAluno(Aluno aluno) {
        System.out.println("\nAluno ===================");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota 1: " + df.format(aluno.getNota1()));
        System.out.println("Nota 2: " + df.format(aluno.getNota2()));
        System.out.println("Nota 3: " + df.format(aluno.getNota3()));
        System.out.println("Média: " + df.format(aluno.calculaMedia()));
    }
}
