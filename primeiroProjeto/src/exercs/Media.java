package exercs;

public class Media {
    public static void main(String[] args) {
        double nota1, nota2, media;

        nota1 = 8;
        nota2 = 5;
        media = (nota1 + nota2) / 2;

        String mensagem = String.format("""
                CÁLCULO MÉDIA ------------
                Nota 1: %.2f
                Nota 2: %.2f
                Média: %.2f""", nota1, nota2, media);
        System.out.println(mensagem);
    }
}
