package br.com.alura.screenmatch.explicacao;

import br.com.alura.screenmatch.explicacao.poo.Caiaque;
import br.com.alura.screenmatch.explicacao.poo.Iate;
import br.com.alura.screenmatch.explicacao.poo.Lancha;
import br.com.alura.screenmatch.explicacao.poo.Repositorio;

public class TesteBarco {
    public static void main(String[] args) {
        Iate iate = new Iate();
        Lancha lancha = new Lancha();
        Caiaque caiaque = new Caiaque();

        Repositorio repo = new Repositorio();

        repo.despachaBarco(iate);
        repo.despachaBarco(lancha);
        repo.despachaBarco(caiaque);
    }
}
