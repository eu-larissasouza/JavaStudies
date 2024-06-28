package br.com.alura.screenmatch.exercs;

public class Calculadora {

    int calculaDobro(int numero) {
        return numero * 2;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultado = calc.calculaDobro(5);
        System.out.println("Dobro: " + resultado);
    }
}
