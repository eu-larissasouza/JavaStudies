package exercs;

/*


Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.


Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.

Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

 */

public class Media {
    public static void main(String[] args) {
        double nota1, nota2, media;

        nota1 = 8;
        nota2 = 5;
        media = (nota1 + nota2) / 2;

        String mensagem = String.format("""
                Nota 1: %.2f
                Nota 2: %.2f
                Média: %.2f""", nota1, nota2, media);
        System.out.println(mensagem);
    }
}
