package br.com.alura.screenmatch.testes.modelos;

public class NumerosPrimos {
    public boolean verificarPrimalidade(int numero) {
        if (numero <= 1) {
            return false;
        } else if (numero == 2 || numero == 3) {
            return true;
        } else if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public void listarPrimos(int limite) {
        for (int i = 2; i <= limite; i++) {
            if (verificarPrimalidade(i)) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }
}
