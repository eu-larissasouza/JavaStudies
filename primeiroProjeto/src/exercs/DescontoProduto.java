package exercs;

public class DescontoProduto {
    public static void main(String[] args) {
        double precoOriginal = 145.99;
        int percDesconto = 24;
        double novoPreco = precoOriginal - (precoOriginal * ((double) percDesconto /100 ));

        String mensagem  = String.format("""
                DESCONTO DO PRODUTO --------------------
                - Produto: Nike AirMax 90
                - Preço Original: R$ %.2f
                - Desconto: %d%%
                - Novo Preço: R$ %.2f
                """, precoOriginal, percDesconto, novoPreco);
        System.out.println(mensagem);
    }
}
