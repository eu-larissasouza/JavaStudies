package exercs;

public class ConversaoDolar {
    public static void main(String[] args) {
        double valorEmDolares = 15.99, cotacao = 4.94;
        double valorEmReais = valorEmDolares * cotacao;

        String mensagem  = String.format("""
                CONVERSÃO DÓLAR --------------------
                - Valor em Dólares: $ %.2f
                - Cotação: %.2f
                - Valor em Reais: R$ %.2f
                """, valorEmDolares, cotacao, valorEmReais);
        System.out.println(mensagem);
    }
}
