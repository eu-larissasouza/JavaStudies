package exercs;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0, fatorial = 1;

        System.out.print("Informe um número natural: ");
        numero = sc.nextInt();

        while (numero <= 0) {
            System.out.println("Número inválido. Tente novamente!");
            System.out.print("Informe um número natural: ");
            numero = sc.nextInt();
        }

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        
        System.out.println("Fatorial de " + numero + "é: " + fatorial);
    }
}
