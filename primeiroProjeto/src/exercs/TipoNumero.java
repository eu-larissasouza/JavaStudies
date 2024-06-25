package exercs;

import java.util.Scanner;

public class TipoNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número Par.");
        } else {
            System.out.println("Número Ímpar.");
        }
    }
}
