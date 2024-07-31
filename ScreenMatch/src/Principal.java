import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.avalia(9);
        meuFilme.avalia(8.4);

        DecimalFormat df = new DecimalFormat("##0.00");
        System.out.println("Total de Avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println("Média das Avaliações: " + df.format(meuFilme.retornaMedia()));

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();

        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluiTempo(meuFilme);
        calculadora.incluiTempo(outroFilme);
        calculadora.incluiTempo(lost);
        System.out.println(calculadora.getTempoTotal());
    }
}