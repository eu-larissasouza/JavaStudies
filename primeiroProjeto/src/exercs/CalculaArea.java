package exercs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##0.00");

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("\n\nMenu - Calcula Área -----------------");
            System.out.println("================================");
            System.out.println("1. Calcular Área do Quadrado");
            System.out.println("2. Calcular Área do Círculo");
            System.out.println("3. Encerrar programa");
            System.out.println("================================");

            System.out.print("\nEscolha uma opção: ");
            escolha = sc.nextInt();

            if (escolha == 1) {
                System.out.println("\nÁrea do Quadrado");
                System.out.print("Informe a medida do lado do quadrado: ");
                double lado = sc.nextDouble();

                double area = Math.pow(lado, 2);
                System.out.println("Área: " + df.format(area));
            } else if (escolha == 2) {
                System.out.println("\nÁrea do Círculo");
                System.out.print("Informe a medida do raio do círculo: ");
                double raio = sc.nextDouble();

                double area = Math.PI * Math.pow(raio, 2);
                System.out.println("Área: " + df.format(area));
            } else if (escolha == 3) {
                System.out.println("Encerrando programa...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente!");
                System.out.print("\nEscolha uma opção: ");
                escolha = sc.nextInt();
            }
        }

    }
}
