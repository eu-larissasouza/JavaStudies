import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
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

        System.out.println();

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();

        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Tempo para maratonar Lost: " + lost.getDuracaoEmMinutos());

        System.out.println();

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        outroFilme.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.incluiTempo(meuFilme);
        calculadora.incluiTempo(outroFilme);
        calculadora.incluiTempo(lost);

        System.out.println("\nTempo para maratonar todos os titulos: " +calculadora.getTempoTotal());

        System.out.println();

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        System.out.println("Filme: "+ meuFilme.getNome());
        filtro.filtra(meuFilme);

        System.out.println();

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);

        System.out.println("Episodio "+episodio.getNumero()+" da série "+ episodio.getSerie().getNome());
        filtro.filtra(episodio);
    }
}