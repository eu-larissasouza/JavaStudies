package exercs;

import java.util.Scanner;

public class ComparaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Informe o primeiro número inteiro: ");
        num1 = sc.nextInt();

        System.out.print("Informe o segundo número inteiro: ");
        num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("\nOs números são iguais");
        } else if (num1 > num2) {
            System.out.println("\nO número " + num1 + " é maior que "
                    + num2);
        } else {
            System.out.println("\nO número" + num2 + " é maior que " + num1);
        }
    }
}