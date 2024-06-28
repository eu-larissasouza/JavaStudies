import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoLancamento = 1970;
        meuFilme.duracaoMinutos = 180;

        meuFilme.exibeFichaTecnica();

        meuFilme.avaliaFilme(9);
        meuFilme.avaliaFilme(8.4);

        DecimalFormat df = new DecimalFormat("##0.00");
        System.out.println("Média das Avaliações: " + df.format(meuFilme.retornaMedia()));

    }
}