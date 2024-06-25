package exercs;

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("Número Positivo.");
        } else {
            System.out.println("Número Negativo.");
        }
    }
}
