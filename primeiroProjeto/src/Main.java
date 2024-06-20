//Declarando classes - Convenção PascalCase
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Aquamarine");

        // Declarando Variáveis - Convenção camelCase
        // Maioria das empresas usa as variaveis em inglês, não é o caso do curso.
        int anoLancamento;
        anoLancamento = 2006;

        System.out.println("Ano de Lançamento: "+anoLancamento);

        boolean incluidoPlano = true;
        double notaFilme = 8.1;

        double mediaAvaliacoes = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Media: "+mediaAvaliacoes);

        String sinopse;
        sinopse = "Dois amigas ajudam uma sereia a encontrar o amor em uma piscina, após uma tempestade.";

        System.out.println(sinopse);
    }
}