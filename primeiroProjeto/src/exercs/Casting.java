package exercs;

public class Casting {
    public static void main(String[] args) {
        double numDecimal = 4.656;
        int numInteiro = (int) numDecimal;

        String mensagem = String.format("O número %.3f equivale a %d ao ser feito o casting para inteiro", numDecimal, numInteiro);
        System.out.println(mensagem);
    }
}
