package conteudo;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito:");
        String filme = leitura.nextLine();

        System.out.println("Digite o ano de Lançamento: ");
        int anoLancamento  = leitura.nextInt();

        System.out.println("Diga sua avaliação para o filme: ");
        double notaAvaliacao = leitura.nextDouble();

        System.out.println("Filme: "+ filme);
        System.out.println("Ano de Lançamento: "+ anoLancamento);
        System.out.println("Nota de avaliação: "+ notaAvaliacao);

        leitura.close();
    }
}
