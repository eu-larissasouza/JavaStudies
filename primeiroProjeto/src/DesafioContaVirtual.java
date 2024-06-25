package exercs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DesafioContaVirtual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat moeda = new DecimalFormat("R$ ##0.00");

        String nomeCliente = "João Silvestre", tipoConta = "Corrente";
        double saldo = 2500;

        System.out.println("********************************");
        System.out.println("DADOS INICIAIS DO CLIENTE:\n");
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo Inicial: " + moeda.format(saldo));
        System.out.println("********************************");

        int escolha = 0;

        while (escolha != 4) {
            System.out.println("""
                                        
                    Operações
                                        
                    1- Consultar Saldo
                    2- Realizar Depósito
                    3- Realizar Transferência
                    4- Sair
                    """);
            System.out.print("Digite a opção desejada: ");
            escolha = sc.nextInt();

            if (escolha == 1) {
                System.out.println("O saldo atual é: " + moeda.format(saldo));
            } else if (escolha == 2) {
                double valorDepositado = 0;

                System.out.print("Informe o valor que deseja depositar: ");
                valorDepositado = sc.nextDouble();

                saldo += valorDepositado;
                System.out.println("\nO saldo atualizado é: " + moeda.format(saldo));
            } else if (escolha == 3) {
                double valorTransferido = 0;

                System.out.print("Informe o valor que deseja transferir: ");
                valorTransferido = sc.nextDouble();

                if (valorTransferido > saldo) {
                    System.out.println("Não há saldo suficiente para fazer essa transferência!");
                } else {
                    saldo -= valorTransferido;
                    System.out.println("\nO saldo atualizado é: " + moeda.format(saldo));
                }
            } else if (escolha == 4) {
                System.out.println("Fechando aplicativo...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente!");
            }
        }

    }
}
