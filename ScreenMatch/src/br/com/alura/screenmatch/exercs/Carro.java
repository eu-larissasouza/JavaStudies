package br.com.alura.screenmatch.exercs;

public class Carro {
   String modelo;
   int ano;
   String cor;

   void exibeFichaTecnica() {
      System.out.println("Modelo do carro: " + modelo);
      System.out.println("Ano de fabricação: " + ano);
      System.out.println("Cor: " + cor);
   }

   int calculaIdade() {
      return 2024 - ano;
   }

   public static void main(String[] args) {
      Carro meuCarro = new Carro();

      meuCarro.modelo = "Gol";
      meuCarro.ano = 2023;
      meuCarro.cor = "Preto";

      meuCarro.exibeFichaTecnica();
      System.out.println("Idade do carro: " + meuCarro.calculaIdade() + " anos");
   }
}