package exercs;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tempCelsius, tempFahrenheit;

        System.out.println("Informe a temperatura em Celsius: ");
        tempCelsius = sc.nextInt();
        tempFahrenheit = (tempCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %.2f Celsius é equivalente a %.2f Fahrenheit", tempCelsius, tempFahrenheit);
        System.out.println(mensagem);

        int intFahrenheit = (int) tempFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + intFahrenheit);


    }
}

