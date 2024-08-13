package br.com.alura.screenmatch.testes.modelos;

public class VerificadorPrimo extends NumerosPrimos {

    // Método específico para a subclasse VerificadorPrimo
    public void verificarSeEhPrimo(int numero) {
        if (verificarPrimalidade(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
