public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoPLano;
    double somaAvaliacoes;
    int totalAvaliacoes;
    int duracaoMinutos;


    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Duração em minutos: " + duracaoMinutos);
    }

    void avaliaFilme(double nota) {
        totalAvaliacoes++;
        somaAvaliacoes += nota;
    }

    double retornaMedia() {
        return somaAvaliacoes / totalAvaliacoes;
    }
}