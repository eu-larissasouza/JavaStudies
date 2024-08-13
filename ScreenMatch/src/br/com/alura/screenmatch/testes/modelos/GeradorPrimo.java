package br.com.alura.screenmatch.testes.modelos;

public class GeradorPrimo extends NumerosPrimos {
    // Método específico para a subclasse GeradorPrimo
    public int gerarProximoPrimo(int numero) {
        int proximo = numero + 1;
        while (!verificarPrimalidade(proximo)) {
            proximo++;
        }
        return proximo;
    }
}
