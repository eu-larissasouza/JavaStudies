package exercs;

public class VendaValor {
    public static void main(String[] args) {
        double precoProduto = 5.60;
        int quantidade = 12;

        double valorTotal = precoProduto * quantidade;

        String mensagem  = String.format("""
                PRODUTO LEITE --------------------
                - Preço: R$ %.2f
                - Quantidade: %d
                - Valor Total: R$ %.2f
                """, precoProduto, quantidade, valorTotal);
        System.out.println(mensagem);
    }
}
