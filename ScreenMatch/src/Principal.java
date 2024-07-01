import br.com.alura.screenmatch.modelos.Filme;

import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoMinutos(180);

        meuFilme.exibeFichaTecnica();

        meuFilme.avaliaFilme(9);
        meuFilme.avaliaFilme(8.4);

        DecimalFormat df = new DecimalFormat("##0.00");
        System.out.println("Total de Avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println("Média das Avaliações: " + df.format(meuFilme.retornaMedia()));

    }
}