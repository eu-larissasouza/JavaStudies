package br.com.alura.screenmatch.testes.modelos;

public class Gato extends Animal{

    public void arranharMoveis(){
        System.out.println(super.getNome() + " está arranhando os móveis.\n");
    }

    @Override
    public void emitirSom(){
        System.out.println("Miau, miau, miau...");
    }
}