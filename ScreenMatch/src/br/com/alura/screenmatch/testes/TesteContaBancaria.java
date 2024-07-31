package br.com.alura.screenmatch.testes;

import br.com.alura.screenmatch.testes.modelos.ContaBancaria;
import java.text.DecimalFormat;

public class TesteContaBancaria {
    // Formatação para exibir o saldo com duas casas decimais
    static DecimalFormat df = new DecimalFormat("##0.00");

    public static void main(String[] args) {
        // Criando uma instância de ContaBancaria e configurando seus atributos
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Felca";
        conta.setNumeroConta(50425);
        conta.setSaldo(2250.90);

        // Exibindo os detalhes da conta bancária
        exibeDetalhesConta(conta);
    }

    // Método auxiliar para exibir os detalhes da conta bancária
    private static void exibeDetalhesConta(ContaBancaria conta) {
        System.out.println("\nConta Bancária ===================");
        System.out.println("Titular: " + conta.titular);
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: R$" + df.format(conta.getSaldo()));
    }
}
