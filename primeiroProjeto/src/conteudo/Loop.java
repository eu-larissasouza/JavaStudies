package conteudo;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0, notaAvaliacao = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme  ");
            notaAvaliacao = leitura.nextDouble();
            mediaAvaliacao +=notaAvaliacao;
        }
        System.out.println("Média de avaliações " + mediaAvaliacao/3);
    }
}