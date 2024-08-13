package br.com.alura.screenmatch.testes.modelos;

public class Cachorro extends Animal {

    public void abanarRabo(){
        System.out.println(super.getNome() +" está abanando o rabo.\n");
    }

    @Override
    public void emitirSom(){
        System.out.println("Au, au, au...");
    }
}
