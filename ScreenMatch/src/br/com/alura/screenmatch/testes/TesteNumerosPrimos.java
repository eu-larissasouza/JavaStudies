package br.com.alura.screenmatch.testes;

import br.com.alura.screenmatch.testes.modelos.GeradorPrimo;
import br.com.alura.screenmatch.testes.modelos.NumerosPrimos;
import br.com.alura.screenmatch.testes.modelos.VerificadorPrimo;

public class TesteNumerosPrimos {

    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(29);
        verificador.verificarSeEhPrimo(30);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(29);
        System.out.println("Próximo primo após 29: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(50);
    }
}
