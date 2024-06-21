package conteudo;

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0, notaAvaliacao = 0;
        int totalDeNotas = 0;

        while (notaAvaliacao != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar  ");
            notaAvaliacao = leitura.nextDouble();

            if (notaAvaliacao != -1) {
                mediaAvaliacao +=  notaAvaliacao;
                totalDeNotas++;
            }

        }

        System.out.println("Média de avaliações " + mediaAvaliacao / totalDeNotas);
    }
}